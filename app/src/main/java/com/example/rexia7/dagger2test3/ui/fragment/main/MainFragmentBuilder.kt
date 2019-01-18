package com.example.rexia7.dagger2test3.ui.fragment.main

import android.support.v4.app.Fragment
import com.example.rexia7.dagger2test3.di.ViewModelModule
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentBuilder {

    @ContributesAndroidInjector(
        modules = [MainFragmentModule::class,
            MainFragmentViewModelModule::class]
    )
    abstract fun contributeMainFragment(): MainFragment
}

@Module
interface MainFragmentModule {
    @Binds
    fun providesAppCompatActivity(mainFragment: MainFragment): Fragment
}

@Module
class MainFragmentViewModelModule : ViewModelModule<MainFragmentViewModel>(MainFragmentViewModel::class.java)