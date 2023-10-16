package com.example.kotlinbasics2

fun main() {
    for (i in 1..5)
    {
        for (space in 5 downTo i){
            print(" ")
        }
        for (j in 1..i){
            print("* ")
        }

        println()
    }
}