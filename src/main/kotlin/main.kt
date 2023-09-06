import Kekod.Boo
import java.util.*


fun main() {

    val partyList = listOf("Fred", "Emma", "Isabella", "James", "Olivia")

    if (!partyList.isEmpty()) {
        val size = partyList.size
        val whoIsFirst = partyList[0]
        println("The party will not be lonesome! We already got $size people. And $whoIsFirst was the first to arrive today!")
        // The party will not be lonesome! We already got 5 people. And Fred was the first to arrive today!
        println("Emma came in ${partyList.indexOf("Olivia") }") // Emma came in 2
        println("Guys, is it true that Isabella came? It's ${partyList.contains("mert")}") // Guys, is it true that Isabella came? It's true
    }

    val participants = listOf("Fred", "Emma", "Isabella")

    for (participant in participants) {
        println("Hello $participant!")
    }

    // Hello Fred!
    // Hello Emma!
    // Hello Isabella!

}


