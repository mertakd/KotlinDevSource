package JetBrainsAcademy.LambdaExpressions
/*

fun main1() {



    val result1 = sumObject(10,20)
    val result2 = sumObject2(10,20)

    println(result1)
    println(result2)



}


fun sum(a:Int, b:Int):Int = a + b

//(Int,Int) -> Int


val sumObject = ::sum                         //Türü belirtmeden tanımlama
val sumObject2: (Int, Int) -> Int = ::sum    //Türü belirterek tanımlama


*/




/*


//Functions returning other functions
fun main() {
    val honestFunction = getScoringFunction(false)
    val cheaterFunction = getScoringFunction(true)

    val honestResult = honestFunction(9.0)
    val cheaterResult = cheaterFunction(9.0)

    println("Honest Student's Grade: $honestResult") // Output: Honest Student's Grade: 9.0
    println("Cheater Student's Grade: $cheaterResult") // Output: Cheater Student's Grade: 8.0
}




fun getRealGrade(x: Double) = x
fun getGradeWithPenalty(x: Double) = x - 1

fun getScoringFunction(isCheater: Boolean): (Double) -> Double {
    if (isCheater) {
        return ::getGradeWithPenalty
    }

    return ::getRealGrade
}


*/



/*


//Function references as function parameters
fun main() {


    applyAndSum(1, 2, ::same)    // returns 3 = 1 + 2
    applyAndSum(1, 2, ::square)  // returns 5 = 1 * 1 + 2 * 2
    applyAndSum(1, 2, ::triple)  // returns 9 = 3 * 1 + 3 * 2
}



fun applyAndSum(a: Int, b: Int, transformation: (Int) -> Int): Int {
    return transformation(a) + transformation(b)
}


fun same(x: Int) = x
fun square(x: Int) = x * x
fun triple(x: Int) = 3 * x

*/


/*


//Real-world usage
fun main() {

    val originalText = "I don't know... what to say..."
    val textWithoutDots = originalText.filter(::isNotDot)
}


fun isNotDot(c: Char): Boolean = c != '.'


*/




//QUIZ


/*

fun main() {

    val identityFunction = generate("identity") // identityFunction, identity fonksiyonunun referansını tutar.
    val halfFunction = generate("half")         // halfFunction, half fonksiyonunun referansını tutar.
    val unknownFunction = generate("unknown")   // unknownFunction, zero fonksiyonunun referansını tutar.
}


fun generate(functionName: String): (Int) -> Int {
    return when (functionName) {
        "identity" -> ::identity
        "half" -> ::half
        else -> ::zero
    }
}

fun identity(x: Int): Int = x
fun half(x: Int): Int = x / 2
fun zero(x: Int): Int = 0
*/


fun main() {

    val value = 5
    val result = composition(value, ::square, ::addOne)

    println("Result: $result") // Çıktı: Result: 36
}

fun addOne(x: Int): Int = x + 1
fun square(x: Int): Int = x * x


fun composition(value: Int, y: (Int) -> Int, g: (Int) -> Int): Int {
    return y(g(value))
}
