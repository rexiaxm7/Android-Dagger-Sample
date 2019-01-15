package com.example.rexia7.dagger2test3.di

import com.example.rexia7.dagger2test3.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainFragment() : MainFragment

    abstract fun test() : String
}