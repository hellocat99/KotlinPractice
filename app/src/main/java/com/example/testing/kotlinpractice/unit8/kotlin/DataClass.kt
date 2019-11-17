package com.example.testing.kotlinpractice.unit8.kotlin

//数据类
data class User(var id: Int, var name: String)

fun main(args: Array<String>) {
    var user: User = User(10086, "张三")
    print("学号:${user.id}, 姓名:${user.name} ")
}