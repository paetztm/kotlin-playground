import java.util.*

/**
 * Created by paetztm on 3/9/2017.
 */

fun main(args: Array<String>)
{
    helloWorld()
    stringTemplate("Hello world")
    manyExamples(Arrays.asList("one", "two", "three"))
    multiLanguage("FR")
    Greeter("Tim").greet()
    println(max(7, 11))
    nullCheck()
    smartCast()
    whileLoop()
    forLoop()
    checkRanges()
    usingWhen()
}

fun usingWhen() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}



fun cases(obj: Any) {
    when (obj){
        1 -> println("one")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}
class MyClass {

}

fun checkRanges() {
    val x = 7

    val y = 10
    if (x in 1..y-1)
        println("Ok")
    else
        println("No OK")

    for (a in 1..5)
        print("${a} ")

    println()

    val array = arrayListOf<String>()
    array.add("aaa")
    array.add("bbb")
    array.add("ccc")

    if (x !in 0..array.size - 1)
        println("Out: array has only ${array.size} elements. x = ${x}")

    if ("aaa" in array)
        println("Yes: array contains aaa")
    if ("ddd" in array)
        println("Yes: array contains ddd")
    else
        println("No: array doesn't contain ddd")
}

fun forLoop() {
    var args = Arrays.asList("one", "two", "three")
    for (arg in args)
        println(arg)

    println()
    for (i in args.indices)
        println(args[i])
}

fun whileLoop() {
    var i = 0
    var args = Arrays.asList("one", "two", "three")
    while (i < args.size)
        println(args[i++])
}

fun smartCast() {
    println(getStringLength("aaa"))
    println(getStringLength(1))
}

fun getStringLength(obj: Any): Int? {
    if (obj is String)
        return obj.length
    return null
}

fun nullCheck() {
    val x = parseInt("1")
    val y = parseInt("2")
    if (x != null && y != null)
        print(x*y)
}

fun parseInt(str: String): Int? {
    try {
        return str.toInt()
    } catch (e: NumberFormatException)
    {
        println("One of the arguments isn't Int")
    }
    return null
}

fun  max(a: Int, b: Int) = if (a > b) a else b

fun multiLanguage(language: String) {
    println(when (language){
        "EN" -> "Hello!"
        "FR" -> "Salut!"
        "IT" -> "Ciao!"
        else -> "Sorry, I can't greet you in $language yet"
    })
}

fun manyExamples(list: List<String>) {
    for (value in list)
        println("Counting: $value")
}

fun stringTemplate(s: String) {
    println("My message: ${s}")
}

fun helloWorld() {
    println("Hello, world!")
}

class Greeter(val name: String)
{
    fun greet() {
        println("Hello, ${name}")
    }
}