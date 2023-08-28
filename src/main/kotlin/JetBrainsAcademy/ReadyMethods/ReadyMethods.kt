package JetBrainsAcademy.ReadyMethods

// joinToString :  değerler arasında boşluk bırakmak, noktalama işaretleri koymaya yarar.

val numbers = listOf(1, 2, 3, 4, 5)
val result = numbers.joinToString(separator = "-", prefix = "[", postfix = "]")
fun main1() {
    println(result) // Output: [1 - 2 - 3 - 4 - 5]
}




//trim ıntent
//kenar boşluklarını alıyor. içeriği nereye çekersen çıktı öyle gözüküyor.
fun main() {

    println("""
        X O X
        O X O
        X X O 
    """.trimIndent()
    )
}