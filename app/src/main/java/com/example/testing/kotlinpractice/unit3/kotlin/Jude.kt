package com.example.testing.kotlinpractice.unit3.kotlin

fun main(args: Array<String>) {
    val x: Any = 5
    //相当于case
    when (x) {
        in 1..10 -> print("x is in the range")
        is String -> print("x is string type")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}
