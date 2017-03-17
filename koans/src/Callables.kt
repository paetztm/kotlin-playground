/**
 * Created by paetztm on 3/15/2017.
 */

fun main(args: Array<String>)
{
    val numbers = listOf(1,2,3)
    println(numbers.filter(::isOdd))
    println(numbers.filter(::isEven))

    val oddLength = compose(::isOdd, ::length)
    val strings = listOf("a", "ab", "abc")
    println(strings.filter(oddLength))
}

fun isEven(i: Int): Boolean {
    return i % 2 == 0
}

fun length(s: String) = s.length

fun isOdd(x: Int) = x % 2 != 0

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x))}
}

