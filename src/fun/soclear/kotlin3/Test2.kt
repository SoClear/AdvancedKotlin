package `fun`.soclear.kotlin3


class Greeting {
    var hello = "hello"
}

fun main() {
    val hello = """
        https://www.tupianzj.com/meinv/20200814/215896.html" id="bigpicimg"
    """.trimIndent()
    println(hello.substringAfterLast('/'))
    println(hello.substringAfterLast('/').length)

    val world="共3页"
    println(world.substring(1,world.lastIndex))

//    println(hello.replace(".html","_${6+6}.html"))
//    println(hello.substringBefore('"'))
}