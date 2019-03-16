/*
 * *
 *  * Created by Muhammad Sayed on 3/16/19 11:48 AM
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/9/19 2:31 PM
 *
 */

package di.builder.builder

import com.abualgait.abual.kotlinmvp.ui.main.MainActivityModule
import com.abualgait.abual.kotlinmvp.ui.main.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {


    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun bindMainActivity(): MainActivity


}
