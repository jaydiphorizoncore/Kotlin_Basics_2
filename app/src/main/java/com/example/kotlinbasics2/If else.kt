package com.example.kotlinbasics2

fun main() {
    print("Enter No : ")
    val no = readLine()!!.toInt()
    val result = if (no % 2 == 0) "Even no" else "Odd no"
    println(result)

    val a = 10
    val b = 10
    val ans = if (a < b) {
        "A is small"
    } else if (a > b) {
        "B is small"
    } else {
        "A and B is equal"
    }

    println(ans)

    val max = if (a > b)
    {
        println("A is Big")
        println("A is hold big value")
    } else{
        println("b is Big")
        println("b is hold big value")
    }
    println(max)


}