package `fun`.soclear.kotlin6

//java的泛型在经过编译后,并没有存储在字节码中,而是从Object类型转换为对应的类型,这叫做类型擦除.
//而Kotlin对于JVM平台也是如此

//Kotlin的扩展函数实际是把当前对象作为扩展函数的一个参数
fun List<String>.myFilter():List<String> {
    return listOf("hello","world")
}

//fun List<Int>.myFilter():List<Int> {
//    return listOf(1,2)
//}

/*
上面这两个的函数签名相同,无法同时存在.
可以通过注解来更改函数的JvmName来实现共存
 */

//这个JvmName是更改签名和供Java调用之用
//kotlin调用时,使用的是扩展函数名,而不是JvmName
@JvmName("myFilter2")
fun List<Int>.myFilter():List<Int> {
    return listOf(1,2)
}

class MyClass{
    val a:Int
        //更改Kotlin自动生成的getter方法的JvmName
        //java用这个JvmName来调用getter方法
        //而kotlin直接对象.a就可以
        @JvmName("getAValue")
        get() = 20

    fun getA()=30
}


//添加@JvmOverloads便会生成为java调用生成重载
/*
MyClass2(int x)
MyClass2(int x,String y)
 */
class MyClass2 @JvmOverloads constructor(x:Int, y:String="hello"){
    fun myMethod(a:Int,b:String,c:Int=2){
        println("a= $a ,b=$b ,c= $c")
    }
}



fun main() {
    val list1= listOf("a")
    println(list1.myFilter())

    //kotlin调用时,使用的是扩展函数名,而不是JvmName
    val list2= listOf(99)
    println(list2.myFilter())

    val me= MyClass()
    println(me.a)
    println(me.getA())
}

