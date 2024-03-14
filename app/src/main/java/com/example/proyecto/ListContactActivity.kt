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


        data.add(Contact("Luis","7:40p.m","Hi","https://img.wattpad.com/cover/121162425-288-k20801.jpg"))
        data.add(Contact("Agudelo","8:50p.m","go?","https://elcomercio.pe/resizer/AB93Kg1JoITGLMLkCgLBnVzg_7g=/980x528/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/37OWRM2CLBAE7BP5SXKLVMNHZE.jpg"))
        data.add(Contact("Angela Cano","2:50p.m","hello world"))
        data.add(Contact("Programación Android","2:50p.m","solo se implementa en el layout en la parte de la imagen con hola hola hola"))


    val adapter = ContactAdapter(data)
    contactListRecycle.adapter = adapter
    adapter.setOnClickListener(this)
    }
    override fun onContactClick(position: Int, model: Contact) {
        Log.d("exercise interface",position.toString()+ " "+ model.contactInformation())
    }
}