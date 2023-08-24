package JetBrainsAcademy.Classes.InfixFunctions

//Infiz fonksiyonlar, Fonksiyonları parantez veya nokta olmadan tanımlamamıza ve kullanmamıza olanak tanır.

//Üye işlevleri(member function) veya uzantı işlevleri(extension function) olmalıdırlar.
//They must have a single parameter.
//
infix fun Int.add1(x:Int) : Int = this + x

fun main1() {

    println(1.add1(2)) // result is 3 as extension function
    println(1 add1 2) // result is 3 as infix function

}



// 2.Creating infix functions
//infix işlev çağrılarının, aritmetik operatörlerden veya dilde tanımlanan tür dönüşümleri ve rangeTo operatörü gibi diğer öğelerden daha düşük önceliğe sahip olduğunu unutmayın.

infix fun Int.add2(x: Int): Int = this + x
fun main2() {
    println(1 add2 2 + 3)   // 6
    println(1 add2 (2 + 3)) // 6
    println(0..(1 add2 3))  // 0..4
}


infix fun Int.add(x: Int): Int = this + x // this is the receiver
fun main22() {
    println(2 + 3) // receiver is 2
}



infix fun Int.mod(x: Int): Int = this % x
infix fun IntRange.add(x: Int): IntRange = this.first + x..this.last + x
fun main() {
    println(167 mod 5 in 3..4 add 2)
}

