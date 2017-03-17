import java.util.Arrays.asList

/**
 * Created by paetztm on 3/15/2017.
 */

fun start(): String = "OK"

fun main(args: Array<String>)
{
//    println(start())
//    useFoo()
    println(containsEven(asList(1,2,3)))
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)

fun containsEven(collection: Collection<Int>): Boolean = collection.any { it -> it % 2 == 0 }

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2}\.\d{2}\.\d{4}"""

data class Person(val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}
