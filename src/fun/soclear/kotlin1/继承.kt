package `fun`.soclear.kotlin1

open class Parent(name: String)

class Child : Parent {
    //在Kotlin中，如果一个类没有显式声明primary构造方法， 那么这个类的每个secondary构造方法就需要通过
    // super关键字来初始化父类型，或是通过其他secondary构造方法完成这个任务
    //不同的secondary构造方法可以调用父类型不同的构造方法
    constructor(name: String) : super(name)
}

open class MyParent3 {
    open fun method() {
        println("parent method")
    }

    open val name: String get() = "parent"

}

class MyChild3 : MyParent3() {
    override fun method() {
        super.method()
        println("child method")
    }

    override val name: String
        get() = super.name + "and child"
}

// 1. val可以override父类的val
// 2. var可以override父类的val
// 3. var可以override父类的var
// 4. val无法override父类的var
//本质上，va1相当于get方法; var相当于get与set方法
open class P{
    open var name:String="Peter"
}

//P后面的括号是实例化对象
class C: P(){
    //下面报错
//    override val name: String
//        get() = super.name
//        set(value) {}
}