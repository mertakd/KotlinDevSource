package JetBrainsAcademy.Repeat

import java.util.*

fun main1() {

    repeat(3) {
        println("Hello")
    }
}

fun main2() {


        repeat(3) {
            println(it)
        }

    //0,1,2

}

fun main3() {

    val n = readln().toInt()
    var sum = 0

    repeat(n) {
        val next = readln().toInt()
        sum += next
    }

    println(sum)
}

fun main4() {

    var number = 1
    repeat(5) {
        number++
    }

    println(number)
}

fun main5() {

    var number = 5

    repeat(2) {
        number--
    }

    repeat(0) {
        number--
    }

    repeat(1) {
        number--
    }

    println(number)
}

fun main6() {

    val line = readln()
    repeat(10){
        println("${it} ${line} ")
        //it index sayısı, line girilen input
    }
}

fun main7() {

    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var (d, c, b, a) = arrayOf(0, 0, 0, 0)
    repeat(n) {
        val x = scanner.nextInt()
        when (x) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }
    print("$d $c $b $a")


}


fun main8() {

    val n = readLine()!!.toInt()
    var count = 0
    repeat(n) {
        val num = readLine()!!.toInt()
        if (num > 0) {
            count++
        }
    }
    println(count)
}

fun main() {

    val n= readln().toInt()

    repeat(n){
        print("$n")
    }
}