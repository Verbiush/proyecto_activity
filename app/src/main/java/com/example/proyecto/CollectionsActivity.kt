package com.example.proyecto

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class CollectionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_collections)

        val countries = listOf("Germany", "India", "Japan", "Brazil", "Australia")
        printCountries(countries)


        val cities = mutableListOf("Berlin", "Calcutta", "Seoul", "Sao Paulo", "Sydney")
        cities.add("cali")
        listprint(cities)
        cities.removeAt(0)
        listprint(cities)

        var hashmap = hashMapOf(1130612565 to "juan", 123456978 to "luz", 37894561 to "angela")
        var name = hashmap[123456978]

        Log.d("names", name.toString())

        hashmap.put(789456123, "luis")
        hashmap[789456789] = "felipe"
        printPerson(hashmap)

        val array = arrayOfNulls<String>(100)
        array[1]="perros"
        array.set(3,"gatos")

        val arrayDos = arrayOf(1,4,"cuatro")
        for (number in arrayDos){
            Log.d("number",number.toString())
        }

        for(string in array){
            Log.d("vector",string.toString())
        }
    }

    private fun listprint(list: List<String>) {
        for (item in list) {
            Log.d("lists", item)
        }
    }

    private fun printCountries(list: List<String>) {

        for (index in 0 until list.size) {
            var countryTemp = list[index]
            if (countryTemp=="Japan"){
                Log.d("busqueda",index.toString())
            }
            Log.d("country", countryTemp)
            Log.e("country", countryTemp)

        }
    }
    private fun printPerson(hashMap: HashMap<Int, String>) {
        hashMap.forEach { item ->
            var key = item.key
            var value = item.value
            Log.d("key valido", key.toString() + "--" + value)
        }
    }

}