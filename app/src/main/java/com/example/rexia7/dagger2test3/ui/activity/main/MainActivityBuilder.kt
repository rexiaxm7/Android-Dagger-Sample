package com.example.rexia7.dagger2test3.ui.activity.main

import android.support.v7.app.AppCompatActivity
import com.example.rexia7.dagger2test3.di.ViewModelModule
import com.example.rexia7.dagger2test3.ui.fragment.main.MainFragmentBuilder
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityBuilder {

    @ContributesAndroidInjector(
        modules = [MainActivityModule::class,
            MainActivityViewModelModule::class,
            MainFragmentBuilder::class]
    )
    abstract fun contributeMainActivity(): MainActivity
}

@Module
interface MainActivityModule {
    @Binds
    fun providesAppCompatActivity(mainActivity: MainActivity): AppCompatActivity
}

@Module
class MainActivityViewModelModule : ViewModelModule<MainActivityViewModel>(MainActivityViewModel::class.java)