package com.example.exerciciomodulo3

class ListaseArrays {
}

fun main() {

    var array : IntArray = IntArray(40)
    for (i in 1..39 step 1) {
        println(i)
    }



    val mutableList : MutableList<Int> = mutableListOf()
    for (i in 1..99 step 1) {
        println(i)
    }

    var lista : IntArray = IntArray(99)

    for(i in lista.indices){
        lista[i] = i * 2
    }

    var k = 0
    var resultado = 0.0
    while (k < lista.size) {
        resultado = resultado + lista[k] / 3.0
        k++
    }
    println("valor total da soma dos resultados = $resultado")

}