package com.example.rexia7.dagger2test3.di

import android.content.Context
import com.example.rexia7.dagger2test3.Repo
import com.example.rexia7.dagger2test3.SampleRepo
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