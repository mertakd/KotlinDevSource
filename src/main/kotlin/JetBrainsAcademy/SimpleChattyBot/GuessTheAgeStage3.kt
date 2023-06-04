package JetBrainsAcademy.SimpleChattyBot

import java.util.*

fun main1() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have,$name!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val remainder3 = readln().toInt()
    val remainder5 = readln().toInt()    // reading all remainders
    val remainder7 = readln().toInt()
    val yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Your age is $yourAge; that's a good time to start programming!")
}



fun main() {
    println(
        """
        Hello! My name is Aid.
        I was created in 2020.
        Please, remind me your name.
        What a great name you have, ${readLine()!!}!
        Let me guess your age.
        Enter remainders of dividing your age by 3, 5 and 7.
    """.trimIndent()
    )
    val yourAge = (readLine()!!.toInt() * 70 + readLine()!!.toInt() * 21 + readLine()!!.toInt() * 15) % 105
    println("Your age is $yourAge; that's a good time to start programming!")
}


//9.6, 5.8, 4.1