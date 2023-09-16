@file:Suppress("UNUSED_EXPRESSION")

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

fun main3A() {

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

//Quiz1
fun main1k() {

    fun(number: Int) = number.toString()
    fun(number:Int): String{return number.toString()}
    {number: Int -> number.toString()}
}










//QUİZ
fun main() {

    val result1 = lambda(2, 5)   // 2 * 3 * 4 * 5 = 120
    val result2 = lambda(3, 3)   // Sonuç 3 veya herhangi bir sınır olabilir (3 * 1 = 3)

    println("Sonuç 1: $result1")  // Çıktı: Sonuç 1: 120
    println("Sonuç 2: $result2")  // Çıktı: Sonuç 2: 3

}


val lambda: (Long, Long) -> Long = {left, right ->

    var result = 1L
    for (number in left..right){
        result *= number
    }
    result
}

val lambda1b: (Long, Long) -> Long = {a, b -> (a..b).reduce(Long::times)}















fun main2() {

    val result1 = lambda2(5, 9)   // 9
    val result2 = lambda2(2, 2)   // 2 (Eğer iki sayı aynı ise sonuç herhangi biri olabilir)

    println("Sonuç 1: $result1")  // Çıktı: Sonuç 1: 9
    println("Sonuç 2: $result2")  // Çıktı: Sonuç 2: 2

}

//Quiz
val lambda2: (Int,Int) -> Int = {a, b ->
    if (a > b){
        a
    }else{
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

val lambda2c: (Int, Int) -> Int = ::maxOf
val lambda2d: (Int, Int) -> Int = {a: Int, b: Int -> maxOf(a, b) }










//Quiz
fun main33() {
    //val lambda: (Int) -> Int = { a * it * it + b * it + c }
}






var counter: () -> Int = { -42 }

fun reinitializeCounter(): Int {
    var value = 0
    counter = { ++value }
    return value
}

fun main4() {
    // counter'ı çağırarak ilk değeri elde edelim
    println(counter()) // Çıktı: -42

    // counter'ı çağırarak sayaç işlevini kullanalım
    println(counter()) // Çıktı: 1
    println(counter()) // Çıktı: 2
    println(counter()) // Çıktı: 3

    // reinitializeCounter fonksiyonunu çağırarak counter'ı sıfırlayalım
    val initialValue = reinitializeCounter()
    println("Counter sıfırlandı. Başlangıç değeri: $initialValue") // Çıktı: Counter sıfırlandı. Başlangıç değeri: 3

    // counter'ı tekrar çağırarak artık sıfırdan başlayan sayacı kullanalım
    println(counter()) // Çıktı: 1
    println(counter()) // Çıktı: 2
}



fun fizzbuzz(from: Int, to: Int, transformation: (Int) -> String) {
    for (number in from..to) {
        println(transformation(number))
    }
}

fun main23423() {

    fizzbuzz(1, 100) { number ->
        if (number % 15 == 0) {
            "fizzbuzz"
        }
        if (number % 3 == 0) {
            "fizz"
        }
        if (number % 5 == 0) {
            "buzz"
        }
        number.toString()
    }
}









