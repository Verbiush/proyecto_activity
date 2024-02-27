package com.example.proyecto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.EditText

class ProtectActivity: AppCompatActivity() {
    private var button2: Button? =null
    private var visorNumero: TextView? =null
    private var generadorNumero: Button? =null
    private var borrador: Button? =null
    private  var cifraUno: EditText? =null
    private var cifraDos: EditText? =null
    private var visorResultado: TextView?=null
    private var botonResta: Button? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lineal)


        init ()
        generadorListener()
        borrarListener()
        botonRestaListener()
        funcionButton2()
    }

    private fun init () {
        visorNumero = findViewById<TextView>(R.id.visorNumero)
        visorResultado = findViewById<TextView>(R.id.visorResultado)
        cifraUno = findViewById<EditText>(R.id.cifraUno)
        cifraDos = findViewById<EditText>(R.id.cifraDos)
        botonResta = findViewById<Button>(R.id.botonResta)
        button2 = findViewById<Button>(R.id.startVista3)
        generadorNumero = findViewById<Button>(R.id.generadorNumero)
        borrador = findViewById<Button>(R.id.borrardor)
    }
    private fun botonRestaListener(){
        botonResta?.setOnClickListener {
            val digitoUno = cifraUno?.text.toString()
            val digitoDos = cifraDos?.text.toString()
            val numeroGenerado = visorNumero?.text.toString()
            val memoriaResultados = resta(digitoUno.toInt(),digitoDos.toInt(),numeroGenerado.toInt())
            visorResultado?.text=memoriaResultados.toString()
        }
    }
    private fun resta(numeroUno:Int,numeroDos:Int,visorNumero:Int):Int{
        val resultadoResta = numeroUno-numeroDos+visorNumero
        return resultadoResta
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

        borrador?.setOnClickListener {

            visorNumero?.setText("")
            cifraUno?.setText("")
            cifraDos?.setText("")
            visorResultado?.setText("")
              }
        }
    private fun funcionButton2(){
        button2?.setOnClickListener {
            val llamdoVista3 = Intent(this, EjercicioActivity::class.java)
            startActivity(llamdoVista3)
        }
   }
}