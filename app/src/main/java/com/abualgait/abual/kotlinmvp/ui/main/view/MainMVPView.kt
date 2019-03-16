/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/16/19 11:05 AM
 *
 */

package com.abualgait.abual.kotlinmvp.ui.main.view

import com.abualgait.abual.kotlinmvp.ui.base.view.MVPView
import data.network.movie

interface MainMVPView : MVPView {

    fun showMovies(movies: List<movie>?)

    fun showLoading()

    fun showNoIntenet()

    fun showErrorLoading()

    fun showDataNotFound()


}