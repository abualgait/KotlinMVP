/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/16/19 11:05 AM
 *
 */

package com.abualgait.abual.kotlinmvp.ui.main.presenter

import android.content.Context
import com.abualgait.abual.kotlinmvp.ui.base.presenter.BasePresenter
import com.abualgait.abual.kotlinmvp.ui.main.interactor.MainMVPInteractor
import com.abualgait.abual.kotlinmvp.ui.main.view.MainMVPView
import io.reactivex.disposables.CompositeDisposable
import util.ConnectivityUtil
import util.SchedulerProvider
import javax.inject.Inject

class MainPresenter<V : MainMVPView, I : MainMVPInteractor>
@Inject internal constructor(interactor: I, disposable: CompositeDisposable, schedulerProvider: SchedulerProvider)
    : BasePresenter<V, I>(interactor = interactor, compositeDisposable = disposable, schedulerProvider = schedulerProvider)
        , MainMVPPresenter<V, I> {

    lateinit var connectivityUtil: ConnectivityUtil
    override fun onAttach(view: V?) {
        super.onAttach(view)
        connectivityUtil = ConnectivityUtil()

        if (connectivityUtil.isNetworkConnected()) {
            getView()?.showLoading()
            getMoviesList()
        } else {
            getView()?.showNoIntenet()
        }
    }


    private fun getMoviesList() = interactor?.let {

        it.makeGetMoviesApiCall().compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe { blogResponse ->
                    getView()?.let {
                        it.showMovies(blogResponse.data)
                    }
                }

    }


}