package com.example.proyecto

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.proyecto.model.Country
import kotlin.time.times


class CollectionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_collections)

        val countries = listOf("Germany", "India", "Japan", "Brazil", "Australia")
        val printIndex = searchCountry(countries, "India")
        Log.d("busqueda", printIndex.toString())
        val country = Country("Colombia", "America")
        val grecia = Country("Grecia", "europa")
        val countriesClass = listOf(country, grecia)
        for (tempCountry in countriesClass) {
            Log.d("addCountry", tempCountry.countryInformation())
        }


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
        array[1] = "perros"
        array.set(3, "gatos")

        val arrayDos = arrayOf(1, 4, "cuatro")
        for (number in arrayDos) {
            Log.d("number", number.toString())
        }

        for (string in array) {
            Log.d("vector", string.toString())
        }

        val numbers = listOf(2, 3, 13, 4, 12, 6, 7, 8, 9, 10)
        conditionNumbers(numbers)

        printMayorMenorQue100(5)



      printResultadoOperacion(5,3)

    }

}


private fun printResultadoOperacion(numberUno:Int,numberDos:Int){



    if (numberUno < numberDos) {
        var resultadoSuma= numberUno+numberDos
        Log.d("Operador Suma",resultadoSuma.toString())


    } else {
        var resultadoMulti= numberUno*numberDos
        Log.d("operador Multiplicacion",resultadoMulti.toString())


    }


}
private fun printMayorMenorQue100(number: Int){

    if (number<100){
        Log.d("Menor",number.toString())

    }else if (number>100){
        Log.d("Mayor",number.toString())
    }else if(number==100){
        Log.d("igual",number.toString())
    }
    if(number >1 && number < 10){
        Log.d("mayorQue&&MenorQue",number.toString())
    }
}
 private fun conditionNumbers(list: List<Int>) {

    for (index in 0 until list.size) {
     var numbersTemp=list[index]

        if (numbersTemp %2 == 0) {

            Log.d(
                "ListNumbers",
                " el numero" + " " + numbersTemp + " " + "Es par" + " " + "el index es" + " " + index
            )
        } else  {
            Log.d(
                "ListNumbers",
                " el numero" + " " + numbersTemp + " " + "Es impar" + " " + "el index es" + " " + index
            )
        }
    }
}

private fun listprint(list: List<String>) {
    for (item in list) {
        Log.d("lists", item)
    }
}


private fun searchCountry(list: List<String>, searchCountry: String): Int {

    for (index in 0 until list.size) {
        var countryTemp = list[index]
        if (countryTemp == searchCountry) {
            return index
        }
    }
    return -1
}

private fun printPerson(hashMap: HashMap<Int, String>) {
    hashMap.forEach { item ->
        var key = item.key
        var value = item.value
        Log.d("key valido", key.toString() + "--" + value)
    }


}

