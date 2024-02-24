package com.example.proyecto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class ProtectActivity: AppCompatActivity() {
    private var button2: Button? =null
    private var visorNumero: TextView? =null
    private var generadorNumero: Button? =null
    private var borrar: Button? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lineal)
         button2 = findViewById<Button>(R.id.startVista3)

        init ()
        generadorListener()
        borrarListener()
        funcionButton2()
    }

    private fun init () {
        visorNumero = findViewById<TextView>(R.id.visorNumero)
        button2 = findViewById<Button>(R.id.startVista3)
        generadorNumero = findViewById<Button>(R.id.generadorNumero)
        borrar = findViewById<Button>(R.id.borrar)

    }
    private fun generadorListener(){
        generadorNumero?.setOnClickListener {
            val memoriaNumero = genNumero()
            visorNumero?.text=memoriaNumero.toString()
        }
    }
    private fun genNumero(): Int{
        val rnds =(0..100).random()
        return rnds
    }
    private fun borrarListener(){
        var borrarCampos = visorNumero?.text.toString()
        visorNumero?.setText(borrarCampos.toString())

        borrar?.setOnClickListener {

            visorNumero?.setText("")


              }
        }
    private fun funcionButton2(){
        button2?.setOnClickListener {
            val llamdoVista3 = Intent(this, EjercicioActivity::class.java)
            startActivity(llamdoVista3)
        }
   }
}