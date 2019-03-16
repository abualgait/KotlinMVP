/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/16/19 11:05 AM
 *
 */

package com.abualgait.abual.kotlinmvp.ui.base.presenter

import com.abualgait.abual.kotlinmvp.ui.base.interactor.MVPInteractor
import com.abualgait.abual.kotlinmvp.ui.base.view.MVPView
import io.reactivex.disposables.CompositeDisposable
import util.SchedulerProvider

abstract class BasePresenter<V : MVPView, I : MVPInteractor> internal constructor(protected var interactor: I?, protected val compositeDisposable: CompositeDisposable,protected val schedulerProvider : SchedulerProvider) : MVPPresenter<V, I> {

    private var view: V? = null
    private val isViewAttached: Boolean get() = view != null

    override fun onAttach(view: V?) {
        this.view = view
    }

    override fun getView(): V? = view

    override fun onDetach() {
        compositeDisposable.dispose()
        view = null
        interactor = null
    }

}