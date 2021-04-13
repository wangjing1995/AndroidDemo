package com.wj.oop

fun main() {
    val p = Person("Jack",26)
//    p.name = "Jack"
//    p.age = 26
    p.eat()

//    val stu1 = Student("007",5,"小明",10)
//    stu1.eat()
    val stu1 = Student()
    val stu2 = Student("小明",10)
    val stu3 = Student("001",5,"小红",10)

    doStudy(stu3)
}
fun doStudy(study: Study){
    study.readBooks()
    study.doHomeWork()
}