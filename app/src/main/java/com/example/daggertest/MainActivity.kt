package com.example.daggertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
@Inject lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appModule= DaggerAppComponent.builder()
        appModule.build().inject(this)
        tv.text=car.title+" "+car.model+" "+car.capacity

    }
}
