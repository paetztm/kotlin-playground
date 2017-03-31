package intro_hadi.functional

/**
 * Created by paetztm on 3/29/2017.
 */


fun outsideFunction() {

    for (number in 1 .. 30) {
        unaryOperation(20) { x ->
            println(number)
            x * number
        }
    }

}

fun main(args: Array<String>) {
    outsideFunction()
}