package intro_hadi.classes

import java.io.IOException
import java.util.*

/**
 * Created by paetztm on 3/17/2017.
 */

class Customer(var id: Int, var name: String = "", val yearOfBirth: Int = 1983){
    @JvmField var email: String = "";
    init {
        name = name.toUpperCase()
    }

    constructor(email: String) : this(0, "", 1983){
        this.email = email
    }

    val age: Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""
    set(value){
        if (!value.startsWith("SN"))
            throw IllegalArgumentException("Social security should start with SN")
        field = value
    }

    fun customerAsString(): String{
        return "Id: $id - Name: $name"
    }

    @JvmOverloads fun changeStatus(status: Status = Status.Current){

    }

    @JvmName("preferential") fun makePreferred(){

    }

    @Throws(IOException::class) fun loadStatistics(filename: String) {
        if (filename == "") {
            throw IOException("Filename cannot be empty")
        }
    }

}

fun Customer.extension() {

}

enum class Status {
    Current,
    Past
}
// internal modifier means accessible anywhere in the same module
fun main(args: Array<String>)
{
    val customer = Customer(10, "Tim")
    val customer2 = Customer(10 )
    val customer3 = Customer("email@gmail.com")
    println(customer.name)
    println(customer3.email)
    println(customer3.age)
    customer.socialSecurityNumber = "SN-ABC"
    println(customer.socialSecurityNumber)
    println(customer.customerAsString())
}