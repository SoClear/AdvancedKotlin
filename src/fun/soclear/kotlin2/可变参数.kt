package `fun`.soclear.kotlin2

fun <T> convert2List(vararg element:T) :List<T> {
//    println(element.javaClass)
    val result=ArrayList<T>()
    element.forEach { result.add(it) }
    return result
}

fun main() {
    convert2List("a","2","6")

    val arr= arrayOf("a","b","c")

    //加上*号,就相当于把Array<String>看作可变参数传递
    println(convert2List("a",arr))
    println(convert2List("a",*arr))
}