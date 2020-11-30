package `fun`.soclear.kotlin8

import java.io.Serializable
import kotlin.reflect.full.superclasses

interface MyInterface
class MySerializable: Serializable,MyInterface

fun main() {
    val mySerializableType =MySerializable::class
    //继承的父类和接口都显示出来了_
    println(mySerializableType.superclasses)

}