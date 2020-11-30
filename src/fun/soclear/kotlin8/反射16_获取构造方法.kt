package `fun`.soclear.kotlin8

class MyTestClass4(value: Int) {
    constructor(amount: Int, color: String) : this(amount) {
        println("secondary constructor")
    }

    constructor(amount: Int, full: Boolean) : this(amount) {
        println("secondary constructor")
    }

    fun printSomething() {
        println(" something")
    }

}

fun main(args: Array<String>) {
    //要用反射,首先获得KClass对象
    val myTestClass4 = MyTestClass4::class
    //获取构造方法
    val constructors = myTestClass4.constructors
    println(constructors)
}
