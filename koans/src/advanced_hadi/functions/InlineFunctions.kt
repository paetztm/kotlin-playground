package advanced_hadi.functions

/**
 * Created by paetztm on 3/31/2017.
 */

// inlining only makes sense when passing lambda
inline fun operation(op: () -> Unit) {
    println("Before calling op")
    op()
    println("After calling op")
}

// you can also prevent inlining on individual lambdas
inline fun operation2(noinline op: () -> Unit, op2: () -> Unit)
{

}
fun anotherFunction() {
    operation {println("Hello world")}
}
fun main(args: Array<String>) {
    operation { println("This is the actual op function") }
}

// can't inline references
inline fun tryingToInline(noinline op: () -> Unit)
{
    val reference = op
    println("Assigned value")
    op()
}