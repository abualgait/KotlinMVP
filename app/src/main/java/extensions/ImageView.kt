/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/16/19 11:45 AM
 *
 */

package extensions

import android.widget.ImageView
import com.squareup.picasso.Picasso

internal fun ImageView.loadImage(url: String) {
    Picasso.get().load(url).into(this)
}