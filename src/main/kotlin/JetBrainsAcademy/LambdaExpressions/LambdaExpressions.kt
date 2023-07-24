package JetBrainsAcademy.LambdaExpressions
/*

fun main() {

    println(mul1(2, 3))  // prints "6"
    println(mul2(2, 3))  // prints "6" too

}
*/



/*

//anonymous
fun(a:Int, b:Int):Int{
    return a *b
}


//lambda expression:
{a:Int, b:Int -> a * b}

*/



/*


val mul1 = fun(a: Int, b: Int): Int {
    return a * b
}

val mul2 = { a: Int, b: Int -> a * b }

*/



/*

fun main() {


    fun isNotDot(c: Char): Boolean = c != '.'
    val originalText = "I don't know... what to say..."
    val textWithoutDots = originalText.filter(::isNotDot)
    println(textWithoutDots) // I don't know what to say





    val originalText = "I don't know... what to say..."
    val textWithoutDots = originalText.filter({ c: Char -> c != '.' })   //val textWithoutDots = originalText.filter{ c: Char -> c != '.' } bu da oluyor
    println(textWithoutDots) // I don't know what to say



    originalText.filter() { c -> c != '.' }
    If the parentheses are left empty after that operation, you can remove them:

    originalText.filter { c -> c != '.' }



}


*/




/*


//Implicit name of a single parameter: it

fun main() {

    val originalText = "I don't know... what to say..."
    val textWithoutDots = originalText.filter { it != '.' }
}
*/



//QUİZ
fun main1() {

    val result1 = lambda(2, 5)   // 2 * 3 * 4 * 5 = 120
    val result2 = lambda(3, 3)   // Sonuç 3 veya herhangi bir sınır olabilir (3 * 1 = 3)

    println("Sonuç 1: $result1")  // Çıktı: Sonuç 1: 120
    println("Sonuç 2: $result2")  // Çıktı: Sonuç 2: 3

}


val lambda: (Long, Long) -> Long = { left, right ->
    var result = 1L
    for (number in left..right) {
        result *= number
    }
    result
}


fun main() {

    val result1 = lambda2(5, 9)   // 9
    val result2 = lambda2(2, 2)   // 2 (Eğer iki sayı aynı ise sonuç herhangi biri olabilir)

    println("Sonuç 1: $result1")  // Çıktı: Sonuç 1: 9
    println("Sonuç 2: $result2")  // Çıktı: Sonuç 2: 2

}



val lambda2: (Int, Int) -> Int = { a, b ->
    if (a > b) {
        a
    } else {
        b
    }
}


//uzun yolu
fun findMax(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

