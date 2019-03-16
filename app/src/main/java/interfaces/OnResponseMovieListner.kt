/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/15/19 6:31 PM
 *
 */

package interfaces

import data.network.MoviesListResponse

interface OnResponseMovieListner {
    fun OnResponse(response: MoviesListResponse)
}