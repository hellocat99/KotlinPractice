package com.example.testing.kotlinpractice.unit2.kotlin


interface Animal {
    fun bark()
}

class Dog : Animal {
    override fun bark() {
        println("Wang")
    }
}

class Zoo(animal: Animal) : Animal by animal {
    override fun bark() {
        println("zoo")
    }
}

fun main(args: Array<String>) {
    Zoo(Dog()).bark()
}
