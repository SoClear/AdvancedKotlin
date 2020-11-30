package `fun`.soclear.kotlin2

/*
star projection(星投影）

1. star<out T>∶如果T的上界是TUpper，那么start<*>就相当于star<out T>，
   这表示当T的类型未知时，你可以从start<*>当中安全地读取TUpper类型的值

2. star<in T>: star<*>就相当于star<in Nothing>，这表示你无法向其中写入任何值

3. Star<T>，如果r的上界为TUpper，那么star<*>就相当于读取时的star<out TUpper>以及写入时的star<in Nothing>
*/

class Star<outT>
class Star2<in T> {
    fun setValue(t: T) {
    }
}
class Star3<T>(private val t:T){
    fun setValue(t: T) {}
    fun getValue()=t
}

fun main() {
    val star=Star<Int>()
    //1.你可以从start<*>当中安全地读取TUpper类型的值
    val star2:Star<*> = star


    //2. star<in T>: star<*>就相当于star<in Nothing>，这表示你无法向其中写入任何值
    val star3:Star2<Int> = Star2<Number>()
    val star4:Star2<*> = star3
    star3.setValue(1)
    //下面这句报错,star<in Nothing>，这表示你无法向其中写入任何值
//    star4.setValue()


    //3.  Star<T>，如果r的上界为TUpper，那么star<*>就相当于读取时的star<out TUpper>以及写入时的star<in Nothing>
    val star5=Star3<String>("hello")
    val star6:Star3<*> =star5
    //可读不可写入
    star6.getValue()
//    star6.setValue()
}