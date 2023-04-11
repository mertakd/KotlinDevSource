package JetBrainsAcademy.SimpleChattyBot

import java.util.*

fun main() {
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