package `fun`.soclear.kotlin8

class MyTestClass13 {
    var name: String = "spark"
    val price = 20.3
}

var test = "test"
fun main() {
    val topProp = ::test
    topProp.set("修改后的值")
    println(topProp.get())
    println(test)
    val myTestClass13 = MyTestClass13()
    var name = MyTestClass13::name
    name.set(myTestClass13, "Ruby")
    println(name.get(myTestClass13))
    val prop = MyTestClass13::price
    println(prop.get(myTestClass13))
}
