package JetBrainsAcademy.IntroductionToKotlin

import java.util.Scanner
fun main1() {

    val scanner = Scanner(System.`in`) // reads data
    scanner.useDelimiter("_")

    //next,nextLine,nextInt
    val num1 = scanner.nextInt() // reads the first number
    val num2 = scanner.nextInt() // reads the second number

    println(num1) // prints the second number
    println(num2) // prints the first number

    scanner.close()

    //hasNext(): Scanner nesnesinin girdi metninde bir sonraki öğenin olup olmadığını kontrol etmek için kullanılmıştır. true-false döner.

}

fun main() {


    //val line = readLine()!! // before Kotlin 1.6 -> kullanmamalısın eski

    //val line = readln() //default olarak string döndürür
    //println(line)


    /*
    println("Enter any number: ")
    val number = readln().toInt()
    print("You entered the number: ")
    print(number)
    */


    /*
    val a = readln()
    val b = readln().toInt()
    val c = readln()
    print(a)
    print(" ")
    print(b)
    print(" ")
    print(c)
    */


    /*

    val (a, b, c, d) = readln().split(" ")
    println(a)
    println(b)
    println(c)
    println(d)

    input
    hello kotlin android compose

    output
    hello
    kotlin
    android
    compose
    */


    //val ch: Char = readln().first() -> char okumak için

    /*escape sequences
    * '\n' is the newline character;

    '\t' is the tab character;

    '\r' is the carriage return character;

    '\\' is the backslash character itself;

    '\'' is the single quote mark;

    '\"' is the double quote mark.
    * */
}