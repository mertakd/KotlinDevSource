package JetBrainsAcademy.Loops

import java.util.*

fun main1() {

    /*
    //çift olan sayıları yazdır
    var i = 0
    while (i < 10){
        i++
        if (i % 2 == 0){
            print("$i")
        }
    }
     */

/**
 * şart sağlanmasa da kontrol ediliyor
    var i = 5

    do {
        i++
        print("$i")
        i -= 2

    }while (i > 1)

 */
}

fun main2() {
    var count = 0
    var num = readLine()!!.toInt()

    while (num != 0) {
        count++
        num = readLine()!!.toInt()
    }

    println(count)
}

fun main3() {
    //verilen sayıları birbiriyle topluyor.
    var sum = 0
    var num = readLine()!!.toInt()


    while (num != 0){
        sum += num
        num = readLine()!!.toInt()
    }
}


fun main4() {

    var i = 0

    while (i < 5) {
        println(i)
        i++
    }

    println("Completed")
}


fun main5() {

    var letter = 'A'

    while (letter <= 'Z') {
        print(letter)
        letter++
    }
}


fun main6() {
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val next = scanner.next()
        println(next)
    }
}

fun main7() {

    do {
        val n = readln().toInt()
        println(n)
    } while (n > 0)
}

fun main8() {

    var i = 5

    do {
        i++
        print("$i ")
        i -= 2
    } while (i > 1)
}

fun main9() {

    var i = 0
    while (i < 10) {
        i++
        if (i % 2 == 0) {
            print("$i ")
        }
    }
}


fun main10() {
    var sum = 0
    var num = readLine()!!.toInt()

    while (num != 0) {
        sum += num
        num = readLine()!!.toInt()
    }

    println(sum)
}

fun main() {
    var maxElement = Int.MIN_VALUE
    var input: Int

    do {
        input = readLine()!!.toInt()
        if (input > maxElement) {
            maxElement = input
        }
    } while (input != 0)

    println(maxElement)
}
