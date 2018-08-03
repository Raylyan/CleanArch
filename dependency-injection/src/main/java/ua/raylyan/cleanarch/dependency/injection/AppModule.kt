package ua.raylyan.cleanarch.dependency.injection

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import ua.raylyan.cleanarch.presentation.activity.MainActivity


@Module(includes = [AndroidSupportInjectionModule::class])
interface AppModule {

    @ContributesAndroidInjector
    fun mainActivityInjector(): MainActivity
}