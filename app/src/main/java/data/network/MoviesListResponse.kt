/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/9/19 12:38 PM
 *
 */

package data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MoviesListResponse(
        @Expose
        @SerializedName("list")
        var data: List<movie>? = null) : Serializable
