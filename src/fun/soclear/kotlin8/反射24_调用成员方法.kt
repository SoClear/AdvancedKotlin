package `fun`.soclear.kotlin8

import kotlin.reflect.full.createInstance
import kotlin.reflect.full.declaredFunctions

class MyTestClass11 {
    fun method(message: String) {
        println("执行带string参数的方法:$message")
    }

    fun method(message: String, price: Double) {
        println("执行带string,Double参数的方法:$message $price")
    }
}

fun main() {
    //获取KClass对象
    val clazz = MyTestClass11::class
    //创建实例
    val instance = clazz.createInstance()
    val functions = clazz.declaredFunctions
    for (f in functions) {
        if (f.parameters.size == 3) {
            f.call(instance, "Ruby ", 23.4)
        }
        if (f.parameters.size == 2) {
            f.call(instance, "flutter")
        }
    }
}
