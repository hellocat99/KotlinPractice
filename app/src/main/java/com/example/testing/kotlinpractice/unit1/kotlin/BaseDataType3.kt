package com.example.testing.kotlinpractice.unit1.kotlin

//基本数据类型 -三个引号 """ 扩起来的字符串，支持多行字符串
fun main(args: Array<String>) {
    val text = """
多行字符串
多行字符串
"""
    println(text)   // 输出有一些前置空格
}