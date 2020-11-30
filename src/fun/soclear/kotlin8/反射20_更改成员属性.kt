package `fun`.soclear.kotlin8

import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.memberProperties

class MyTestClass7 {
    var name: String = "hello world"
    var authorName: String = "tom"
}

fun main() {
    val myTestClass7 = MyTestClass7::class
    val testClass7 = MyTestClass7()

    val variableToInvoke = myTestClass7.memberProperties.find { it.name == "name" }
    println(variableToInvoke?.get(testClass7))
    //如果variableToInvoke是可写属性
    if (variableToInvoke is KMutableProperty<*>) {
        variableToInvoke.setter.call(testClass7, "welcome")
    }
    println(variableToInvoke?.get(testClass7))
}
