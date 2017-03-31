package advanced_hadi.functions

/**
 * Created by paetztm on 3/31/2017.
 */

fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

fun containingFunction() {
    val numbers = 1..100

    numbers.forEach{
        if (it % 5 == 0)
            return@forEach
    }

    numbers.forEach myLabel@{
        if (it % 5 == 0)
            return@myLabel
    }

    // can only be returned with inline functions
    numbers.myForEach {
        // return is an error here
//        if (it % 5 == 0)
//            return
    }

    // can return if you use anonymous function instead of lambda
    numbers.forEach( fun(element){
        if (element % 5 == 0)
            return
    })

    println("Hello")
}

fun main(args: Array<String>) {
    containingFunction()
}