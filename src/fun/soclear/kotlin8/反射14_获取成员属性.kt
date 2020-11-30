package `fun`.soclear.kotlin8

import kotlin.reflect.full.memberProperties

class MyTestClass2(var a: String,val flag: Boolean,var age: Int)

fun main( args: Array<String>) {
    val myTestClass2 = MyTestClass2::class
    //打印出了所有成员属性
    println(myTestClass2.memberProperties)
}
