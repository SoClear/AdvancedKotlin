package `fun`.soclear.kotlin7

import java.io.FileNotFoundException

//在Kotlin中，不存在checked exception
class MyClass {
    //Throw方法修饰一个kotlin方法,在这个方法中可能抛出checked exception,来供java用try...catch来调用
    @Throws( FileNotFoundException ::class)
    fun method() {
        println("method invoked")
        throw FileNotFoundException()
    }
}
