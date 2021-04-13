package com.wj.oop

open class Person(var name:String,var age:Int) {
//    var name = ""
//    var age = 0

    fun eat(){
        println(name+" is eating."+"He is "+age+" years old.")
    }
}