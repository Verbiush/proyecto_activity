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


        data.add(Contact("Luis","7:40pm","Hi"))
        data.add(Contact("Agudelo","8:50pm","go?"))


    val adapter = ContactAdapter(data)
    contactListRecycle.adapter = adapter
    adapter.setOnClickListener(this)
    }
    override fun onContactClick(position: Int, model: Contact) {
        Log.d("exercise interface",position.toString()+ " "+ model.contactInformation())
    }
}