package com.example.daggertest

import dagger.Component

@Component(modules = [PresenterModule::class])
interface AppModule{
    fun inject(target: MainActivity)
}