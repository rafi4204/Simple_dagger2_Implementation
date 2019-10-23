package com.example.daggertest.module

import com.example.daggertest.Car
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PresenterModule {
    @Provides
    @Singleton
    fun provideCar(): Car = Car("tyota", "g4", 10)


}
