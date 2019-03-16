/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/16/19 10:57 AM
 *
 */

package com.abualgait.abual.kotlinmvp.ui.main.interactor

import com.abualgait.abual.kotlinmvp.ui.base.interactor.BaseInteractor
import data.network.AppApiHelper
import javax.inject.Inject

class MainInteractor
@Inject internal constructor(appApiHelper: AppApiHelper)
    : BaseInteractor(appApiHelper = appApiHelper),
        MainMVPInteractor {


    override fun makeGetMoviesApiCall() = appApiHelper.getMovies()



}