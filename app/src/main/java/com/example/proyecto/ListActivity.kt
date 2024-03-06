package com.example.proyecto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.model.Country

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val countryListRecycle = findViewById<RecyclerView>(R.id.countryList)
        countryListRecycle.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<Country>()

        data.add(Country("Germany","Europa"))
        data.add(Country("Colombia","America"))


        val adapter = CountryAdapter(data)
        countryListRecycle.adapter = adapter
    }
}