package `fun`.soclear.kotlin8

import kotlin.reflect.KClass

fun main() {
    val kotlinLang = "kotlin"
    val kClass: KClass<out String> = kotlinLang::class
    println(kClass)
    println("------------")
    val kClassDataType: KClass<String> = String::class
    println(kClassDataType)
    println("------------")
    val kClass1: KClass<out String> = "kotlin"::class
    val kClass2: KClass<out String> = "java"::class
    val kClass3: KClass<out String> = "ruby"::class
    println(kClass1)
    println(kClass2)
    println(kClass3)
    println(kClass1 == kClass2)
    println("------------")
    val kClass4 = Class.forName("java.util.Date").kotlin
    println(kClass4)

    println(kClass4==Class.forName("java.util.Date"))
    println(kClass4==Class.forName("java.util.Date").kotlin)
}
