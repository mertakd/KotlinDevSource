package JetBrainsAcademy.JetBrainsAcademyDataTypes

fun main() {

//yeni güncelleme yapıldı

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



 *TİP ZORLAMASI

  val num: Int = 100
  val longNum: Long = 1000
  val result = num + longNum // 1100, Long
  Ssyıyı otomatik olarak long a çeviriyor.

  from Long to Double:

  val bigNum: Long = 100000
  val doubleNum: Double = 0.0
  val bigFraction = bigNum - doubleNum // 100000.0, Double




 aşağıda short ve byte ın toplamları otomatik int olur. sonucun short veya byte olmasını istiyorsa k biz manuel  olarak yapmamız lazım.
  Byte and Byte

  val one: Byte = 1
  val two: Byte = 2
  val three = one + two // 3, Int
  Short and Short

  val fourteen: Short = 14
  val ten: Short = 10
  val four = fourteen - ten // 4, Int
  Short and Byte

  val hundred: Short = 100
  val five: Byte = 5
  val zero = hundred % five // 0, Int

  val one: Byte = 1
  val five: Byte = 5
  val six = (one + five).toByte() // 6, Byte

  Tip zorlaması hakkındaki sorular.
  *Bir ifade Double, Int, Float, Long içeriyorsa, ifadenin tamamı otomatik olarak ... double olur.
  *short, int, long, float, double doğru sıralama



           *Type System
 * number double ve int in üst türüdür
 * Type Any, null olamayacak türler için Kotlin tür hiyerarşisinin en üstünde yer alır. Örneğin, Number türü Any türünün bir alt türüdür.
 *Any türünün null değerini desteklemediğini unutmayın
 * any de boş veri gelebilir desek bile nullpointerex hatası atar
 * unit any nin altındadır
 * en alt hiyararşide nothiig vardır.



                                Type cast and smart cast


 *is ile aynı tipe ait mi değil mi. aşağıda string tipinde mi değil mi?cevap string tipinde true
    val obj: Any = "Hello, Kotlin"
    if (obj is String) {
    println(obj.uppercase())
    } else {
    println("obj is not a String")
    }
    *Null yapılabilir bir türe sahip bir değişkenin türünü kontrol etmek için is operatörünü kullandığınızda, tür denetimi başarılı olursa Kotlin, nesneyi otomatik olarak null yapılamaz bir türe çevirir.
    val str: String? = "hello"

    if (str is String) {
    // str is automatically cast to a non-nullable String type
    val length: Int = str.length
    println("The length of str is $length")
    }
    *Kotlin, as anahtar sözcüğü ile temsil edilen güvenli olmayan bir atama operatörüne sahiptir. as anahtar sözcüğü, bir nesneyi null yapılamayan bir türe dönüştürmek için kullanılır. Nesne belirtilen türe dönüştürülemezse, as işleci bir ClassCastException oluşturur.
    val obj: Any = "Hello, Kotlin"
    val str: String = obj as String // Unsafe cast operator
    println(str.uppercase())

    *as? operatörü, bir nesneyi null yapılabilir bir türe dönüştürmek için kullanılır. Nesne belirtilen türe dönüştürülemezse, as? operatör null döndürür.
    val obj: Any = 123
    val str: String? = obj as? String // Safe (nullable) cast operator
    println(str?.uppercase())

    *özetle is o tipe ait mi değil mi onu kontrol eder
     as bir tipe dönüştürür. any yi string e çevirmek gibi.
    is operatörü, true veya false şeklinde bir boolean değeri döndürürken, as operatörü, hedef türe dönüştürülen nesneyi döndürür veya atama başarısız olursa çalışma zamanında bir ClassCastException atar.


                                        Rangers

    *val within = a <= c && c <= b
     val within = c in a..b
     a ve b değeri de dahil.
    println(5 in 5..15)  // true
    println(12 in 5..15) // true
    println(15 in 5..15) // true
    println(20 in 5..15) // false
    *Sağ kenarlığı hariç tutmanız gerekirse, ondan 1 çıkarabilirsiniz:
     val withinExclRight = c in a..b - 1 // a <= c && c < b
    *Bir değerin aralık içinde olmadığını kontrol etmeniz gerekirse, şunu eklemeniz yeterlidir ! (değil) önce.
     val notWithin = 100 !in 10..99 // true
    *aralıklar içinde
     val within = c in 5..10 || c in 20..30 || c in 40..50 // true if c is within at least one range
 */



