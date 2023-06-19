package JetBrainsAcademy.JetBrainsAcademyFunction

import kotlin.math.sqrt

//BASIC FUNCTION
//Bir fonksiyon, programda fonksiyon adı aracılığıyla çağırabileceğimiz bir alt programdır.


fun main11() {

    val text = "Hello"
    println(text)
}


fun main12() {

    val breadFromFrodo2 = readln()
    val breadFromSam2 = readln()

    totalLembes2(breadFromFrodo2, breadFromSam2)
}

fun totalLembes2(first:String, second:String ) {
    print(first.toInt() + second.toInt())
}


fun main13() {
    val number = readln().toDouble()
    val logNumber = Math.log10(number)
    println(logNumber)
}

fun main14() {
    //karakök bulma
    val number= readln().toDouble()

    val result = sqrt(number)
    println(result)
}






//Declaring functions
/*
fun main() {

    //parametreler
    fun functionName(p1: Type1, p2: Type2, ...): ReturnType {
        // body
        return result
    }




}*/


fun sum1(a: Int, b: Int): Int {
    val result = a + b
    return result
}

fun main15() {
    val result1 = sum1(2, 5)
    println(result1) // 7

    val result2 = sum1(result1, 4)
    println(result2) // 11
}


fun main16() {
    val input: Int = 15
    val result = extractLastDigit(input)
    println(result)
}

fun extractLastDigit(number: Int): Int {
    val lastDigit = number % 10
    return lastDigit
}







//SINGLE-EXPRESSION FUNCTIONS
fun main6() {

    fun sum(a: Int, b: Int): Int = a + b

    fun sayHello(): Unit = println("Hello")

    fun isPositive(number: Int): Boolean = number > 0


    //daha da kısası
    //fun sum(a: Int, b: Int) = a + b // Int

    //fun sayHello() = println("Hello") // Unit

    //fun isPositive(number: Int) = number > 0 // Boolean


    //IDIOM
    //fun theAnswer() = 42   // short and clear

    /*
    fun theAnswer(): Int { // equivalent common function
        return 42
    }
    */
}







//QUİZ
fun main3() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(sum(a, b, c))
}
fun sum(a:Int,b:Int,c:Int):Int{
    return a + b + c
}



/*

fun isVowel2(letter: Char): Boolean = letter.toLowerCase() in "aeiou"

fun main4() {

    val letter = readLine()!!.first()

    println(isVowel(letter))
}

*/




/*

fun isVowel(letter: Char): Boolean {
    val vowels = "aeiouAEIOU"
    return letter in vowels
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}

*/

fun main17() {

    val letter = readln().first()
    println(isVowel(letter))
}

fun isVowel(letter:Char):Boolean{
    val vowels = "aeiouAEIOU"
    return letter in vowels
}





/*


fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}

// write your code here
fun getLastDigit(digit: Int) = digit.toString().last()

*/


/*

fun isRightEquation(a: Int, b: Int, c: Int): Boolean {

    return a * b == c
}

*/
/* Do not change code below *//*

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(isRightEquation(a, b, c))
}

*/






/*

fun square(n: Int) = n * n

*/
/* Do not change code below *//*

fun main() {
    val number = readLine()!!.toInt()
    println(square(number))
}

*/







/*

fun isGreater(a: Int, b: Int, c: Int, d: Int): Boolean {
    return (a + b) > (c + d)
}

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}

*/

fun main18() {

    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()
    val number4 = readln().toInt()

    println(isGreater(number1,number2,number3,number4))
}


fun isGreater(a:Int, b:Int, c:Int, d:Int):Boolean{
    return (a + b) > (c + d)
}


fun divide(a: Long, b: Long): Double {
    return a.toDouble() / b.toDouble()
}

fun main5() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}


fun main19() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(isRightEquation(a, b, c))

}


fun isRightEquation(a:Int,b:Int,c: Int):Boolean{
    return a*b == c
}


fun main20() {
    val number = readln().toInt()
    println(square(number))


}

//sayının karesi
fun square(n:Int):Int{
    return n * n
}





//DEFAULT ARGUMENTS


/*

fun main21() {
    printLine("Hello, Kotlin", "!!!") // prints "Hello, Kotlin!!!"
    printLine("Kotlin") // prints "Kotlin" with an ending newline
    printLine() // prints an empty line like println()
}
fun printLine(line: String = "", end: String = "\n") = print("$line$end")

*/

fun main21() {
    val n1 = 15
    val n2 = -4
    val result:Int = findMax(n1,n2,true)
    println(result)
}

fun findMax(n1: Int, n2: Int, absolute: Boolean = false): Int {
    val v1: Int
    val v2: Int

    if (absolute) {
        v1 = Math.abs(n1)
        v2 = Math.abs(n2)
    } else {
        v1 = n1
        v2 = n2
    }

    return if (v1 > v2) n1 else n2
}






//default func quiz

//quiz 1
//Take a look at the declaration of a function that repeats a string:

//fun repeat(s: String, times: Int = 1, upperCase: Boolean = false): String = ...
//
//repeat("S")       repeat("S", 5)



/*


fun main22() {
    val result1 = repeat("j") // varsayılan parametrelerle, dizeyi bir kez tekrar eder
    println(result1) // Çıktı: "S"

    val result2 = repeat("S", 5) // dizeyi 5 kez tekrar eder
    println(result2) // Çıktı: "SSSSS"
}
fun repeat(s: String, times: Int = 1, upperCase: Boolean = true): String {
    var result = ""
    for (i in 0 until times) {
        result += s
    }
    if (upperCase) {
        result = result.toUpperCase()
    }
    return result
}*/


fun main() {

    val result = repeat("j")
    println(result)

    val result2 = repeat("j",5)
    println(result2)
}

fun repeat(s:String, times:Int = 1, upperCase:Boolean = true):String{

    var result = ""

    for (i in 0 until times){
        result += s
    }

    if (upperCase){
        result = result.toUpperCase()
    }

    return result

}
