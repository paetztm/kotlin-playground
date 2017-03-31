package intro_hadi.stdlib

import java.io.File

/**
 * Created by paetztm on 3/30/2017.
 */


fun main(args: Array<String>) {

    val file = File("filename.txt")

    with(file){
        isDirectory

    }

    val string: String? = "Some value"

    string?.let {
        it.length
    }
}