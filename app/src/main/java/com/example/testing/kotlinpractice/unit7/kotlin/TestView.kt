package com.example.testing.kotlinpractice.unit7.kotlin

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView

//构造函数
class TestView : TextView {
    constructor(context: Context) : super(context) {
        println("constructor")
    }

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

}