package JetBrainsAcademy.ControlStructures.RepeatingBlocks

import JetBrainsAcademy.Zookeeper.rabbit
import java.util.Scanner

// Quiz 1
fun main1() {

    repeat(5){
        println("Kotlin")
    }
}



//Quiz 2
fun main2() {

    var number = 1
    repeat(5) {
        number++
    }

    println(number) //6
}




//Quiz 3
fun main3() {

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





// Quiz 4
fun main4() {
    val line = readln()

    repeat(10){
        println(line)
    }
}






// Quiz 5
fun main1a() {

    val n = readln().toInt()

    var larger = 0
    var perfect = 0
    var smaller = 0


    repeat(n){
        val output = readln().toInt()

        if (output == 1) larger++
        if (output == 0) perfect++
        if (output == -1) smaller++
    }

    println("$perfect $larger $smaller")
}

fun main1b() {

    val scanner =  Scanner(System.`in`)
    val n = scanner.nextInt()
    val checks = IntArray(n){ scanner.nextInt()}

    var ready = checks.count { it == 0 }
    var fix = checks.count { it == 1 }
    var reject = checks.count { it == -1 }

    println("$ready $fix $reject")
}




// Quiz 6
fun main6a() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    var (d, c, b, a) = arrayOf(0, 0, 0, 0)

    repeat(n){
        val x = scanner.nextInt()
        when(x){
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }
    print("$d $c $b $a")
}


fun main6b() {
    val n = readln().toInt()
    var d = 0
    var c = 0
    var b = 0
    var a = 0

    repeat(n){

        when(readln().toInt()){
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }
    println("$d $c $b $a")
}





// Quiz 7  kaç tane pozitif sayı var
fun main7a() {

    val n = readln().toInt()
    var count = 0

    repeat(n){
        val num = readln().toInt()
        if (num > 0){
            count++
        }
    }
    println(count)
}

fun main7b(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val sequence = scanner.nextInt()
    var sum = 0
    repeat(sequence) {
        sum += if (scanner.nextInt() > 0) 1 else 0
    }
    print(sum)
}

fun main7c() = print(List(readln().toInt()) { readln().toInt() }.count { it > 0 })





//Quiz 8
fun main8() {
    val a = readln().toInt()
    println(a.toString().repeat(a))
}




//Quiz 9
fun main9() {

    for (i in 1..5){
        if (i % 2 == 0){
            println("$i is an even number.")
        }else{
            println("$i is an odd number")
        }
    }
}



//Quiz 10
fun main10a() {
    val n = readLine()!!.toInt() // Number of elements
    var maxDivisibleBy4 = 0 // Initialize the maximum as 0

    repeat(n) {
        val element = readLine()!!.toInt() // Read the element
        if (element % 4 == 0 && element > maxDivisibleBy4) {
            // If the element is divisible by 4 and greater than the current maximum
            maxDivisibleBy4 = element // Update the maximum
        }
    }

    println(maxDivisibleBy4) // Print the maximum element divisible by 4
}

fun main10b(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val loop = scanner.nextInt()
    var maximum = 0
    repeat(loop) {
        val value = scanner.nextInt()
        if (value % 4 == 0 && value > maximum) {
            maximum = value
        }
    }
    println(maximum)
}

fun main10c() {
    var maximum = 0
    repeat(readLine()!!.toInt()) {
        val input = readLine()!!.toInt()
        if (input % 4 == 0 && input > maximum) maximum = input
    }
    print(maximum)
}

fun main10d(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()

    var maxElem = 0

    repeat(n) {
        val currentNum = scanner.nextInt()
        val isDivBy4AndMax: (Int) -> Boolean = { n -> n % 4 == 0 && n > maxElem }

        if (isDivBy4AndMax(currentNum)) maxElem = currentNum
    }

    println(maxElem)
}
fun main10e() {
    val array = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    println(array.sorted().last { it % 4 == 0 })
}















