package com.example.testing.kotlinpractice.unit7.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testing.kotlinpractice.R

//kotlin 类
class MainActivity(var num: Int) : AppCompatActivity() {

    init {
        num = 10
        print("num is $num")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
