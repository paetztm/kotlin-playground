package intro_hadi.tidbits

/**
 * Created by paetztm on 3/29/2017.
 */

open class Person{

}

class Employee: Person() {
    fun vacationDays(days: Int){
        if (days < 60) {
            println("You need more vacation")
        }
    }
}

class Contractor: Person() {

}

fun hasVacations(obj: Person){
    if (obj is Employee)
    {
        obj.vacationDays(20)
    }
}

var input: Any = 10
fun main(args: Array<String>) {

    val str = input as? String
    println(str?.length)
}