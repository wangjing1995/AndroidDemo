package com.wj.oop
//这里我们将学号和年级这两个字段都放到了主构造函数当中，这就表明在对Student类进行实例化的时候，必须传入构造函数中要求的所有参数
class Student (val sno:String,val grade:Int, name:String,age:Int
): Person(name,age),Study{
//    var sno = ""
//    var grade = 0
//    init {
//    println("sno is "+sno)
//    println("grade is "+grade)
//    }
    constructor(name: String,age: Int):this("",0,name,age){}
    constructor():this("",0){}

    override fun readBooks() {
//        TODO("Not yet implemented")
        println(name+" is reading.")
    }

//    override fun doHomeWork() {
////        TODO("Not yet implemented")
//        println(name+" is doing homework.")
//    }
}

//class Student1 : Person{
//    constructor(name: String,age: Int):super(name, age){}
//}