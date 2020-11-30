package `fun`.soclear.kotlin3

fun main() {
    val map = mapOf("a" to "aa", "b" to "bb", "c" to "cc")

    //mapValues是改变值,entry是遍历对象
    map.mapValues { entry -> "${entry.value} hello" }.forEach { println(it) }
    //下面的(key,value)就是解构声明
    map.mapValues { (key, value) -> "$value hello" }.forEach { println(it) }
    //如果解构声明中的参数没有用到可以用_代替
    map.mapValues { (_, value) -> "$value hello" }.forEach { println(it) }
    //(_,value)是参数,:Map.Entry<String,String>是类型,"$value hello"是执行体
    map.mapValues { (_, value): Map.Entry<String, String> -> "$value hello" }.forEach { println(it) }


    val mList = mutableListOf("hello", "world", "hello world")
    //这种赋值方法类似指针指向
    val list1: List<String> = mList
    //这种赋值方法类似指针指向
    val list2 = mList
    mList.add("kotlin")
    println(list1)
    println(list2)

    //hashSet会值保留一个相同的元素
    val hashSet = hashSetOf("a", "b", "c", "c", "b")
    println(hashSet.size)

    //只读类型是协变的,因为它只用于从集合中获取数据,而不会修改集合中的数据
    //List类型就是协变的
    val s = listOf("a", "b", "c")
    val s2: List<Any> = s

    //快照
    //toList扩展方法只是复制原集合中的元素，所以返回的集合就可以确保不会发生变化,类似于传值
    val items = mutableListOf("a", "b", "c")
    val items2 = items.toList()

    items.add("d")
    println(items)
    println(items2)


    val hashMap = hashMapOf("hello" to 1, "world" to 2)
    println(hashMap["hello"])
    println(hashMap)

    val map2:HashMap<String,Int> =HashMap(hashMap)
    println(map2)
}