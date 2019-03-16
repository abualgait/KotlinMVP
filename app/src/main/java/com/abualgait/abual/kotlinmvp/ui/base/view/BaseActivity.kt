/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/9/19 2:28 PM
 *
 */

package com.abualgait.abual.kotlinmvp.ui.base.view

import android.app.ProgressDialog
import android.content.Context
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.ViewFlipper
import com.abualgait.abual.kotlinmvp.R
import dagger.android.AndroidInjection

abstract class BaseActivity : AppCompatActivity(), MVPView {

    private var progressDialog: ProgressDialog? = null
    protected var mViewFlipper: ViewFlipper? = null
    protected var c: Context? = null
    protected var btnRetry: Button? = null
    protected var relLoadingScreen: ConstraintLayout? = null
    protected var tvErrorMessage: TextView? = null
    protected var tvMessage: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
            performDI()
        super.onCreate(savedInstanceState)
    }

    override fun hideProgress() {
        progressDialog?.let { if (it.isShowing) it.cancel() }
    }

    override fun showProgress() {
        hideProgress()
        // progressDialog = CommonUtil.showLoadingDialog(this)
    }

    private fun performDI() = AndroidInjection.inject(this)
    fun initViewFlipper(view: View, c: Context) {
         mViewFlipper = view.findViewById(R.id.viewFlipper)
        tvMessage = view.findViewById(R.id.tvNoResult)
        btnRetry = view.findViewById(R.id.btnRetry)
        tvErrorMessage = view.findViewById(R.id.tvErrorMessage)
        relLoadingScreen = view.findViewById(R.id.relLoadingScreen)
        //mSwipeRefresh = view.findViewById(R.id.mSwipeRefresh)
        this.c = c

    }

    fun showLoader(rootView: View) {

        mViewFlipper?.displayedChild = mViewFlipper!!.indexOfChild(rootView.findViewById(R.id.relLoadingScreen))
    }

    fun showMainLayout(rootView: View) {
        mViewFlipper?.displayedChild = mViewFlipper!!.indexOfChild(rootView.findViewById(R.id.LinMainView))
    }

    fun showNoDataFound(cmgString: String,rootView: View) {
        tvMessage?.text = cmgString

        mViewFlipper?.displayedChild = mViewFlipper!!.indexOfChild(rootView.findViewById(R.id.linNoResult))
    }

    fun showOfflineMode(rootView: View) {

        mViewFlipper?.displayedChild = mViewFlipper!!.indexOfChild(rootView.findViewById(R.id.linOfflineScreen))
    }
}