package com.example.rexia7.dagger2test3.di


import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    ActivityModule::class])
interface AppComponent : AndroidInjector<Application> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<Application>() {
        abstract fun appModule(appModule: AppModule): Builder

        // @BindsInstanceを指定するとModuleのメソッド引数に渡すことができる
//        @BindsInstance
//        abstract fun timestamp(timestamp: Long): Builder
    }
}