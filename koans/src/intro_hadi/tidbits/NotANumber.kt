package intro_hadi.tidbits

import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader

/**
 * Created by paetztm on 3/29/2017.
 */


class NotANumber(message: String) : Throwable(message) {

}

fun checkIsNumber(obj: Any) {
    when (obj){
        !is Int, Long, Float, Double -> throw NotANumber("This is not a number")
    }
}
fun main(args: Array<String>) {
    /*try {
        checkIsNumber("A")
    } catch (e: NotANumber)
    {
        println("${e.message}")
    }*/

    var buffer: BufferedReader? = null

    // last line is what is returned
    val result = try {
        buffer = BufferedReader(FileReader("input.txt"))
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
    }
    catch (e: FileNotFoundException){
        println("Exception handled")
        -1
    } finally {
        println("Closing")
        buffer?.close()
        -2
    }
    println(result)
}