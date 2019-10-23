package com.example.daggertest.component

import com.example.daggertest.MainActivity
import com.example.daggertest.module.PresenterModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [PresenterModule::class])
interface AppComponent{
    fun inject(target: MainActivity)
}