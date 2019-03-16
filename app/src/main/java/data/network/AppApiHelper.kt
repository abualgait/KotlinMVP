/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/16/19 11:13 AM
 *
 */

package data.network

import io.reactivex.Observable
import javax.inject.Inject


class AppApiHelper @Inject internal constructor() {


    fun getMovies(): Observable<MoviesListResponse> =
            RestClient.createService(ApiHelper::class.java)
                    .getMovies().map { response ->
                        response
                    }


}
