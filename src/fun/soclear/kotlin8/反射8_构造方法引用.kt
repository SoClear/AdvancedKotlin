package `fun`.soclear.kotlin8

/*
构造方法引用(Constructor Reference)
要求有两点
1。函数对象的参数要与构造方法的参数保持一致_（体现在参数个数与参数类型上)
2。函数对象的返回结果要与构造方法所在类的类型保持=致
 */
class B(val x: Int)

/**
 *
 * @param factory 是函数参数,或者说函数对象参数
 */
fun myMethod( factory: (x: Int) -> B){
    val b: B = factory(3)
    println(b.x)
}
fun main() {
    //::B是构造方法引用
    myMethod(::B)
}