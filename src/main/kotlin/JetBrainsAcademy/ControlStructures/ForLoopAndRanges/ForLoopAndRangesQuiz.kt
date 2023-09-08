package JetBrainsAcademy.ControlStructures.ForLoopAndRanges

import java.util.*


// Quiz 1
fun main1() {

    for (i in 1..10){
        println("This is loop iteration $i")
    }
}




// Quiz 2
fun main2a() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val n = readLine()!!.toInt()

    var count = 0
    for (i in a..b){
        if (i % n == 0){
            count++
        }
    }
    println(count)

    //i % n == 0 ifadesi, bir tamsayının i, bir başka tamsayıya n tam böldüğünü (yani i'yi n'ye böldüğünüzde kalan sıfır olduğunu) kontrol eder.
    //Bu tür bir ifade, bir sayının başka bir sayıya tam bölünüp bölünmediğini kontrol etmek için kullanılır.
}
fun mainCount() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // 5 sayısının listede kaç defa geçtiğini hesapla
    val countOf5 = numbers.count { it == 5 }

    println("5 sayısı $countOf5 kez geçiyor.")
}
fun main2b() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()
    println((a..b).count{it % n == 0})
}

fun main2c() {
    val (a, b, n) = IntArray(3){ readln().toInt() }

    println((a..b).count{it % n == 0})
}
fun main2d() = List(3) { readln().toInt() }.run { print((get(0)..get(1)).count { it % get(2) == 0 }) }

fun main2e() {
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()

    println((a..b).filter { it % n == 0 }.size)
}
fun main2f() {
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()
    var count = 0
    for (i in a..b) if (i % n == 0) count++
    println(count)
}







//Quiz 3     a'dan b'ye kadar tam sayıların toplamı
fun main3a() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    var sum = 0
    for (i in a..b){
        sum += i
    }
    println(sum)
}

fun main3b() {
    val range = readln().toInt()..readln().toInt()
    var sum = 0

    for (num in range) {
        sum += num
    }

    println(sum)
}





//qUİZ 4
fun main4a() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var product = 1L
    for (i in a until b) {
        product *= i
    }
    println(product)
}
fun main4b() {
    val range = readln().toInt() until readln().toInt()
    var result = 1L
    for (x in range) result *= x
    println(result)
}
fun main4c() {
    val (a, b) = List(2) { readLine()!!.toInt() }
    var product = 1L
    for (i in a until b) product *= i
    print(product)
}





//Quiz 5
fun main5() {
    val start = readLine()?.toIntOrNull() ?: return
    val end = readLine()?.toIntOrNull() ?: return

    for (number in start..end) {
        when {
            number % 3 == 0 && number % 5 == 0 -> println("FizzBuzz")
            number % 3 == 0 -> println("Fizz")
            number % 5 == 0 -> println("Buzz")
            else -> println(number)
        }
    }
}





// Quiz 6
fun main6() {
    val n = readLine()?.toIntOrNull() ?: return
    var sum = 0

    for (i in 1..n) {
        val number = readLine()?.toIntOrNull() ?: return
        sum += number
    }

    println(sum)
}



//Quiz 7
fun main7() {
    for (i in 1..3) {
        for (j in 1..i) {
            print(j)
        }
    }
}







//Quiz 8
fun main8() {
    val range = 1..5
    for (element in range){
        println("Element: $element")
    }
}



// Quiz 9
fun main9() {
    var result = ""

    for (i in 1..5){
        result += "Loop iteration: $i\n"
    }
    println(result)
}







// Quiz 10
fun main10() {
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





//Quiz 11
fun main() {

    val count = readLine()!!.toInt()
    var num = readLine()!!.toInt()
    var condition = "YES"

    for (i in 1 until count) {

        val swap = readLine()!!.toInt()

        if (num > swap) condition = "NO" else num = swap
    }

    println(condition)

}





