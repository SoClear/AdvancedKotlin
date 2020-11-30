package `fun`.soclear.kotlin8

fun multiplyBy3(x: Int): Int {
    return 3 * x
}

fun multiplyBy3(x: String): Int {
    return 10
}

/**
 * 类名::方法名 是方法引用
 */
fun main() {
    val list = listOf(1, 2, 3, 4)
    println(list.map(::multiplyBy3))

    val list2 = listOf("a", "b", "c", "d")
    println(list2.map(::multiplyBy3))
}

val reference1: String.(Int) -> Char = String::get

