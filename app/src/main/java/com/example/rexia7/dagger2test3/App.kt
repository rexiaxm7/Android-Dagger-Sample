package com.example.rexia7.dagger2test3

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .create(this)
    }

}