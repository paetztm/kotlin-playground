/**
 * Created by paetztm on 3/9/2017.
 */

fun main(args: Array<String>)
{
    val pair = Pair(1, "one")
    val (num, name) = pair

    println("num = $num, name = $name")

    val user = getUser()
    println("name = ${user.firstname}, id = ${user.id}")

    val (firstname, id) = getUser()

    println("name = $firstname, id = $id")

    println("name = ${getUser().component1()}, id = ${getUser().component2()}")

    val map = hashMapOf<String, Int>()

    map.put("one", 1)
    map.put("two", 2)

    for ((key, value) in map){
        println("key = $key, value = $value")
    }

    println(user)

    val secondUser = User("Timothy", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    println(user.copy())
    println(user.copy("Max"))
    println(user.copy(id=2))
    println(user.copy("max", 2))
}

fun getUser(): User {
    return User("Timothy", 1)
}

data class User(val firstname: String, val id: Int)

class Pair<K, V>(val first: K, val second: V)
{
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}