package com.example.kotlinbasics2


fun main() {

    print("Enter no of student :")
    val number = readLine()!!.toInt()
    println()
    println("Enter Student name :")

    val students = Array(number) { readLine() }
    for (i in students){
        println(i)
    }
}
