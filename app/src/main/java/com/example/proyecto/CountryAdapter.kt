package com.example.proyecto

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.adapter_interface.OnCountryClickListener
import com.example.proyecto.model.Country

class CountryAdapter(private val countryList: List<Country>) :
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    private var onCountryClickListener:OnCountryClickListener?=null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_country, parent, false)

        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {

        val country = countryList[position]
        holder.countryTitle.text = country.name
        holder.countryContinent.text = country.continent
        holder.countryCapital.text = country.capital
        holder.countryDetail.setOnClickListener {
          /*  if (onCountryClickListener!=null){*/

            /*}*/
        }
        holder.countryItemContainer.setOnClickListener {

        }
        holder.itemView.setOnClickListener {
            onCountryClickListener?.onCountryClick(position,country)
        }
        Log.d("pais",country.name)
    }
    override fun getItemCount(): Int {
        return countryList.size
    }

    class CountryViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val countryTitle: TextView = itemView.findViewById(R.id.countryTitle)
        val countryContinent: TextView = itemView.findViewById(R.id.countryContinent)
        val countryCapital: TextView = itemView.findViewById(R.id.countryCapital)
        val countryDetail : Button = itemView.findViewById(R.id.countryDetail)
        val countryItemContainer:View=itemView.findViewById(R.id.itemCountryContainer)
    }
   /* interface OnCountryClickListener {
        fun onCountryClick(position: Int, model: Country)
    }*/

    fun setOnClickListener(onClickListener: OnCountryClickListener) {
        this.onCountryClickListener = onClickListener
    }
}