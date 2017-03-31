package intro_hadi.stdlib

import java.util.*

/**
 * Created by paetztm on 3/30/2017.
 */
fun main(args: Array<String>) {
    var emptyList = emptyList<String>()
    var list = listOf("First", "Second")

    val numbers = 1..100
    val cities = listOf("Madrid", "London", "Paris")

    println(cities.javaClass)
    println(emptyList.javaClass)

    val arrayList = Arrays.asList("Madrid", "London")
    println(arrayList.javaClass)

    val mutableCitites = mutableListOf("Madrid")
    mutableCitites.add("London")

    val hashMap = hashMapOf(Pair("Madrid", "Spain"))

    val booleans = booleanArrayOf(true, false, true)

}