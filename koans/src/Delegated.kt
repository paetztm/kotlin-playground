/**
 * Created by paetztm on 3/15/2017.
 */

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Example constructor( d: Delegate){
    var p: String by d

    override fun toString() = "Example class"
}

class Delegate constructor(var s: String){
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$s $thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String){
        println("$s $value has been assigned to ${prop.name} in $thisRef")
    }

}

fun main(args: Array<String>)
{
    val e = Example(Delegate("Dolly"))
    println(e.p)
    e.p = "NEW"

    val sample = LazySample()
    println("lazy = ${sample.lazy}")
    println("lazy = ${sample.lazy}")

    val user = UserObservable()
    user.name = "Carl"

    val userNull = UserNull()
    userNull.init("Carl")
    println(userNull.name)

    val userMap = UserMap(mapOf("name" to "John Doe", "age" to 25))
    println("name = ${userMap.name}, age = ${userMap.age}")
}

class LazySample {
    val lazy: String by lazy {
        println("computed!")
        "my lazy"
    }
}

class UserObservable {
    var name: String by Delegates.observable("no name"){
        d, old, new ->
        println("$d $old - $new")
    }
}

class UserNull {
    var name: String by Delegates.notNull()

    fun init(name: String){
        this.name = name
    }
}

class UserMap(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}
