package `fun`.soclear.kotlin8

import kotlin.reflect.full.memberProperties

class MyTestClass6 {
    var name: String = "hello wor1d"
}

fun main(args: Array<String>) {
    val myTestClass6 = MyTestClass6::class
    val testClass6 = MyTestClass6()
    val variableToInvoke = myTestClass6.memberProperties.find { it.name == "name" }
    //对于成员属性来说可以用get方法来获得其值,也可以通过call方法获得其值
    println(variableToInvoke?.get(testClass6))
    println(variableToInvoke?.call(testClass6))
}