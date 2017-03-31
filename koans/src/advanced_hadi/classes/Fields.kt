package advanced_hadi.classes

/**
 * Created by paetztm on 3/31/2017.
 */

class Customer() {
    private var myCustomField = 10

    var lastPurchasedAmount: Double = 0.0
    get() = field
    set(value) {
        if (value > 100){
            field = value
        }
    }
}

fun main(args: Array<String>) {
    val customer = Customer()

    customer.lastPurchasedAmount = 200.0
    println(customer.lastPurchasedAmount)

    customer.lastPurchasedAmount = 50.0
    println(customer.lastPurchasedAmount)
}