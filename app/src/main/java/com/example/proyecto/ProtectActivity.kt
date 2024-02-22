package com.example.proyecto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class ProtectActivity: AppCompatActivity() {
    private var button2: Button? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lineal)
         button2 = findViewById<Button>(R.id.startVista3)
        funcionButton2()
    }
    private fun funcionButton2(){
        button2?.setOnClickListener {
            val llamdoVista3 = Intent(this, EjercicioActivity::class.java)
            startActivity(llamdoVista3)
        }
   }
}