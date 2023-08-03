package JetBrainsAcademy.LambdaExpressions




/*
* Functions without names
* anonymous ve lambda olarak kullanılır


*   fun (a:Int, b:Int):Int{
        return a * b
    }



    {a:Int, b:Int -> a * b}



    * */



/*


//Bir değişkene atıyoruz
val mul1 = fun (a:Int, b:Int):Int{
    return a* b
}

val mul2 = {a:Int, b:Int -> a * b}


fun main() {

    println(mul1(2,3))
    println(mul2(2,3))

}


*/




/*
*Lambdas and syntactic sugar */


fun isNotDot(c: Char): Boolean = c != '.'
fun isNotDot2(c:Char): Boolean{
    return c != '.'
}

fun main() {

    val originalText = "I don't know... what to say..."
    val textWithoutDots = originalText.filter (::isNotDot)
    println(textWithoutDots)



    val originalText2 = "I don't know... what to say..."
    val textWithoutDots2 = originalText2.filter({c:Char -> c != '.'})

    //tür belirtmemize gerek yok
    val textWithoutDots2b = originalText2.filter({ c -> c != '.'})

    // lambda'nın son argüman olarak iletildiği durum
    val textWithoutDots2c = originalText2.filter() {c -> c != '.'  }

    //Bu işlemden sonra parantezler boş bırakılırsa kaldırabilirsiniz:
    val textWithoutDots2d = originalText2.filter { c -> c != '.' }

    //Implicit name
    val textWithoutImplicit = originalText2.filter { it != '.' }
    println(textWithoutDots2)



}




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


fun main2() {

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

fun main3a() {
    val lambda5: (Int, Int) -> Int = {a, b -> if (a >= b) a else b}
    println(lambda5)
}



