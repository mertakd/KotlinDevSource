package JetBrainsAcademy.IntroductionToKotlin

import java.util.Scanner
fun main() {

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