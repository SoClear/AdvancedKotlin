package `fun`.soclear.kotlin8

import kotlin.reflect.full.memberFunctions

class MyTestClass3 {
    fun printSomething() {
        println("something")
    }

    fun printNothing() {
        println("")
    }
}

fun main() {
    val myTestClass3 = MyTestClass3::class
    println(myTestClass3.memberFunctions)
}

