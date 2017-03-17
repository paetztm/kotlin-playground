package intro_hadi.classes

/**
 * Created by paetztm on 3/17/2017.
 */

object Global {
    val PI = 3.14
}

fun main(args: Array<String>) {
    println(Global.PI)

    val localObject = object {
        val PI = 3.14159
    }

    println(localObject.PI)
}