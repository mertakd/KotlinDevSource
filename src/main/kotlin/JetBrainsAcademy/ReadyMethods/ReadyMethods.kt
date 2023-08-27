package JetBrainsAcademy.ReadyMethods

// joinToString :  değerler arasında boşluk bırakmak, noktalama işaretleri koymaya yarar.

val numbers = listOf(1, 2, 3, 4, 5)
val result = numbers.joinToString(separator = "-", prefix = "[", postfix = "]")
fun main() {
    println(result) // Output: [1 - 2 - 3 - 4 - 5]
}