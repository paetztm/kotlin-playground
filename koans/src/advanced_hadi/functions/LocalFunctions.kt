package advanced_hadi.functions

/**
 * Created by paetztm on 3/31/2017.
 */


fun foo(fooParam: String) {

    val outerFunction = "outer"
    fun bar(barParam: String) {
        println(barParam)
        println(fooParam)
        println(outerFunction)
    }
}

fun main(args: Array<String>) {
    // can't access bar
    foo("hello")
}