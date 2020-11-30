package `fun`.soclear.kotlin8

class MyTestClass <K,V>  {
    var k: K? = null
    var y: V? = null
}
    fun main () {
        //myTestClassType是MyTestClass类的KClass对象
        val myTestClassType = MyTestClass::class
        println(myTestClassType.typeParameters)
        println(myTestClassType.typeParameters.size)
        println("first type: " + myTestClassType.typeParameters[0])
        println("second type: " + myTestClassType.typeParameters[1])

    }
