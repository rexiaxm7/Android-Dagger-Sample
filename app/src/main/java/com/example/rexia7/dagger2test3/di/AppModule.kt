package com.example.rexia7.dagger2test3.di

import com.example.rexia7.dagger2test3.Repo
import com.example.rexia7.dagger2test3.SampleRepo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideRepo() : Repo {
        return SampleRepo()
    }
}