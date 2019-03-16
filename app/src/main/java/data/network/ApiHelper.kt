/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/9/19 3:08 PM
 *
 */

package data.network

import io.reactivex.Observable
import retrofit2.http.GET

interface ApiHelper {
    @GET("5c839bd15fe21458779b6e9f")
    fun getMovies(): Observable<MoviesListResponse>

}