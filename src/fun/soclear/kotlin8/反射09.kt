package `fun`.soclear.kotlin8

import kotlin.reflect.KClass
import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter

class A( val x: Int)
fun main(){
    println ( A::x.javaGetter)
    println(A::x.javaField)
    println( "---------")
    /**
     * .javaClass
     * Returns the runtime Java class of this object.
     *
     * @return Class<T>
     */
    println(A(10).javaClass)
    /**
     * .kotlin
     * Returns a [KClass] instance corresponding to the given Java [Class] instance.
     *
     * @return KClass<T>
     */
    println(A(10).javaClass.kotlin)
}
