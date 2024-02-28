package com.example.proyecto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EjercicioActivity : AppCompatActivity() {

    private var buttonSum: Button? = null
    private var numberOne: EditText? = null
    private var numberTwo: EditText? = null
    private var screenView: TextView? = null
    private var buttonClear: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio)

        init()
        operatorListener()
        clearListener()
    }

    private fun init() {
        buttonClear = findViewById<Button>(R.id.ButtonClear)
        buttonSum = findViewById<Button>(R.id.buttonSum)
        numberOne = findViewById<EditText>(R.id.numberOne)
        numberTwo = findViewById<EditText>(R.id.numberTwo)
        screenView = findViewById<TextView>(R.id.screenView)
    }

    private fun operatorListener() {
        buttonSum?.setOnClickListener {
            val numOne = numberOne?.text.toString()
            val numTwo = numberTwo?.text.toString()
            val isNumUnoEmpty = checkField(numOne)
            val isNumDosEmpty = checkField(numTwo)
            if (isNumUnoEmpty == true && isNumDosEmpty == true) {
                val memoryView = addition(numOne.toInt(), numTwo.toInt())
                screenView?.text = memoryView.toString()
            } else {
                Toast.makeText(this@EjercicioActivity, "digite un numero", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun addition(numbOne: Int, numbTwo: Int): Int {

        val resultScreen = numbOne + numbTwo

        return resultScreen
    }

    private fun checkField(verifyField: String): Boolean {
        if (verifyField.isNotEmpty()) {
            return true
        } else {
            return false
        }
    }

    private fun clearListener() {
        buttonClear?.setOnClickListener {
            numberOne?.setText("")
            numberTwo?.setText("")
            screenView?.setText("Result")
        }
    }
}



