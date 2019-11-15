package com.example.testing.kotlinpractice.unit1.kotlin

//基本数据类型 -类型转换
fun main(args: Array<String>) {
    val b: Byte = 1 // OK, 字面值是静态检测的
    //val i: Int = b // 错误

    val i: Int = b.toInt() // OK
}