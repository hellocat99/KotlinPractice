package com.example.testing.kotlinpractice.unit7.kotlin

//伴生对象
class Single private constructor() {

    companion object {   //companion object 表示伴生对象
        fun get(): Single {
            return Holder.instance
        }
    }

    private object Holder {
        init {
            println("holder")
        }
        val instance = Single()
    }
}


class StringUtils {
    companion object {
        fun isEmpty(str: String): Boolean {
            return "" == str
        }
    }
}

fun main(args: Array<String>) {
    StringUtils.isEmpty("hello world!")
    Single.get()
}
