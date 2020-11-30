package `fun`.soclear.kotlin8

import kotlin.reflect.KClass

fun main() {
    /**
     * 可以通过类名::class 这样的语法来获得KClass类的对象
     */
    val c=String::class
    println(c)
    /**
     * .java : Returns a Java [Class] instance corresponding to the given [KClass] instance.
     */
    val c2= String::class.java
    println(c2)
    /**
     * .javaClass : Returns the runtime Java class of this object.
     */
    val c3="Hello World".javaClass
    val c4="hello"::class.java
    println(c2.javaClass)

}
