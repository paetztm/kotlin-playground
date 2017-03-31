package advanced_hadi.functions

/**
 * Created by paetztm on 3/31/2017.
 */

fun factorial(number: Int): Int {
    when (number) {
        0, 1 -> return 1
        else -> return number * factorial(number - 1)
    }
}

// to be tail recursive needs to return itself
tailrec fun factorialTR(number: Int, accumulator: Int = 1): Int{
    when (number) {
        0 -> return accumulator
        else -> return factorialTR(number-1, accumulator*number)
    }
}
fun main(args: Array<String>) {
    println(factorial(5))
    println(factorialTR(5))

}