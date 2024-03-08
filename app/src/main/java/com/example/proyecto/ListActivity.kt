package com.example.proyecto

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.adapter_interface.OnCountryClickListener
import com.example.proyecto.model.Country

class ListActivity : AppCompatActivity(),OnCountryClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val countryListRecycle = findViewById<RecyclerView>(R.id.countryList)
        countryListRecycle.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<Country>()

        data.add(Country("Germany","Europa","Berlin"))
        data.add(Country("Colombia","America","Bogota"))


        val adapter = CountryAdapter(data)
        countryListRecycle.adapter = adapter
       /* adapter.setOnClickListener(object: OnCountryClickListener {
            override fun onCountryClick(position: Int, model: Country) {
               Log.d("mi primera interfas",position.toString()+ " "+ model.countryInformation())
            }

        })*/ adapter.setOnClickListener(this)
    }

    override fun onCountryClick(position: Int, model: Country) {
        Log.d("mi primera interfas",position.toString()+ " "+ model.countryInformation())
    }
}