package com.example.rexia7.dagger2test3


import com.example.rexia7.dagger2test3.ui.activity.main.MainActivityBuilder
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    MainActivityBuilder::class])
interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>() {
        abstract fun appModule(appModule: AppModule): Builder

        // @BindsInstanceを指定するとModuleのメソッド引数に渡すことができる
//        @BindsInstance
//        abstract fun timestamp(timestamp: Long): Builder
    }
}