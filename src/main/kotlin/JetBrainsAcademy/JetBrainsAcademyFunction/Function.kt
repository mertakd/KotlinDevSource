package JetBrainsAcademy.JetBrainsAcademyFunction




/*
fun main() {

    //parametreler
    fun functionName(p1: Type1, p2: Type2, ...): ReturnType {
        // body
        return result
    }




}*/


fun main2() {

    fun sum(a: Int, b: Int): Int = a + b

    fun sayHello(): Unit = println("Hello")

    fun isPositive(number: Int): Boolean = number > 0


    //IDIOM
    //fun theAnswer() = 42   // short and clear

    /*
    fun theAnswer(): Int { // equivalent common function
        return 42
    }
    */
}


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


fun divide(a: Long, b: Long): Double {
    return a.toDouble() / b.toDouble()
}

fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}
