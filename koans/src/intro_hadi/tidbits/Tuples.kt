package intro_hadi.tidbits

/**
 * Created by paetztm on 3/29/2017.
 */


fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 230000)
}


fun countryInformation(country: String): Triple<String, String, Long>
{
    return Triple("Madrid", "Europe", 230000)
}
fun main(args: Array<String>) {
    val result = capitalAndPopulation("Madrid")
    println(result.first)
    println(result.second)

    val countryInfo = countryInformation("Madrid")
    println(countryInfo.third)

    val (capital, population) = capitalAndPopulation("Madrid")
    println(capital)
    println(population)

    val (cap, country, pop) = countryInformation("Madrid")

    val listCapitalsAndCountries = listOf(Pair("Madrid", "Spain"), "Paris" to "France")

    for ((capital, country) in listCapitalsAndCountries)
    {
        println("$capital, $country")
    }
}