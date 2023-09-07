package JetBrainsAcademy.ControlStructures.IfExpression

import java.time.LocalDate
import java.util.Scanner

// Quiz 1  Find The Output
fun main99() {

    val x = 11

    if (x * 2 + 1 < 23 && x % 2 == 1) {
        print("1")
        print(if (x == 11) "2" else "3")
    } else if (x != 0) {
        print("4")
    }
    print("5")
}






//Quiz 2  Healthy sleep
fun main98() {

    val minSleepHours = readln().toInt()
    val maxSleepHpours = readln().toInt()
    val annSleepHours = readln().toInt()

    val output: String

    if (annSleepHours < minSleepHours){
        output = "Deficiency"
    }else if (annSleepHours > maxSleepHpours){
        output = "Excess"
    }else{
        output = "Normal"
    }

    println(output)
}

fun main97() {
    // daha kısa çözümü

    val (a, b, h) = List(3){ readln().toInt() }
    print(if (h in a..b) "Normal" else if (h >b)"Excess" else "Deficiency")

}

fun main96() {
    // daha kısa çözümü 2
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val h = readLine()!!.toInt()


    println(
        when(h){
            in a..b -> "Normal"
            in 0..a -> "Deficiency"
            else -> "Excess"
        }
    )
}




// Quiz3 Artık Yıl
fun main94a() {
    val year = readln().toInt()

    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
        println("Leap")
    }else{
        println("Regular")
    }
}

fun main94b() {

    val year = readln().toInt()
    println(if (year %4==0 && year % 100 != 0 || year % 400 == 0) "Leap" else "Regular")
}

fun main94bb() {
    val year = LocalDate.of(readln().toInt(),1,1)
    println(if (year.isLeapYear) "Leap" else "Regular")
}





// Quiz 4 Pozitif sayı
fun main93a() {
    val number = readln().toInt()

    val output = if (number > 0){
        "yes"
    }else{
        "no"
    }

    println(output)
}

fun main93b() = if (readln().toInt() > 0) println("Yes") else println("No")






//Quiz 5   çift tek
fun main92A() {
    val number = readLine()?.toInt() ?: 0

    if (number % 2 == 0){
        println("EVEN")
    }else{
        println("ODD")
    }
}

fun main92B() = println(if (readln().toInt() % 2 == 0) "EVEN" else "ODD")

fun main92C() {

    println(
        when(readln().toInt() % 2 == 0){
            true -> "EVEN"
            false -> "ODD"
        }
    )
}





// Quiz 6  pozitif negatif sıfır
fun main6a() {
    val number = readln().toInt()

    val output: String

    if (number < 0){
        output = "negative"
    }else if (number > 0){
        output = "positive"
    }else{
        output = "zero"
    }

    println(output)

}

fun main6b() {
    println(
        when(readln().first()){
            '0' -> "zero"
            '-' -> "negative"
            else -> "positive"
        }
    )
}



// Quiz 7   çift tek
fun main7a() {
    val two = 2
    val three = 3
    val five = 5
    val six = 6
    val st = "Divided by"
    val num = readLine()!!.toInt()

    if (num % two == 0) {
        println("$st $two")
    }

    if (num % 3 == 0){
        println("$st $three")
    }

    if (num % five == 0){
        println("$st $five")
    }

    if (num % six == 0){
        println("$st $six")
    }
}

fun main7b() {
    val number = readLine()!!.toInt()

    listOf(2, 3, 5, 6, 10).forEach { if (number % it == 0) println("Divided by $it") }
}

fun main7c() {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    listOf(2, 3, 5, 6).filter { n % it == 0 }.forEach { println("Divided by $it") }
}
fun main7d() {
    val n = readln().toInt()
    listOf(2,3,5,6).forEach {
        if (n % it == 0) println("Divided by $it")
    }
}
fun main7e() {

    val n: Int = readln().toInt()
    isDivisible(n, 2)
    isDivisible(n, 3)
    isDivisible(n, 5)
    isDivisible(n, 6)
}
fun isDivisible(dividend:Int, divisor:Int){
    if (dividend % divisor == 0) println("Divided by $divisor")
}


fun main7f() {
    val n = readln().toInt()
    for (i in listOf(2,3,5,6)){
        if (n % i == 0){
            println("Divided by $i ")
        }
    }
}










// Quiz 8    sayının maximum değeri
fun main8a() {
    val a = readln().toInt()
    val b = readln().toInt()
    val max = if (a > b) a else b
    println(max)
}

fun main8b() {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()

    var max = a
    if (b > a) max = b
    println(max)
}



//Quiz 9  üç sayının maximum değerini yaz
fun main9a() {

    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()

    val maxNumber = if (number1 >= number2 && number1 >= number3) {
        number1
    } else if (number2 >= number1 && number2 >= number3) {
        number2
    } else {
        number3
    }

    println(maxNumber)
}
fun main9b() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    if (a > c){
        if (a > b) a else b
    }else{
        if (c > b) c else b
    }
}




//Quiz 10     2 numaranın maksimumu
fun main10a() {

    val a = 5
    val b = 3
    val max: Int

    if (a > b){
        max = a
    }else{
        max = b
    }

    println("The maximum between $a and $b is $max")
}



//Quiz 11   2 sayıyı karşılaştırma
fun main11a() {
    val numberA = 10
    val numberB = 20

    val result = if (numberA > numberB) "Number A ($numberA) is greater than Number B ($numberB)"
                else "Number B ($numberB) is greater than Number A ($numberA)"

    println(result)
}






// Quiz 12   yaş
fun main12a() {

    val name = "John"
    val age = 22
    val isAdult = if (age >= 18) "Yes" else "No"

    println("$name is $age years old. Adult? $isAdult ")
}









// Quiz 13      İki sayıyı karşılaştırmak
fun main13() {

    val result = checkNumberRelations(10,5)
    println(result)
}

fun checkNumberRelations(a:Int, b:Int): String{

    if (a > b){
        return "The number $a is larger than $b"
    }else if (a < b){
        return "The number $a is less than $b"
    }else{
        return "The numbers $a and $b are equal"
    }
}





// Quiz 14
fun main14a() {
    val age = 18
    val legalAge = 21

    val message = if (age >= legalAge){
        "User is not of legal age."
    }else{
        "User is of legal age."
    }

    println("Checking Age : $message ")
}




// Quiz 15
fun main15a() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    if (a + b > c && a + c > b && b + c > a){
        println("YES")
    }else{
        println("NO")
    }
}

fun main() {
    val (a, b, c) = List(3){ readln().toInt() }.sorted()
    println(if (a + b > c) "YES" else "NO")
}


