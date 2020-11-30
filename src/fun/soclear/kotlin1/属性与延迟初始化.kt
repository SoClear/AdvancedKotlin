package `fun`.soclear.kotlin1

class ThePerson(address: String, name: String) {
    val age: Int
        get() = 20

    //属性可以设置成private的
    var address: String = address
        //get/set方法也可以设置成private的
        get() {
            println("get invoked")
            return field
        }
        set(value) {
            println("set invoked")
            field = value
        }
}




/** .
 *延迟初始化属性
 * Kotlin要求非空类型的属性必须要在构造方法中进行初始化
 *有时，这种要求不太方便，比如可以通过依赖注入或是单元测试情况下进行属性的赋值。
 * 通过lateinit关键字标识属性为延迟初始化，需要满足如下3个条件: .
 * 1. lateinit只能用在类体中声明的var属性.上，不能用在primary constructor声明的属性上
 * 2.属性不能拥有自定义的setter与getter.
 * 3.属性类型需要为非空，且不能是原生数据类型
 */
class TheClass2{
    lateinit var name: String

    fun init(){
        name="ZhangSan"
    }
}



fun main() {
    val p= ThePerson("衡水", "张三")
    println(p.age)
    println(p.address)
    p.address="北京"


    val p2= TheClass2()
    p2.init()
    println(p2.name)
}
