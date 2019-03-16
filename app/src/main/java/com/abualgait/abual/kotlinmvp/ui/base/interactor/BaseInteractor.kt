/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/9/19 2:19 PM
 *
 */

package com.abualgait.abual.kotlinmvp.ui.base.interactor


import data.network.AppApiHelper

open class BaseInteractor() : MVPInteractor {


    protected lateinit var appApiHelper: AppApiHelper

    constructor(appApiHelper: AppApiHelper) : this() {

        this.appApiHelper = appApiHelper
    }


}