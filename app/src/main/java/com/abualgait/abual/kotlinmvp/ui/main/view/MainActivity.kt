/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/16/19 11:39 AM
 *
 */

package com.abualgait.abual.kotlinmvp.ui.main.view

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.abualgait.abual.kotlinmvp.R
import com.abualgait.abual.kotlinmvp.ui.adapters.MoviesAdapter
import com.abualgait.abual.kotlinmvp.ui.base.view.BaseActivity
import com.abualgait.abual.kotlinmvp.ui.main.interactor.MainMVPInteractor
import com.abualgait.abual.kotlinmvp.ui.main.presenter.MainMVPPresenter
import data.network.movie
import javax.inject.Inject

class MainActivity : BaseActivity(), MainMVPView, View.OnClickListener {
    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btnRetry -> {
                checkvalidations()
            }
        }
    }

    private fun checkvalidations() {
        mainrecycler = findViewById(R.id.main_recycler)

        initViewFlipper(window.decorView.findViewById(android.R.id.content), this)
        presenter.onAttach(this)
    }

    override fun showMovies(movies: List<movie>?) {
        showMainLayout(window.decorView.findViewById(android.R.id.content))
        this.movies = movies!!
        setup()
        adapter!!.addtomovies(this.movies)
    }

    override fun showLoading() {
        showLoader(window.decorView.findViewById(android.R.id.content))
    }

    override fun showNoIntenet() {

        showOfflineMode(window.decorView.findViewById(android.R.id.content))
    }

    override fun showErrorLoading() {

    }


    override fun showDataNotFound() {
        showNoDataFound("no data available", window.decorView.findViewById(android.R.id.content))
    }


    @Inject
    internal lateinit var presenter: MainMVPPresenter<MainMVPView, MainMVPInteractor>
    lateinit var movies: List<movie>
    var adapter: MoviesAdapter? = null
    var linearLayoutManager: LinearLayoutManager? = null
    lateinit var mainrecycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainrecycler = findViewById(R.id.main_recycler)

        initViewFlipper(window.decorView.findViewById(android.R.id.content), this)
        presenter.onAttach(this)
        btnRetry!!.setOnClickListener(this)
    }

    fun setup() {
        adapter = MoviesAdapter(movies as MutableList<movie>)
        linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager!!.orientation = LinearLayoutManager.VERTICAL
        mainrecycler.layoutManager = linearLayoutManager
        mainrecycler.adapter = adapter
    }

}
