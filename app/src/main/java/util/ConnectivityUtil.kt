/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 12:05 PM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/16/19 12:05 PM
 *
 */

package util


import android.content.Context
import android.net.ConnectivityManager
import com.abualgait.abual.kotlinmvp.ui.MvpApp


open class ConnectivityUtil {


    fun isNetworkConnected(): Boolean {

        val cm = MvpApp.getContext()!!.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        return cm.activeNetworkInfo != null
    }
}