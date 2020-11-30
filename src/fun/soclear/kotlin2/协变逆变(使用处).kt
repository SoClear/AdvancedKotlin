package `fun`.soclear.kotlin2

import kotlin.test.assertEquals

//use-site variance(type projection)，类型投影,也叫使用处协变逆变

//使用处协变,from变量只用来被读取,数组的浅拷贝
fun copy(from: Array<out Any>, to: Array<Any>) {
    assertEquals(from.size, to.size)
    for (i in from.indices) {
        to[i] = from[i]
    }
}

//使用处逆变,to变量只用来被写入
fun setValue(to: Array<in String>, index: Int, value: String) {
    to[index] = value
}


fun main() {
    //使用处协变
    val from = arrayOf(1, 2, 3, 4)
    val to = Array<Any>(4) { "hello $it" }
    to.forEach { print(it) }
    println()
    copy(from, to)
    to.forEach { print(it) }
    println()


    //使用处逆变
    val array: Array<Any> = Array(4){"hello $it"}
    setValue(array,0,"world")
    array.forEach { print(it) }
}

