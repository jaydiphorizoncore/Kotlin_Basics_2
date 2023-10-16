package com.example.kotlinbasics2

fun main() {


    println()
    val data = arrayOf<String>("Jaydip", "Nikul", "Pradip", "Akshay", "Mehul")


    println(data[1])
    println(data.get(2))
    println(data.set(2, "Ram"))  //update
    println(data[2])
    println(data.size)
    println(data.component1())   //fatch data
    println(data.contains("Mehul"))

    // println(data.set(5,"Shyam")) //ArrayIndexOutOfBoundsException

    for (i in data) {
        print("$i, ")
    }

    println("Print index ")

    for (i in data.indices) {
        print("$i ")
    }

    println("Print index and Value")
    for (i in data.indices) {
        println("$i -> ${data[i]}")
    }
    println("Print forEach loop")

    data.forEach { names -> print("$names, ") }

    /******************* Array Constructor ****************/

    println("Array Constructor")
    val arr1 = Array(5, { i -> i * 2 })

    arr1.forEach { arr1 -> println(arr1) }


}