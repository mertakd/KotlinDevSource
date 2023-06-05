package JetBrainsAcademy.ForLoopAndRanges

import java.util.*

fun main1() {

    for (i in 1..4){
        println(i)
    }


    for (ch in 'a'..'c') {
        println(ch)
    }


    val str = "Hello!"
    for (ch in str){
        println(ch)
    }


    println("GERIYE DOGRU GITMEK")
    //geriye doğru yineleme
    for (i in 4 downTo 1){
        println(i)
    }


    println("ust limit harıc")
    //üst limit hariç -> çıktı 1 2 3 yani 4 yazılmaz.
    for (i in 1 until 4){
        println(i)
    }


    println("adım belirlemek")
    for (i in  1..7 step 2 ){
        println(i)
    }


    println("geriye doğru 2 şer gitmek")
    for (i in 7 downTo 1 step 2){
        println(i)
    }

}

fun main2() {

    val n = readln().toInt()
    var result = 1

    for (i in 2..n){
        result *= i
    }

    println(result)
}


fun main3() {

    for (i in 2..10 step 2) {
        for (j in 2..10 step 2) {
            print(i * j)
            print('\t')  // print the product of i and j followed by one tab
        }
        println()
    }

}


fun main4() {

    // tam sayıya bölünebiliyor mu.
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()
    var count = 0
    for (i in a..b) {
        if (i % n == 0)
            count++
    }
    println(count)
}

fun main5() {

    // tam sayıya bölünebiliyor mu.başka versiyonu
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()
    println((a..b).count { it % n == 0 })
}

fun main6() {

    //a ve b aralığında ki sayıların toplamı
    val a = readln().toInt()
    val b = readln().toInt()
    var sum = 0

    for (i in a..b){
        sum+= i
    }
    println(sum)
}

fun main7() {

    val a = readln().toInt()
    val b = readln().toInt()
    var product = 1L
    for (i in a until b) {
        product *= i
    }
    println(product)
}

fun main8() {

    //iç içe döngü nesned
    for (i in 1..5) {
        for (j in 1..i) {
            print(j)
        }
    }
}

fun main9() {
    //girilen input, 3-5 e bçlünebiliyor mu veya hem 3 e hem 5 e böünebiliyor mu.
    val start = readlnOrNull()?.toIntOrNull() ?: return
    val end = readlnOrNull()?.toIntOrNull() ?: return

    for (number in start..end) {
        when {
            number % 3 == 0 && number % 5 == 0 -> println("FizzBuzz")
            number % 3 == 0 -> println("Fizz")
            number % 5 == 0 -> println("Buzz")
            else -> println(number)
        }
    }
}

fun main10() {
    val n = readlnOrNull()?.toIntOrNull() ?: return
    var sum = 0

    for (i in 1..n) {
        val number = readlnOrNull()?.toIntOrNull() ?: return
        sum += number
    }

    println(sum)
}


fun main11() {

    //en küçük değeri bulmak
    val n = readLine()?.toIntOrNull() ?: return
    var min = Int.MAX_VALUE

    for (i in 1..n) {
        val number = readLine()?.toIntOrNull() ?: return
        if (number < min) {
            min = number
        }
    }

    println(min)
}



fun main12() {


    //artan ve azalan sıralama
    val n = readLine()?.toIntOrNull() ?: return
    var isSorted = true
    var previousNumber = Int.MIN_VALUE

    for (i in 1..n) {
        val number = readLine()?.toIntOrNull() ?: return
        if (number < previousNumber) {
            isSorted = false
            break
        }
        previousNumber = number
    }

    if (isSorted) {
        println("YES")
    } else {
        println("NO")
    }


}

fun main() {
    val n = readLine()?.toIntOrNull() ?: return
    var longestSequenceLength = 1
    var currentSequenceLength = 1
    var previousNumber = readLine()?.toIntOrNull() ?: return

    for (i in 2..n) {
        val number = readLine()?.toIntOrNull() ?: return
        if (number >= previousNumber) {
            currentSequenceLength++
            if (currentSequenceLength > longestSequenceLength) {
                longestSequenceLength = currentSequenceLength
            }
        } else {
            currentSequenceLength = 1
        }
        previousNumber = number
    }

    println(longestSequenceLength)
}