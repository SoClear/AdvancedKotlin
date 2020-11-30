package `fun`.soclear.kotlin1

import java.util.function.Consumer

fun main() {
    val list= listOf("kotlin","java","go")
    for (str in list){
        println(str)
    }
    println("--------------")
    list.forEach { println(it) }
    println("--------------")
    list.forEach(Consumer { println(it) })
    println("--------------")
    list.forEach(System.out::println)
}