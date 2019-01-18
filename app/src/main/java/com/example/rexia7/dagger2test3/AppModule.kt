package com.example.rexia7.dagger2test3

import android.content.Context
import com.example.rexia7.dagger2test3.model.Repo
import com.example.rexia7.dagger2test3.model.SampleRepo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val context : Context) {


    @Provides
    fun provideContext() : Context {
        return context
    }

    @Provides
    @Singleton
    fun provideRepo() : Repo {
        return SampleRepo()
    }
}