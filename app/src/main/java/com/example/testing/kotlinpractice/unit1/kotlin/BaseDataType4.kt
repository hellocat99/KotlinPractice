package com.example.testing.kotlinpractice.unit1.kotlin

//基本数据类型 -字符串模板
fun main(args: Array<String>) {
    val i = 10
    val s = "i = $i" // 求值结果为 "i = 10"
    println(s)
    val str = "$s.length is ${s.length}" // 求值结果为 "runoob.length is 6"
    println(str)
}