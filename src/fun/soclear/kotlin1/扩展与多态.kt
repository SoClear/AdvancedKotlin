package `fun`.soclear.kotlin1

//1.扩展函数的解析是静态的
/*
1.扩展本身并不会真正修改目标类，也就是说它并不会在目标类中插入新的属性或是方法
2.扩展函数的解析是静态分发的，而不是动态的，即不支持多态，调用只取决于对象的声明类型
3.调用是由对象声明类型所决定的，而不是由对象的实际类型决定
*/
open class AA
class BB : AA()

fun AA.a() = "a"
fun BB.a() = "b"
fun myPrint(aa: AA) {
    println(aa.a())
}


/*
2.如果扩展函数与类内的成员函数签名一样,则调用的是成员函数
 */
class C3 {
    fun foo() {
        println("111")
    }
}

fun C3.foo() {
    println("222")
}


//3.也可以扩展伴生对象的方法
class D1 {
    companion object
}

fun D1.Companion.foo() {
    println("伴生对象的扩展方法")
}


/*3.扩展的作用域
1.扩展函数所定义在的类实例叫做分发接收者(dispatch receiver)
2.扩展函数所扩展的那个类的实例叫做扩展接收者(extension receiver)
3.当以上两个名字出现冲突时，扩展接收者的优先级最高
*/
class DD {
    fun method() {
        println("DD method")
    }
}

class EE {
    fun method(){
        println("EE method")
    }

    fun DD.method(){
        println("EE类中的DD.method")
    }

    fun method2() {
    }

    fun DD.hello() {
        method()
        method2()
    }


    fun world(dd: DD) {
        dd.hello()
    }

    fun DD.output() {
        println(toString())
        println(this@EE.toString())
    }

    fun test() {
        var dd = DD()
        dd.output()
    }
}


class A

fun main() {
    //1.扩展函数的解析是静态的
    myPrint(AA())
    myPrint(BB())


    //2.如果扩展函数与类内的成员函数签名一样,则调用的是成员函数
    val c3 = C3()
    //调用的是C3类本身的方法
    c3.foo()
    D1.foo()


    //3.扩展作用域
    EE().test()
    EE().method()

    A().also {  }
}
