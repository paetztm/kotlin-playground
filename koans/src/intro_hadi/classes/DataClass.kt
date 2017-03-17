package intro_hadi.classes

/**
 * Created by paetztm on 3/17/2017.
 */

data class Person(val id: Int, val name: String, val email: String){
    override fun toString(): String {
        return "My own custom string $id $name $email"
    }
}

fun main(args: Array<String>) {
    val person = Person(7, "Tim", "email@gmail.com")
    println(person)


}