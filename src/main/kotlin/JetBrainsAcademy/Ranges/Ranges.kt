package JetBrainsAcademy.Ranges

import java.util.*

fun main1() {
/*
    // Verilen değer içinde mi değil mi true false döner.
    val within = a <= c && c <= b

    val within = c in a..b




    println(5 in 5..15)  // true
    println(12 in 5..15) // true
    println(15 in 5..15) // true
    println(20 in 5..15) // false


    // sağ kenar hariç
    val withinExclRight = c in a..b - 1 // a <= c && c < b

    val a = 10
    val b = 12
    val range = a..b - 1
    //çıktı 10 11




    //100 değeri 10 ile 99 arasında değildir -> true değeri döndürür.
    val notWithin = 100 !in 10..99 // true


    //verilen input üç aralıkdan birinde var mı?
    val within = c in 5..10 || c in 20..30 || c in 40..50 // true if c is within at least one range


    //değişken o aralıkda mı?
    val range = 100..200
    println(300 in range) // false


    println('b' in 'a'..'c') // true
    println('k' in 'a'..'e') // false

    println("hello" in "he".."hi") // true
    println("abc" in "aab".."aac") // false
*/

}


fun main2() {

    val reader = Scanner(System.`in`)

    // nextInt() reads the next integer from the keyboard
    var line:Int = reader.nextInt()

    val age = line in 18..50


    println("$age") //true
}

fun main3() {

    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    println(a in b..c)
    //29, 18 ile 50 arasında mı? true
}

fun main4() {
    val a = readln().toInt()..readln().toInt()
    val b = readln().toInt()..readln().toInt()
    val c = readln().toInt()

    print(c in a && c in b)
}

fun main5() {

    val a = readln().toIntOrNull() ?: return
    val b = readln().toIntOrNull() ?: return
    val c = readln().toIntOrNull() ?: return
    val d = readln().toIntOrNull() ?: return
    val e = readln().toIntOrNull() ?: return


    val range1 = a..b
    val range2 = c..d
    val isInRange = e in range1 || e in range2

    println(isInRange)
}

fun main6() {

    val time = readln().toInt()
    val workTime = 9..18
    val lunchTime = 13..14

    println(time in workTime && time !in lunchTime)
}


fun main() {

    val minAmount = 60
    val maxAmount = 120

    val amount = readln().toInt()

    if (amount in minAmount..maxAmount){
        println("Okay")
    }else{
        println("need help")
    }

}
