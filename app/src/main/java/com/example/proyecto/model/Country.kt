package com.example.proyecto.model

class Country(val name: String, val continent: String) {
    fun countryInformation (): String{
        return name + " " + continent
    }
}