/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/16/19 11:18 AM
 *
 */

package com.abualgait.abual.kotlinmvp.ui.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abualgait.abual.kotlinmvp.R
import data.network.movie
import extensions.loadImage
import kotlinx.android.synthetic.main.item_movie.view.*

class MoviesAdapter(private val blogListItems: MutableList<movie>) : RecyclerView.Adapter<MoviesAdapter.BlogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = BlogViewHolder(LayoutInflater.from(parent?.context)
            .inflate(R.layout.item_movie, parent, false))

    override fun getItemCount() = this.blogListItems.size

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) = holder.let {
        it.clear()
        it.onBind(position)
    }


    internal fun addtomovies(blogs: List<movie>) {
        this.blogListItems.addAll(blogs)
        notifyDataSetChanged()
    }

    inner class BlogViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun clear() {
            itemView.image.setImageDrawable(null)
            itemView.name.text = ""
            itemView.disc.text = ""
        }

        fun onBind(position: Int) {

            val (id, name, rate, image, disc) = blogListItems[position]

            inflateData(id, name, rate, image, disc)

        }




        private fun inflateData(id: Int?, name: String?, rate: String?, image: String?, disc: String?) {

            name?.let { itemView.name.text = it }
            rate?.let { itemView.rate.rating = it.toFloat() }
            disc?.let { itemView.disc.text = it }
            image?.let {
                itemView.image.loadImage(it)
            }
        }
    }
}

