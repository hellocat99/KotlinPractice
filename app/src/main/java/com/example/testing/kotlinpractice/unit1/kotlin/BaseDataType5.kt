package com.example.testing.kotlinpractice.unit1.kotlin

//基本数据类型  数组
fun main(args: Array<String>) {

    /**整型Int的数组*/
    val arrayOfInt: IntArray = intArrayOf(1, 3, 5, 7, 9)

    /**字符Char类型的数组*/
    val arrayOfChar: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')

    /**字符串String数组*/
    val arrayOfString: Array<String> = arrayOf("Hello", "World")

    val array = Array(4, { i -> i * i })   // arrar[i] = i*i 的意思

    for(i in array) {
        println("$i")
    }


}