package advanced_hadi.functions

/**
 * Created by paetztm on 3/31/2017.
 */

// only applicable to extension functions or member functions with one parameter
infix fun String.shouldbeEqualTo(value: String) = this == value


fun main(args: Array<String>) {
    println("Hello" shouldbeEqualTo "Hello")


}