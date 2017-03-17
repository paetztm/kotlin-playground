package intro_hadi.inheritance

/**
 * Created by paetztm on 3/17/2017.
 */

interface CustomerRepository {
    val isEmpty: Boolean
    get() = true

    fun store(obj: Customer){

    }
    fun getbyId(id: Int): Customer
}

class SqlCustomerRepository: CustomerRepository {
    override fun getbyId(id: Int): Customer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun store(obj: Customer) {
        super.store(obj)
    }

}

interface I1 {
    fun funA() {
        println("Fun A from Interface 1")
    }
}

interface I2 {
    fun funA() {
        println("Fun A from Interface 2")
    }
}

class Class1And2: I1, I2{
    override fun funA() {
        super<I2>.funA()
    }
}
fun main(args: Array<String>) {
    println(SqlCustomerRepository())
    val c = Class1And2()
    c.funA()
}