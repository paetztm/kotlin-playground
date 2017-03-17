package intro_hadi.inheritance

/**
 * Created by paetztm on 3/17/2017.
 */

interface Repo<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>

}