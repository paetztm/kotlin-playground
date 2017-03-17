package intro_hadi.inheritance

/**
 * Created by paetztm on 3/17/2017.
 */

abstract class StoredEntity{
    val isActive = true
    abstract fun store()

    fun status(): String{
        return "is active: $isActive"
    }
}

class Employee: StoredEntity() {
    override fun store() {

    }

}

fun main(args: Array<String>) {
    val se = Employee()
}