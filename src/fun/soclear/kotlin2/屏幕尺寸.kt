package `fun`.soclear.kotlin2

import kotlin.math.sqrt

/**
 * @param length
 * @param hwr 高和宽的比值
 */
fun screenSize(length:Double,hwr:Pair<Int,Int>){
    val cmLength=length*2.54
    val rate=cmLength/ sqrt(with(hwr){
        (first*first+second*second).toDouble()
    })

    val height=rate*hwr.first
    val width=rate*hwr.second

    println("屏幕高$height 厘米,宽$width 厘米,对角线长$cmLength 厘米")
}

fun main() {
//    screenSize(6.2,(20 to 9))
//    screenSize(6.7,Pair(3200,1440))
//    screenSize(5.84,(19 to 9))
//    screenSize(5.8,(20 to 9))
//    screenSize(5.99,(18 to 9))
    screenSize(12.4,(2800 to 1752))
}