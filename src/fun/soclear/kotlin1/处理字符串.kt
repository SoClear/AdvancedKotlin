package `fun`.soclear.kotlin1

fun main() {
    (2..10).forEach { print(it) }
    (1 until 10).forEach { print(it) }
    println("---------")
    val list1 = listOf("java", "kotlin", "go", "hello", "World")
    if ("kotlin" in list1) {
        println("in")
    }

    //1.长度大于等于5  2.转换为大写  3.排序  4.输出
    list1.filter { it.length >= 5 }.map { it.toUpperCase() }.sorted().forEach { println(it) }

    val list = listOf('a', 'c', 'b', 'b', 'a', 'c', 'd', 'e', 'a', 'z', 'c', 'z', 'e', 'a')
    //统计各个字符出现的次数
    list.groupBy { it }.map { println(it.key to it.value.count()) }
}