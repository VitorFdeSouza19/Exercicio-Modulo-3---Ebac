package com.example.exerciciomodulo3

class ExercicioCondicional {
}

fun main() {
    var numero = 8
    if(numero % 2== 0) println("O número é par")
        else println("o numero é impar")

    var numeroImpar = 7
    if(numeroImpar % 2== 0) println("O número é par")
    else println("o numero é impar")

   var number = 4
    when{
        number % 2 == 0 -> println("O número é par")

        else ->  println("O número é impar")
    }

    var numberImpar = 3
    when{
        numberImpar % 2 == 0 -> println("O número é par")

        else ->  println("O número é impar")
    }

}