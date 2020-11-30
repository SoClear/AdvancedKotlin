package `fun`.soclear.kotlin3

class Invokable {
    var numberOfInvocations: Int = 0
        private set

    operator fun invoke(): Invokable {
        numberOfInvocations++
        //返回的是当前对象
        return this
    }
}
//当前对象不断调用invoke方法
fun invokeTwice(invokable: Invokable) = invokable()()()

fun main() {
//    println(invokeTwice(Invokable()).numberOfInvocations)

    val list = mutableListOf("hello", "1.jpg", "2.png")
//    list.filter { it.contains(".jpg") }.forEach { println(it) }
    list.filter { it.contains("jpg") }.toMutableList()
    list.removeIf { it.contains("png") }
    println(list.javaClass)
}