package JetBrainsAcademy.ControlStructures.RepeatingBlocks

//Döngüler(loops), kodunuzdaki bir ifadeyi tekrarlamanız gerektiğinde kullanışlıdır.

fun main99() {
    repeat(3) {
        println("Hello")
    }
}




//Eğer n sıfır veya negatif bir sayı ise Kotlin döngüyü yok sayar
fun main98() {
    repeat(3) {
        println("Hello")
    }

    //Hello
    //Hello
    //Hello
}






//Kotlin, mevcut yinelemeyi it adı ile kontrol etme olanağına sahiptir:
fun main97() {
    repeat(3) {
        println(it) //0, 1, 2
    }
}






//Standart girişten veri okuyabilir, değişkenleri bildirebilir ve hatta tekrarlama ifadesi içinde hesaplamalar gerçekleştirebilirsiniz.
fun main() {
    val n = readln().toInt()
    var sum = 0

    repeat(n) {
        val next = readln().toInt()
        sum += next
    }

    println(sum)
}