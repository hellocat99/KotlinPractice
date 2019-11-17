package com.example.testing.kotlinpractice.unit5.kotlin

//扩展函数，静态，不具备运行时多态

open class Animal     //Kotlin 的类默认是 public final 的,如果希望它可以被继承，需要加open关键字

class Dog:Animal()

fun Animal.name() ="animal"

fun Dog.name()="dog"

fun Animal.printName(animal: Animal) {
    println(animal.name())
}

fun main(args: Array<String>) {
    Dog().printName(Dog())      //输出"animal"
}






