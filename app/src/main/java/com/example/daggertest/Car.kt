package com.example.daggertest

import javax.inject.Inject

class Car @Inject constructor(val title:String,val model:String,val capacity:Int) {
}