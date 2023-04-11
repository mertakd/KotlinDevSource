package JetBrainsAcademy.RelationalOperators

import java.util.Scanner

fun main2() {

    val reese = readLine()!!.toInt()
    val weekend = readLine()!!.toBoolean()



    val reeseW = reese in 10..20 && !weekend  || reese in 15..25 && weekend
    println(reeseW)


}

fun main3(){

    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()


    val result = a >= b && b != c

    println(result)

}


const val TEN = 10
fun main4() = print(readln().toInt() < TEN)


fun main5(){

    val value = readLine()?.toIntOrNull()

    if (value !=null && value < 10){
        println("true")
    }else{
        println("false")
    }
}

fun main6() = println(readLine()!!.toInt() in 1..9)

fun main7(){
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()


    val areDifferent = num1 != num2 && num1 != num3 && num2 != num3
    println(areDifferent)
}

fun main8() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    val sumAB = a + b
    val sumAC = a + c
    val sumBC = b + c

    val isSum20 = sumAB == 20 || sumAC == 20 || sumBC == 20
    println(isSum20)


}

fun main9() {
    repeat(4) {
        val c = readLine()!!.first()
        println((c.toInt() - 1).toChar())
    }
}

fun main10() {
    val time = readLine()!!.replace(" ", ":")
    val date = readLine()!!.replace(" ", "/")

    print("$time $date")
}

fun main11() {
    val s = "string"
    print("${s.length}")
}


fun main12() {
    val x = 11

    if (x * 2 + 1 < 23 && x % 2 == 1) {
        print("1")
        print(if (x == 11) "2" else "3")
    } else if (x != 0) {
        print("4")
    }
    print("5")
}

fun main13() {
    val n = readLine()!!.toInt()
    var dCount = 0
    var cCount = 0
    var bCount = 0
    var aCount = 0
    repeat(n) {
        when (readLine()!!.toInt()) {
            2 -> dCount++
            3 -> cCount++
            4 -> bCount++
            5 -> aCount++
        }
    }
    println("$dCount $cCount $bCount $aCount")
}


fun main14() {
    var i = 0

    while (i < 5) {
        println(i)
        i++
    }

    println("Completed")
}

fun main15() {
    var i = 0
    while (i < 10) {
        i++
        if (i % 2 == 0) {
            print("$i ")
        }
    }
}


fun main() {
    var i = 5

    do {
        i++
        print("$i ")
        i -= 2
    } while (i > 1)
}



