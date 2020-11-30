package `fun`.soclear.kotlin3

data class MyResult(val result:String,val status:Int)

fun myMethod1():MyResult{
    return MyResult("success",1)
}

fun myMethod2():Pair<String,Int> {
    return Pair("success",1)
}

fun main() {
    //下面(result1,status1)就是解构声明
    val (result1,status1)= myMethod1()
    println(result1)
    println(status1)

    //下面(result2,status2)就是解构声明
    val (result2,status2)= myMethod1()
    println(result2)
    println(status2)
}