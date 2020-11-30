package `fun`.soclear.kotlin2

sealed class Parent1 {
    object Child1 : Parent1()
    object Child2 : Parent1()
}

fun cal(a: Int, b: Int, cal: Parent1) = when (cal) {
    is Parent1.Child1 -> a + b
    is Parent1.Child2 -> a - b
}

fun main() {
    println(cal(5,6,Parent1.Child1))
    println(cal(5,6,Parent1.Child2))
}