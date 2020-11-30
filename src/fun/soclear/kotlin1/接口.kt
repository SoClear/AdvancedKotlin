package `fun`.soclear.kotlin1

//接口IA
interface IA{
    //接口中的方法可以有具体实现
    fun method(){
        println("A")
    }
}

//父类P1
open class P1{
    open fun method(){
        println("B")
    }
}

//类C1实现了接口
class C1: P1(), IA {
    override fun method() {
        super<IA>.method()
        super<P1>.method()
    }
}

fun main() {
    val c1= C1()
    c1.method()
}