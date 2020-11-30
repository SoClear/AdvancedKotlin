package `fun`.soclear.kotlin2

/*
协变(covariant),用out来修饰,被修饰的变量只用来被读取.协变指定了类型下界
逆变(contravariant),用in来修饰,被修饰的变量只用来写入,逆变指定了类型上界
 */

class MyClass<out T, in M>(t: T, m: M) {
    private var t: T = t
    private var m: M = m

    fun get(): T = this.t
    fun set(m: M) {
        this.m = m
    }
}

fun myTest(myClass: MyClass<String, Number>) {
    val myObject: MyClass<Any, Int> = myClass
    println(myObject.get())
}


/*
Kotlin:声明处协变;Java:使用处协变
Kotlin中的out关键字叫做variance annotation，因为它是在类型参数声明处所指定的，因此我们
称之为声明处协变(declaration-site variance) 。
对于Java来说则是使用处协变(use-site variance)，其中类型通配符使得类型协变成为可能。
*/


/*
1. 如果泛型类只是将泛型类型作为其方法的输出类型，那么我们就可以使用out

produce = output = out
*/
interface Producer<out T> {
    fun produce(): T
}


/*
2. 如果泛型类只是将泛型类型作为其方法的输入类型，那么我们就可以使用in

consume = input = in
*/
interface Consumer<in T> {
    fun consume(item: T)
}


/*
3. 如果泛型类同时将泛型类型作为其方法的输入类型与输出类型，那么我们就不能使用out与in来修饰泛型
 */
interface ProducerConsumer<T> {
    fun product(): T
    fun consumer(item: T)
}

/**
 * 下面是声明处协变逆变的例子
 * 在声明处协变逆变就是在类或者接口处声明泛型
 */
open class Fruit
open class Apple : Fruit()
class ApplePear : Apple()

class FruitProducer : Producer<Fruit> {
    override fun produce(): Fruit {
        println("Produce Fruit")
        return Fruit()
    }
}

class AppleProducer : Producer<Apple> {
    override fun produce(): Apple {
        println("Produce Apple")
        return Apple()
    }
}

class ApplePearProducer : Producer<ApplePear> {
    override fun produce(): ApplePear {
        println("Produce ApplePear")
        return ApplePear()
    }
}


class FruitConsumer:Consumer<Fruit>{
    override fun consume(item: Fruit) {
        println("consume Fruit")
    }
}

class AppleConsumer:Consumer<Apple>{
    override fun consume(item: Apple) {
        println("consume Apple")
    }
}

class ApplePearConsumer:Consumer<ApplePear>{
    override fun consume(item: ApplePear) {
        println("consume ApplePear")
    }
}


fun main( args: Array<String>) {
    //对于"out"泛型来说，我们可以将子类型对象赋给父类型引用
    val producer1: Producer<Fruit> = FruitProducer()
    val producer2: Producer<Fruit> = AppleProducer()
    val producer3: Producer<Fruit> = ApplePearProducer()

    println("-----")

    //对于"in"泛型来说，我们可以将父类型对象赋给子类型引用
    val consumer1: Consumer<ApplePear> = FruitConsumer()
    val consumer2: Consumer<ApplePear> = AppleConsumer()
    val consumer3: Consumer<ApplePear> = ApplePearConsumer()

    //当调用下面的consume函数的时候,调用的是FruitConsumer类的consume函数,需要的是Fruit类型的变量,而真实传递的是Fruit类型的子类型ApplePear;子类型赋给父类型这是允许的
    consumer1.consume(ApplePear())
    //当调用下面的consume函数的时候,调用的是AppleConsumer类的consume函数,需要的是Apple类型的变量,而真实传递的是Apple类型的子类型ApplePear;子类型赋给父类型这是允许的
    consumer2.consume(ApplePear())
    //当调用下面的consume函数的时候,调用的是ApplePearConsumer类的consume函数,需要的是ApplePear类型的变量,而真实传递的是ApplePear;非常合适
    consumer3.consume(ApplePear())

    //下面语句报错
    //consumer1.consume(Fruit())
    //consumer2.consume(Fruit())
}



