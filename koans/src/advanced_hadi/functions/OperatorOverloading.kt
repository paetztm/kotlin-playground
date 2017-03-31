package advanced_hadi.functions

/**
 * Created by paetztm on 3/31/2017.
 */

data class Time(val hours: Int, val mins: Int) {
    operator fun plus(time: Time): Time {
        val minutes = this.mins + time.mins
        val hoursInMinutes = minutes / 60
        val remiainingMinutes = minutes % 60
        val hours = this.hours + time.hours + hoursInMinutes
        return Time(hours, remiainingMinutes)
    }
}

operator fun StringBuilder.plus(stringBuilder: StringBuilder) {
    stringBuilder.forEach { this.append(it) }
}

fun main(args: Array<String>) {
    val newTime = Time(10, 40) + Time(3, 20)

    println(newTime)


}