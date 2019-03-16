/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/9/19 2:25 PM
 *
 */

package com.abualgait.abual.kotlinmvp.ui.main

import com.abualgait.abual.kotlinmvp.ui.main.interactor.MainInteractor
import com.abualgait.abual.kotlinmvp.ui.main.interactor.MainMVPInteractor
import com.abualgait.abual.kotlinmvp.ui.main.presenter.MainMVPPresenter
import com.abualgait.abual.kotlinmvp.ui.main.presenter.MainPresenter
import com.abualgait.abual.kotlinmvp.ui.main.view.MainMVPView
import dagger.Module
import dagger.Provides


@Module
class MainActivityModule {

    @Provides
    internal fun provideMainInteractor(mainInteractor: MainInteractor): MainMVPInteractor = mainInteractor

    @Provides
    internal fun provideMainPresenter(mainPresenter: MainPresenter<MainMVPView, MainMVPInteractor>)
            : MainMVPPresenter<MainMVPView, MainMVPInteractor> = mainPresenter

}
