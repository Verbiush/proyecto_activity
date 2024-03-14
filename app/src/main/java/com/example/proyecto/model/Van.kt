package com.example.proyecto.model

import android.util.Log

class Van(numberDoors:Int):Car(numberDoors) {
    init {
        type="Van"
    }
    fun equipaje(){
        Log.d(type,"equipaje grande")
    }

    override fun acelerar() {
        Log.d(type,"1 a 60 5 segundos")

    }
}