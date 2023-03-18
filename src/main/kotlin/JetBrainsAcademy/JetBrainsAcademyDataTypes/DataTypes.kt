package JetBrainsAcademy.JetBrainsAcademyDataTypes

fun main() {

}







/**

val greeting // error
greeting = "hello"

val greeting: String // ok
greeting = "hello"




println(Int.MIN_VALUE)  // -2147483648
println(Int.MAX_VALUE)  // 2147483647
println(Long.MIN_VALUE) // -9223372036854775808
println(Long.MAX_VALUE) // 9223372036854775807

                        TÜR DEĞİŞİMİ

 *val num: Int = 100

  val res: Double = sqrt(num.toDouble())
  println(res) // 10.0

  println(num) // 100, it is not modified
 *toDouble(), değişkenin türünü değiştirmez. Bu işlev, Double türünde yeni bir değer üretir.
 * Csharp ve Java dan farklı olarak küçük tip büyük tipe atanabilir
    val num: Int = 100
    val bigNum: Long = num.toLong() // 100

 *Char
    val n1: Int = 125
    val ch: Char = n1.toChar() // '}'
    val n2: Int = ch.code      // 125

 *double long a çevrilir
    val d: Double = 12.5
    val n: Long = d.toLong() // 12

 *long double ınt e dönüştürülebilir
    val d: Double = 10.2
    val n: Long = 15

    val res1: Int = d.toInt() // 10
    val res2: Int = n.toInt() // 15"
*type overflow (tür taşması)
  ınt i double a döndürürken sayı yüksekse gerçekleşen olay
  int short byte ta da bu olay olabilir.

 *short ve byte a dönüştürmek sorunlu
    val floatNumber = 10f
    val doubleNumber = 1.0

    val shortNumber = floatNumber.toShort() // avoid this
    val byteNumber = doubleNumber.toByte()  // avoid this

    val shortNumber = floatNumber.toInt().toShort() // correct way
    val byteNumber = doubleNumber.toInt().toByte()  // correct way

 *String e çevirme
    val n = 8     // Int
    val d = 10.09 // Double
    val c = '@'   // Char
    val b = true  // Boolean

    val s1 = n.toString() // "8"
    val s2 = d.toString() // "10.09"
    val s3 = c.toString() // "@"
    val s4 = b.toString() // "true"
 *char hariç int double boolean a çevrilir.
    val n = "8".toInt() // Int
    val d = "10.09".toDouble() // Double
    val b = "true".toBoolean() // Boolean

 */



