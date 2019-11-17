package com.example.testing.kotlinpractice.unit5.kotlin

//函数的申明

fun main(args: Array<String>) {

    echo("hello world!")
}

fun echo(name: String): String? {
    println("$name")
    return name
}

//fun echo(name: String) {
//    println("$name")
//}
//
//fun echo(name: String = "ZhangTao") {
//    println("$name")
//}
// fun echo(name: String) = println("$name")
//
