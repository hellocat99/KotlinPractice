package com.example.testing.kotlinpractice.unit6.kotlin

//接口

fun main(args: Array<String>) {
    val c = Child()
    c.foo()
    c.bar()

}

interface MyInterface {
    fun bar()    // 未实现
    fun foo() {  //已实现
        // 可选的方法体
        println("foo")
    }
}

class Child : MyInterface {
    override fun bar() {
        // 方法体
    }
}