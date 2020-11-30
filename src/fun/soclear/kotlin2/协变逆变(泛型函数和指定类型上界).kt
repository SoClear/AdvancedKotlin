package `fun`.soclear.kotlin2

//泛型函数
fun <T> getValue(t: T): T {
    return t
}

//T:List<T>就指定了类型的上界为List<T>
class UpperBoundsClass<T : List<T>>

//where语句指定了类型T的多个上界
class UpperBoundsClass2<T> where T:Comparable<T>,T:Any