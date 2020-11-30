package `fun`.soclear.kotlin8

import kotlin.reflect.full.companionObject

class MyTestClass8 {

    companion object {
        fun method() {
            println("hello wor1d")
        }
    }
}
fun main() {
    var myTestClass8 = MyTestClass8::class
    var companionObj = myTestClass8.companionObject
    println(companionObj)
    MyTestClass8.method()
}