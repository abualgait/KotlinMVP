/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/9/19 3:08 PM
 *
 */

package com.abualgait.abual.kotlinmvp.ui

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import di.builder.component.DaggerAppComponent
import javax.inject.Inject


class MvpApp : Application(), HasActivityInjector {

    @Inject
    lateinit internal var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>


    override fun activityInjector() = activityDispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        mContext = this
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this)
    }

    companion object {
        private var mContext: MvpApp? = null
        fun getContext(): MvpApp? {
            return mContext
        }
    }

}