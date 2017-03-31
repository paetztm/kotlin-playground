package intro_hadi.functional

/**
 * Created by paetztm on 3/29/2017.
 */


fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int{
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y

// unit is basically void here
fun operation(x: Int, op: (Int) -> Unit){

}

fun route(path: String, vararg actions: (String, String) -> String){

}

fun unaryOperation(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun unaryOp(op: (Int) -> Int){

}

fun transaction( db: Database, code: () -> Unit){
    try {
        code()
    } finally {
        db.commit()
    }

}

class Database {
    fun commit() {}

}

fun main(args: Array<String>) {
    println(operation(1, 2, ::sum))

    println(operation(1, 2, { x, y -> x - y}))

    println(unaryOperation(2, {x -> x * x}))
    println(unaryOperation(3, {it * it}))

    unaryOperation(3) {it * it}

    unaryOp {
        it * it
    }
    val db = Database()
    transaction(db) {
        // interact with db
    }

    // anonymous function
    // can have multiple return types
    unaryOperation(3, fun(x: Int): Int { return x * x})
}