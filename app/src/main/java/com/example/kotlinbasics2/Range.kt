package com.example.kotlinbasics2

fun main() {
    val number = 5

    val result = number in 1 until 5
    val result1 = number in 1..5

    println(result)
    println(result1)
}
