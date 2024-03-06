package com.example.proyecto

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.model.Country

class CountryAdapter(private val countryList: List<Country>) :
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_country, parent, false)

        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {

        val country = countryList[position]
        holder.countryTitle.text = country.name
        holder.countryContinent.text = country.continent
        Log.d("pais",country.name)
    }
    override fun getItemCount(): Int {
        return countryList.size
    }

    class CountryViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val countryTitle: TextView = itemView.findViewById(R.id.countryTitle)
        val countryContinent: TextView = itemView.findViewById(R.id.countryContinent)
    }
}