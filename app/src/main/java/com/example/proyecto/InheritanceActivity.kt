package com.example.proyecto

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.proyecto.model.Car
import com.example.proyecto.model.SportCar
import com.example.proyecto.model.Van

class InheritanceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inheritance)

        val sportCar = SportCar(2)
        sportCar.openDoors()
        /*sportCar.acelerar()*/
        velocidad(sportCar)

        val van = Van(6)
        van.openDoors()
        /* van.acelerar()*/
        velocidad(van)

    }

    private fun velocidad(car: Car) {
        car.acelerar()
        if (car is Van) {
            Log.d("van", "soy van")
            car.equipaje()
        }
        if (car is SportCar) {
            Log.d("sportCar", "soy sportCar")
        }
    }
}