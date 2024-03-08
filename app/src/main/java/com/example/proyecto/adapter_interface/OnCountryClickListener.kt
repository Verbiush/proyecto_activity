package com.example.proyecto.adapter_interface

import com.example.proyecto.model.Country

interface OnCountryClickListener {
    fun onCountryClick(position: Int, model: Country)
}