package advanced_hadi.classes

/**
 * Created by paetztm on 3/31/2017.
 */

class Log private constructor() {
    // can only have a single companion object
    companion object Factory {
        // jvm static makes it static in java
        @JvmStatic fun createFileLog(filename: String): Log = Log(filename)
    }

    constructor(filename: String): this() {

    }

}

fun main(args: Array<String>) {
    val log = Log.createFileLog("filename.txt")
}