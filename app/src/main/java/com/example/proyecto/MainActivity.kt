package com.example.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var button: Button? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         button = findViewById<Button>(R.id.startVista)
        funcionButton()

    }
    private fun funcionButton(){
        button?.setOnClickListener {
            val llamdoVista = Intent(this, ProtectActivity::class.java)
            startActivity(llamdoVista)
        }
    }
}