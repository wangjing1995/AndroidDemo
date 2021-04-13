package com.wj.basic

fun main() {
    checkNumber(10L)
}

fun getScore(name:String)=if (name == "Tom"){
    86
}else if (name == "Jim"){
    77
}else{
    0
}

//精确匹配
fun getScore1(name: String) = when(name){
    "Tom" -> 86
    "Jim" -> 77
    else ->0
}

fun getScore2(name: String)=when{
    //Tony1  Tony2
    name.startsWith("Tony") ->99
    name == "Tom" -> 86
    name == "Jim" -> 77
    else -> 0
}

//类型匹配
fun checkNumber(num:Number){
    when(num){
        is Int -> println("num is Int")
        is Double -> println("num is Double")
        else -> println("num not support")
    }
}