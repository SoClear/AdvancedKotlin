package `fun`.soclear.kotlin8

import kotlin.reflect.full.functions

class MyTestClass5 {
    fun printSomething(name: String) {
        println("something: $name")
    }

    fun printNothing() {
        println("nothing")
    }
}

fun main() {
    //myTestClass5是KClass<MyTestClass5>的一个对象
    val myTestClass5 = MyTestClass5::class
    //创建MyTestClass5类的对象
    val testClass5 = MyTestClass5()
    //在myTestClass5里找名为printNothing的函数
    val functionToInvoke = myTestClass5.functions.find { it.name == "printNothing" }
    //传入的是一个已经创建的MyTestClass5类的对象
    functionToInvoke?.call(testClass5)


    val funToInvoke = myTestClass5.functions.find { it.name == "printSomething" }
    funToInvoke?.call(testClass5, "hello world")

}
