package advanced_hadi.classes

/**
 * Created by paetztm on 3/31/2017.
 */

interface Repository {
    fun getAll(): List<Customer>
}

class CustomerController() {
    lateinit var repository: Repository

    fun index(): String {
        return repository.getAll().toString()
    }
}

fun main(args: Array<String>) {
    val customerController = CustomerController()

    customerController.index()
}