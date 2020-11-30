package `fun`.soclear.kotlin8

/**
 * @param f: (B)->C
 * @param g: (A)->B
 *
 * @return (A)->C
 *
 * 这个函数把两个函数组合起来,x是A类型,g(x)是B类型,f(g(x))是C类型,
 * 整好符合输出结果的类型
 */
fun <A,B,C> myCompose(f: (B) -> C,g: (A)-> B): (A)-> C {
    return { x -> f(g(x))}
}

fun isEven(x: Int) = 0 == x % 2
fun length(s:String)= s.length


fun main() {
    val evenLength= myCompose(::isEven,::length)

    val strings= listOf("a","ab","abc","abcd","abcde")
    println(strings.filter(evenLength))
}

