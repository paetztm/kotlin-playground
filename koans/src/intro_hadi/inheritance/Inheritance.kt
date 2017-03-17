package intro_hadi.inheritance

/**
 * Created by paetztm on 3/17/2017.
 */

open class Person() {

    open fun validate() {

    }
}

open class Customer: Person {
    override fun validate(){

    }

    constructor(): super(){

    }
}

fun main(args: Array<String>) {
    val customer = Customer()

    customer.validate()
}