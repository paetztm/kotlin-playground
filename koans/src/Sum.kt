/*
 * Your task is to implement the sum() function so that it computes the sum of
 * all elements in the given array a.
 */

import java.util.Arrays.asList
import java.util.Arrays.parallelSetAll

fun sum(a: IntArray): Int {
    // Write your solution here
    return a.sum()
}

fun indexOfMax(a: IntArray): Int? {
    val nullInt: Int? = null
    if (a.isEmpty())
        return nullInt

    val max = a.max()
    if (max != null)
        return a.indexOf(max)
    else
        return nullInt
}

fun main(args: Array<String>){

//    println(sum(intArrayOf(0)) == 0)
//    println(sum(intArrayOf(0,1)) == 1)
//    println(sum(intArrayOf(1,1)) == 2)
//    println(indexOfMax(intArrayOf()))
//    println(runs(intArrayOf(1,1,1,2,1,1,2,2)))
    println(findPairless(intArrayOf(1,1,2,2,3,4,4)))
}

fun runs(a: IntArray): Int {
    // Write your solution here
    var total = 0
    var previousValue = -1

    for (i in a.indices)
    {
        if (i == 0) {
            previousValue = a[i]
            total++
            continue
        }
        if (previousValue != a[i])
            total++
    }

    return total
}

fun isPalindrome(s: String): Boolean {
    // Write your solution here
    return s == s.reversed()
}

fun findPairless(a: IntArray): Int {
    // Write your solution here
    var result = 0
    for (i in a.indices){
        result = result.xor(a[i])
    }
    return result
}