package com.example.proyecto.model

import android.util.Log

abstract class Car(val doorNumber: Int) {
    protected var type: String? = null

    open fun move() {
        Log.d(type,"move")
    }

    open fun openDoors() {
        Log.d(type,"abri" + doorNumber + "puertas")
    }

    abstract fun acelerar()
}