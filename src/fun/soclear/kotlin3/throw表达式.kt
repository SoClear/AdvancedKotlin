package `fun`.soclear.kotlin3

import java.lang.IllegalArgumentException

/*
throw在Kotlin中是个表达式，这样我们可以将throw作为Elvis表达式(?:)的一部分
throw表达式的类型是一种特殊的类型:Nothing
在自己的代码中，可以使用Nothing来标记永远不会返回的函数
null是Nothing?类型,Nothing?就一种对象null
 */


fun myMethod(message:String):Nothing{
    throw IllegalArgumentException(message)
}

fun main() {
    val str: String? = "a"
    val str2=str ?: throw IllegalArgumentException("值不能为空")

    println(str)

    println("--------------------")
    val str3=str ?: myMethod("hello")
    println(str3)

    println("--------------------")

    val s=null
    println(s is Nothing?)

    val s2= listOf(null)
    println(s2 is List<Nothing?>)
}