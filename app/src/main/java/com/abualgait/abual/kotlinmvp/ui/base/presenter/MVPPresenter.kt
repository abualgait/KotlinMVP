/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/9/19 11:52 AM
 *
 */

package com.abualgait.abual.kotlinmvp.ui.base.presenter

import com.abualgait.abual.kotlinmvp.ui.base.interactor.MVPInteractor
import com.abualgait.abual.kotlinmvp.ui.base.view.MVPView

interface MVPPresenter<V : MVPView, I : MVPInteractor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?
}