/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/9/19 12:41 PM
 *
 */

package data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class movie(
        @Expose
        @SerializedName("id")
        var id: Int? = null,

        @Expose
        @SerializedName("name")
        var name: String? = null,

        @Expose
        @SerializedName("rate")
        var rate: String? = null,

        @Expose
        @SerializedName("image")
        var image: String? = null,

        @Expose
        @SerializedName("disc")
        var disc: String? = null) : Serializable