package com.example.proyecto

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.adapter_interface.OnContactClickListener
import com.example.proyecto.model.Contact


class ListContactActivity: AppCompatActivity(), OnContactClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val contactListRecycle = findViewById<RecyclerView>(R.id.contactView)
        contactListRecycle.layoutManager = LinearLayoutManager(this)
          val data = ArrayList<Contact>()


        data.add(Contact("Luis","7:40p.m","Hi"))
        data.add(Contact("Agudelo","8:50p.m","go?"))
        data.add(Contact("Angela Cano","2:50p.m","hello world"))
        data.add(Contact("Programación Android","2:50p.m","solo se implementa en el layout en la parte de la imagen con"))


    val adapter = ContactAdapter(data)
    contactListRecycle.adapter = adapter
    adapter.setOnClickListener(this)
    }
    override fun onContactClick(position: Int, model: Contact) {
        Log.d("exercise interface",position.toString()+ " "+ model.contactInformation())
    }
}