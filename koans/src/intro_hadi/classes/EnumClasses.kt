package intro_hadi.classes

/**
 * Created by paetztm on 3/17/2017.
 */

enum class Priority(val value: Int) {
    MINOR(-1) {
        override fun text(): String {
            return "Minor"
        }

        override fun toString(): String {
            return "Minor Priority"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            return "Normal"
        }
    },
    MAJOR(1) {
        override fun text(): String {
            return "Major"
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            return "Critical"
        }
    }; // this semi colon is required

    abstract fun text(): String
}

fun main(args: Array<String>) {
    val priority = Priority.NORMAL
    println(priority)
    println(priority.value)
    println(priority.ordinal)
    println(Priority.CRITICAL.ordinal)

    for (p in Priority.values().reversed())
    {
        println(p)
        println(p.text())
    }

    val p = Priority.valueOf("MAJOR")
    println(p.ordinal)
}