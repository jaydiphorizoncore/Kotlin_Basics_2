package com.example.kotlinbasics2

fun main() {
    val number = 11

    /*****************************************************/
    when (number) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        10 -> println("Ten")
        else -> println("Not Found")
    }

    /*****************************************************/
    println()
    val result = when (number) {
        2 -> "Two"
        5 -> "Five"
        in 6..15 -> "Six"
        in 11 until  15 -> "Eleven"
        else -> "Not found"
    }
    println(result)

    /*****************************************************/
    println()
    when(number){
        1,2,3,5,4,6,7,8,9,10 -> println("1 to 10 number")
        else -> {
            println("$number is >10")
        }
    }
    /*****************************************************/
    println()
    when(number) {
        in 1..3 -> print("Spring season")
        in 4..6 -> print("Summer season")
        in 7..8 -> print("Rainy season")
        in 9..10 -> print("Autumn season")
        in 11..12 -> print("Winter season")
        !in 1..12 -> print("Enter valid month of year")
    }
    /*****************************************************/
    println()
    val num :Any = 10
    when(num){
        is Int -> println("It is an Integer")
        is String -> println("It is a String")
        is Double -> println("It is a Double")
    }


}