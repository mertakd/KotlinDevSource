package JetBrainsAcademy.LambdaExpressions

fun getRealGrade(x: Double) = x
fun getGradeWithPenalty(x: Double) = x - 1

fun getScoringFunction(isCheater: Boolean): (Double) -> Double {
    if (isCheater) {
        return ::getGradeWithPenalty
    }

    return ::getRealGrade
}



fun main2a() {

    // getScoringFunction'ı çağırarak wantedFunction adlı değişkenle dönen işlevi atayalım
    val wantedFunction = getScoringFunction(false)

    // wantedFunction'ı kullanarak bir puan hesaplayalım
    val studentGrade = 9.0
    val scoredGrade = wantedFunction(studentGrade)

    // Sonucu ekrana yazdıralım
    println("Öğrencinin puanı: $scoredGrade")
}


fun main3() {
    applyAndSum(1, 2 , ::same)
    applyAndSum(1, 2 , ::square)
    applyAndSum(1, 2 , ::triple)
}

fun applyAndSum(a:Int, b:Int, transformation: (Int) -> Int):Int {
    return transformation(a) + transformation(b)
}


fun same(x: Int) = x
fun square(x: Int) = x * x

fun triple(x:Int) = 3 * x








fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun main() {
    // Fonksiyon referansını "isEven" adında bir değişkene atayalım
    val evenCheck: (Int) -> Boolean = ::isEven

    // Test edelim
    val number1 = 10
    val number2 = 7

    println("$number1 çift mi? ${evenCheck(number1)}")
    println("$number2 çift mi? ${evenCheck(number2)}")
}
