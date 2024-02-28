package com.example.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private var button: Button? = null
    private var buttonSuma: Button? = null
    private var primerNumero: EditText? = null
    private var segundoNumero: EditText? = null
    private var mostrarResultado: TextView? = null
    private var borrar: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        funcionButton()
        operadorListener()
        borrarListener()
    }
    private fun init() {
        borrar = findViewById<Button>(R.id.borrar)
        button = findViewById<Button>(R.id.startVista)
        buttonSuma = findViewById<Button>(R.id.sumar)
        primerNumero = findViewById<EditText>(R.id.primerNumero)
        segundoNumero = findViewById<EditText>(R.id.segundoNumero)
        mostrarResultado = findViewById<TextView>(R.id.resultado)
    }
    private fun operadorListener() {
        buttonSuma?.setOnClickListener {
            val numUno = primerNumero?.text.toString()
            val numDos = segundoNumero?.text.toString()
            val isNumUnoEmpty = verificarCampos(numUno)
            val isNumDosEmpty = verificarCampos(numDos)
            if (isNumUnoEmpty == true && isNumDosEmpty == true) {
                val memoriaResultado = sumar(numUno.toInt(), numDos.toInt())
                mostrarResultado?.text = memoriaResultado.toString()
            } else {
                Toast.makeText(this@MainActivity, "digite un numero", Toast.LENGTH_LONG).show()
            }
        }
    }
    private fun sumar(numeroUno: Int, numeroDos: Int): Int {

        val resultadoSuma = numeroUno + numeroDos

        return resultadoSuma
    }
    private fun verificarCampos(evaluarCampo: String): Boolean {
        if (evaluarCampo.isNotEmpty()) {
            return true
        } else {
            return false
        }
    }
    private fun borrarListener() {
        borrar?.setOnClickListener {
            primerNumero?.setText("")
            segundoNumero?.setText("")
            mostrarResultado?.setText("")
        }
    }
    private fun funcionButton() {
        button?.setOnClickListener {
            val llamdoVista = Intent(this, ProtectActivity::class.java)
            startActivity(llamdoVista)
        }
    }
}

