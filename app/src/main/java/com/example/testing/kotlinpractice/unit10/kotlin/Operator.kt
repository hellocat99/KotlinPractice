package com.kymjs.kotlinprimer.unit2

//集合操作符
fun main(args: Array<String>) {
    val a = arrayOf("4", "0", "7", "i", "f", "w", "0", "9")
    val index = arrayOf(5, 3, 9, 4, 8, 3, 1, 9, 2, 1, 7)

    index
        .filter {
            it < a.size
        }
        .map {
            a[it]
        }
        .reduce { s, s1 ->
            "$s$s1"
        }
        .also {
            println("密码是：$it")
        }

}
