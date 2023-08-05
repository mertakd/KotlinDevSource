package JetBrainsAcademy.LambdaExpressions

/*
* Movie databases
Your friend, a film critic, heard that you study Kotlin and asked if you can design a program to fill in some movie information. He wants to have a data class called Movie with three arguments: name, link to the film page on a movie database site, and dataBaseName. The arguments link and dataBaseName have default values, but you will receive new values from standard input. Make it so that your data class can be configured using the data from standard input for different movie databases and output this class to console. Try to use scope functions.

Sample Input 1:

IMDb https://www.imdb.com/title/tt0059362
Sample Output 1:

Movie(name=The Knack ...and How to Get It, link=https://www.imdb.com/title/tt005936

use scope functions
data class Movie(
    var name: String = "The Knack ...and How to Get It",
    var link: String = "https://",
    var dataBaseName: String = "IMDB"
)

fun main() {
    val movie = Movie()
    // write a code which receives new values for link and dataBaseName from standard input
    // and configures your data class parameters using the received values
    movie.apply {
        link = readLine()!!
        dataBaseName = readLine()!!
    }

    print(movie)
}
* */