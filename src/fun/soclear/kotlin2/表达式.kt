package `fun`.soclear.kotlin2

/*
对于重写的方法来说，子类所拥有的重写方法会使用与父类相同的默认参数值。
在重写一个拥有默认参数值的方法时，方法签名中必须要将默认参数值省略掉。
*/
open class A{
    open fun method(a:Int,b:Int=4)=a+b
}
class B:A(){
    override fun method(a: Int, b: Int)=a+b
}

/*
如果一个默认参数位于其他无默认值的参数前面，那么默认值只能通过在调用函数时使用具名参数的方式来使用。
*/
fun test2(a:Int = 1,b: Int) = println(a - b)

/*
如果函数的最后一个参数是lambda表达式，而且在调用时是位于圆括号之外，
那么就可以不指定lambda表达式的具名参数名。
*/
fun test3(a: Int = 1,b: Int =2,compute: (x: Int,y: Int) ->Unit) {
    compute(a, b)
}


fun main() {
    println(B().method(1))

    println(test2(b=2))
}