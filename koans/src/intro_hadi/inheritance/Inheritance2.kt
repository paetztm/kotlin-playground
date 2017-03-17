package intro_hadi.inheritance

/**
 * Created by paetztm on 3/17/2017.
 */
open class Person2() {
    open fun validate() {

    }
}

open class Customer2: Person {
    final override fun validate() {

    }

    constructor(): super() {

    }

}

class SpecialCustomer: Customer2() {

}

data class CustomerEntity(val name: String): Person()

fun main(args: Array<String>) {

    val customer = Customer()

    customer.validate()
}