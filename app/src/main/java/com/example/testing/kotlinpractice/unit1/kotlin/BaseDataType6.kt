package com.example.testing.kotlinpractice.unit1.kotlin

//基本数据类型  区间
fun main(args: Array<String>) {

    for (i in 1..4)
        print(i) // 输出“1234”

    for (i in 4..1)
        print(i) // 什么都不输出

    for (i in 1..10) // 等同于 1 <= i && i <= 10
        println(i)

    // 使用 step 指定步长
    for (i in 1..4 step 2) print(i) // 输出“13”

    for (i in 4 downTo 1 step 2) print(i) // 输出“42”


    // 使用 until 函数排除结束元素
    for (i in 1 until 10) {   // i in [1, 10) 排除了 10
        println(i)
    }
}