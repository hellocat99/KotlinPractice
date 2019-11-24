package com.example.testing.kotlinpractice.unit7.kotlin

//构造函数

//***主构造函数
class Person constructor(username: String, age: Int) { //Person有一个主构造函数，主构造函数参数有两个 String ,Int

    private val mUsername: String
    private var mAge: Int

    init {      //可以在init代码块中，用主构造参数给类的成员变量赋值
        this.mUsername = username
        this.mAge = age
    }
}

//kotlin可以省略着写比如省略类体
class Person2 constructor(username: String, age: Int)

//kotlin可以省略着写比如省略主构造函数的constructor关键字
class Person3(username: String, age: Int)

//当我们定义一个类时，我们如果没有为其显式提供Primary Constructor，Kotlin编译器会默认为其生成一个无参主构造，
class Person4


//*****次级构造函数，次级构造函数定义在是在类体中
class User {
    private val username: String
    private var age: Int

    constructor(username: String, age: Int) {  //次级构造函数
        this.username = username
        this.age = age
    }
}

class User2(username: String) {
    private val username: String
    private var age: Int =27

    init {
        this.username = "kotlin"
    }

    constructor(username: String, age: Int):this(username) {  //次级构造函数,如果类有一个主构造函数，每个次构造函数可以使用this关键字，直接委托或者通过别的次构造函数间接委托给主构造函数
        this.age = age
    }
}


