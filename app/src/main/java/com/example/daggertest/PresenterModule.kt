package com.example.daggertest

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PresenterModule {
    @Provides
    @Singleton
    fun provideCar():Car =Car("tyota","g4",10)


}
