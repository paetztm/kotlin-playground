package intro_hadi.inheritance

/**
 * Created by paetztm on 3/29/2017.
 */

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

// don't need the <T>
interface Repos {
    fun <T> getById(id: Int): T
    fun <T> getAll(): List<T>
}
fun main(args: Array<String>) {
    val customerRepo = GenericRepository<Customer>()

    val customer = customerRepo.getById(10)
    val customers = customerRepo.getAll()
}