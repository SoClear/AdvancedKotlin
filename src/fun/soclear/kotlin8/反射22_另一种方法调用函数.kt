package `fun`.soclear.kotlin8

import kotlin.reflect.KParameter
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.functions

class MyTestClass9(value: Int = 0) {
    fun printSomething() {
        println("Something")
    }

    fun printNothing() {
        println("Nothing")
    }
}

fun main() {
    var myTestClass9 = MyTestClass9::class
    /**
     * .createInstance()
     * Creates a new instance of the class, calling a constructor which either has no parameters or all parameters of which are optional
     * (see [KParameter.isOptional]). If there are no or many such constructors, an exception is thrown.
     * 用类的不带参数的构造方法创建对象
     */
    var myobj = myTestClass9.createInstance()
    myTestClass9.functions.find { it.name == "printSomething" }?.call(myobj)
    myTestClass9.functions.find { it.name == "printNothing" }?.call(myobj)
}