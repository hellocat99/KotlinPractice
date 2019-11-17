package com.example.testing.kotlinpractice.unit4.kotlin

//变量与不可变的变量

fun main(args: Array<String>) {
    var age: Int = 18
    val name: String = "Zhang Tao"

    var name1 = "Zhang Tao" //可以推测出name1的类型

//    val name2: String = null   //报错 name2是不可为空的String类型

    var name3: String? = null // name3是可为空的String类型

//    name1 = name3      // 报错，可为空的String类型不能直接给不可为空的String类型赋值

    name3 = "我不是空了"
    name1 = name3!!   //  两个感叹号，表示强转

    name3 = name1    //反过来是可以的

}
