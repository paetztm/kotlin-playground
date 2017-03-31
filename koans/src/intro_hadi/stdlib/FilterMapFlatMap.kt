package intro_hadi.stdlib

/**
 * Created by paetztm on 3/30/2017.
 */


data class Album(val title: String, val year: Int, val chartUK: Int, val chartUS: Int, val tracks: List<Track> = listOf())

data class Track(val title: String, val durationInSeconds: Int)

val albums = listOf(
        Album("That Dark Side of the moon", 1973, 2, 1,
                listOf(
                        Track("Speak to me", 90),
                        Track("Breathe", 163),
                        Track("On he run", 216)

                )
        ),
        Album("The Wall", 1979, 3, 1),
        Album("Wish you were here", 1975, 1, 1)
)

fun main(args: Array<String>) {

    for (album in albums){
        if (album.chartUK == 1)
            println(album.title)

    }

    albums.forEach{
         if (it.chartUK == 1) println("Found it ${it.title}")
    }

    albums.filter { it.chartUK == 1 }.forEach{println("Found its ${it.title}")}

    val titles = albums.filter {
        it.chartUK == 1
    }.map(Album::title)

    titles.forEach(::println)

    albumAndTrackLowerThanXSeconds(200, albums).forEach(::println)
}

fun albumAndTrackLowerThanXSeconds(durationInSeconds: Int, albums: List<Album>): List<Pair<String, String>>
{
    return albums.flatMap {
        val albumTitle = it.title
        it.tracks.filter {
            it.durationInSeconds < durationInSeconds
        }.map {
            Pair(albumTitle, it.title)
        }
    }
}