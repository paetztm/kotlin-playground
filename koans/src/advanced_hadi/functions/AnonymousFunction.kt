package advanced_hadi.functions

/**
 * Created by paetztm on 3/31/2017.
 */


fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main(args: Array<String>) {

    // same thing
    op(3, {it * it})
    op(3, {x -> x * x})
    op(2, fun(x): Int {return x*x})

    // you can do more with this though
    op(2, fun(x): Int {
        if (x > 10)
            return 0
        return x*x
    })
}