package com.wj.basic

import kotlin.math.max

fun main() {
//    val a = 10
//    println(a)
// val关键字用来声明一个不可变的变量，而var关键字用来声明一个可变的变量
//    var a:Int = 10
//    a = a*10

    val a = 37
    val b = 40
    val value = largerNumber(a, b)
    println("larger bumber is : "+value)


}
fun largerNumber(num1: Int, num2: Int): Int { return max(num1, num2) }
fun largerNumber1(num1: Int, num2: Int): Int = max(num1, num2)
fun largerNumber2(num1: Int, num2: Int) = max(num1, num2)
