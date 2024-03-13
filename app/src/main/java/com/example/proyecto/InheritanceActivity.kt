package com.example.proyecto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyecto.model.Car
import com.example.proyecto.model.SportCar
import com.example.proyecto.model.Van

class InheritanceActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inheritance)

        val sportCar = SportCar(2)
        sportCar.openDoors()
        sportCar.acelerar()

        val van = Van(6)
        van.openDoors()
        van.acelerar()
 }
}