package advanced_hadi.classes

/**
 * Created by paetztm on 3/31/2017.
 */

typealias Name = String
typealias EmailData = String

data class Employee(val name: Name, val email: EmailData) {
    fun printName(string: Name){

    }
}

fun main(args: Array<String>) {
    val emp = Employee("Tim", "tim@tim.com")

    emp.printName("hello")

}