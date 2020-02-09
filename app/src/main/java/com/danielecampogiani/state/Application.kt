package com.danielecampogiani.state

import android.content.Context
import com.danielecampogiani.state.inject.AppComponent
import com.danielecampogiani.state.inject.DaggerAppComponent
import android.app.Application as AndroidApplication

class Application : AndroidApplication() {

    companion object {
        fun getAppComponent(context: Context): AppComponent {
            val app = context.applicationContext as Application
            return app.appComponent
        }
    }


    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }
}