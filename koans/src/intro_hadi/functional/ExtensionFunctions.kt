package intro_hadi.functional

/**
 * Created by paetztm on 3/29/2017.
 */


fun String.hello() {
    println("It's me")
}

fun String.toTitleCase() : String {
    return this.split(" ").joinToString(" ") {it.capitalize() }
}

fun String.withParam(prefix: String): String
{
    return prefix + " " + this
}
fun main(args: Array<String>) {
    println("this is a sample string to Title Case it".toTitleCase())
    println("bonanza".withParam("Hello World"))

    val customer = Customer()
    customer.makePreferred()

    val instance = InheritedClass()
    instance.extension()
}

class Customer {
    fun makePreferred() {
        println("Customer version")
    }
}

fun Customer.makePreferred() {
    println("Extended version")
}

open class BaseClass
class InheritedClass: BaseClass()

fun BaseClass.extension() {
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}