package com.example.testing.kotlinpractice.unit9.kotlin

//Kotlin作用域函数

fun main(args: Array<String>) {
    println("----run------")
    useRun()

    println("----with------")
    useWith()

    println("----apply------")
    useApply()

    println("----let------")
    useLet()

    println("----also------")
    useAlso()

}


fun useRun() {
    val string = "abcd"
    string.run {
        println("this is ${this}") //abcd
        reversed()   //调用一个反向的方法，此时该run方法返回的对象就是reversed处理的值
        //this.reversed() 或者不省略this也行
    }.run {
        println("this is ${this}")  //dcba  将上一个run方法返回的对象打印出来
        length       //调用对象的length此时该run方法返回的对象就是length的值
    }.run {
        println("this is ${this}")  //4   将上一个run方法返回的对象打印出来
    }
}

//下面的解释类似，ps：写多了中文在代码里面不合适

fun useWith() {
    val string = "abcd"
    with(with(with(string) {
        println("this is ${this}")  //abcd
        reversed()
    }) {
        println("this is ${this}")  //dcba
        length
    }) {
        println("this is $this")   //4
    }


}

fun useApply() {
    val original = "abc"

    original.apply {
        println("this is ${this}") // "abc"
        reversed()
    }.apply {
        println("this is $this") // "abc"
        length
    }.apply {
        println("this is $this") // abc
    }
}

fun useLet() {
    val original = "abc"

    original.let {
        println("it is $it") // "abc"
        it.reversed()
    }.let {
        println("it is $it") // "cba"
        it.length
    }.let {
        println("it is $it") // 3
    }
}

fun useAlso() {
    val original = "abc"
    original.also {
        println("it is $it") // "abc"
        it.reversed()
    }.also {
        println("it is $it") // "abc"
        it.length
    }.also {
        println("it is $it") // "abc"
    }
}