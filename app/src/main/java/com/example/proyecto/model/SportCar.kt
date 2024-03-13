package com.example.proyecto.model

import android.util.Log

class SportCar(val numberDoors: Int) : Car(numberDoors) {
    init {
        type = "SportCart"
    }

    override fun acelerar() {
        Log.d(type, "1 a 100 3 segundos")
    }
}