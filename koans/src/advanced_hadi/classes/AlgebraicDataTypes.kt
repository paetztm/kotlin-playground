package advanced_hadi.classes

/**
 * Created by paetztm on 3/31/2017.
 */

sealed class PageResult{

}

// sealed subclasses must be in the same file
class Success(val content: String): PageResult()
class Error(val code: Int, val message: String): PageResult()
class MediumSuccess(): PageResult()

fun getUrlPage(url: String): PageResult {
    val wasValidCall = false

    if (wasValidCall) {
        return Success("The content")
    }
    else {
        return Error(404, "ERROR")
    }
}

fun main(args: Array<String>) {
    val pr = getUrlPage("index.html")

    when (pr) {
        is Success -> println(pr.content)
        is Error -> println(pr.message)
    }
}