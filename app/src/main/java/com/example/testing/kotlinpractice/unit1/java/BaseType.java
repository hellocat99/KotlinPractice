package com.example.testing.kotlinpractice.unit1.java;

public class BaseType {

    public static void main(String[] args) {
        int a = 10000;
        int boxedA = a;
        int anotherBoxedA = a;
        System.out.println((boxedA == anotherBoxedA));
    }
}
