package com.patterns


import com.patterns.inheritance.Singleton
import com.patterns.multiple.MultipleSingleton
import com.patterns.simple.SimpleSingleton
import com.patterns.wrong.WrongSingleton

fun main(){
    WrongSingleton.m()
    SimpleSingleton.getInstance().m()
    for(i in 1..10){
        println(Singleton.getInstance())
        Singleton.getInstance().m()
    }
    for (i in 1..10){
        MultipleSingleton.getInstance().m()
    }

}