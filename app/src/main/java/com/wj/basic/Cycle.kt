package com.wj.basic

//range区间  [ , ]
//创建了一个0到10的区间，并且两端都是闭区间，这意味着0到10这两个端点都是包含在区间中的，用数学的方式表达出来就是[0, 10]
val range = 0..10

//[ , )
val range1 = 0 until 10

//step  跳过
// down to  降序
fun main() {
//    for (i in  range){
//        println(i)
//    }
//    for (i in  range1){
//        println(i)
//    }

//    for (i in  range1 step 2){
//        println(i)
//    }
    for (i in 10 downTo 1 step 2){
        println(i)
    }

}