package intro_hadi.basics

/**
 * Created by paetztm on 3/15/2017.
 */

fun main(args: Array<String>) {
    var myString = "Not empty"

    // returns last value per conditional
    val result = if (myString != ""){
       "Not empty"
    } else if (myString.startsWith("a")){
        "Starts with a"
    } else {
        "Hello world"
    }

    // don't need a break
    when (result) {
        is String -> println("Excellent")
        "Value" -> println("It's a value")
    }

    val whenValue = when (result) {
        is String -> println("Excellent")
        "Value" -> println("It's a value")
        else -> {
            println("It came to this")
        }
    }
}