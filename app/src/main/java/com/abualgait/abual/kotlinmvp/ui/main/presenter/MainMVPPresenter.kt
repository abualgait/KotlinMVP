/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/9/19 2:19 PM
 *
 */

package com.abualgait.abual.kotlinmvp.ui.main.presenter

import com.abualgait.abual.kotlinmvp.ui.base.presenter.MVPPresenter
import com.abualgait.abual.kotlinmvp.ui.main.interactor.MainMVPInteractor
import com.abualgait.abual.kotlinmvp.ui.main.view.MainMVPView

interface MainMVPPresenter<V : MainMVPView, I : MainMVPInteractor> : MVPPresenter<V, I> {

}