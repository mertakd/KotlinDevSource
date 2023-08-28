package JetBrainsAcademy.Basics.Scanner

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    val line = scanner.nextLine()
    val num = scanner.nextInt()
    val string = scanner.next()

    println(line)
    println(num)
    println(string)
    //tarayıcı.next() bir satırı değil yalnızca bir kelimeyi okur.Kullanıcı Merhaba Kotlin girerse Merhaba yazacaktır.
}