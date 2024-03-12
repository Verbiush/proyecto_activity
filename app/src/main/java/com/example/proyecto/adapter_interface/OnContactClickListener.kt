package com.example.proyecto.adapter_interface

import com.example.proyecto.model.Contact


interface OnContactClickListener {
    fun onContactClick(position: Int, model: Contact)
}