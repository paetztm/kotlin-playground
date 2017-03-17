package intro_hadi.functions

/**
 * Created by paetztm on 3/17/2017.
 */

fun hello() = println("Hello")

fun throwingExceptions(): Nothing{
    throw Exception("Oh no")
}

fun returnsAFour(): Int{
    return 4
}

fun sum(x: Int, y: Int, z: Int = 0) = x + y + z

fun printDetails(name: String, email: String = "", phone: String)
{
    println("name: $name - email: $email - phone $phone")
}

fun printStrings(vararg strings: String)
{
    // * is "spread operator"
    reallyPrintingStrings(*strings)
}

fun reallyPrintingStrings(vararg strings: String){
    for (string in strings) {
        println(string)
    }
}
fun main(args: Array<String>) {
    hello()
    val value = returnsAFour()
    println(value)
    println(sum(1,2, 3))
    printDetails("Tim", email="email@gmail.com",  phone="555 123 4567")
}
