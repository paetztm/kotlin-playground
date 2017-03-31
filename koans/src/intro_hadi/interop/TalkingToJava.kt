package intro_hadi.interop

/**
 * Created by paetztm on 3/30/2017.
 */

fun main(args: Array<String>) {
    val customer = CustomerJava()
    customer.email = "abc@google.com"
    customer.prettyPrint()
    val pk = PersonKotlin()
    pk.firstname = "Bob"
    pk.lastname = "Smith"
    println(pk)

    val runnable = Runnable { println("Invoking runnable")}

    val kr = KotlinCustomerRepo()
    val customerJava = kr.getById(10)

    customerJava.id
    customerJava.neverNull()

}

class PersonKotlin : PersonJava() {

}

fun PersonKotlin.extension() {

}
class KotlinCustomerRepo: CustomerRepoJava {

    override fun getById(id: Int): CustomerJava {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun getAll(): MutableList<CustomerJava> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
