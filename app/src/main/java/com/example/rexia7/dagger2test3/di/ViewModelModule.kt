package com.example.rexia7.dagger2test3.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import dagger.Module
import dagger.Provides

@Module
abstract class ViewModelModule<VM : ViewModel>(
    private val kclass: Class<VM>
) {
    @Provides
    fun provideViewModel(
        activity: AppCompatActivity,
        factory: ViewModelInjectorFactory<VM>
    ): VM {
        return ViewModelProviders.of(activity, factory).get(kclass)
    }
}