package `fun`.soclear.kotlin8

open class Parent()
class Son:Parent()
class Daughter:Parent()

fun main() {
    val son:Parent=Son()
    println(son::class)
    println(son::class.java)
    println(son.javaClass)
}
