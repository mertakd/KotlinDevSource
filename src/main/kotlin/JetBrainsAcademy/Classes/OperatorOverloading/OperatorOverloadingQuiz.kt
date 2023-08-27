package JetBrainsAcademy.Classes.OperatorOverloading

//quiz1
operator fun String.div(value:Int): Int{
    val intValue = this.toInt()
    return intValue / value
}


fun main11() {
    println("13" / 8)
    println("12" / 2)
}


//quiz2
operator fun String.contains(n: Int) = n in 0..this.length

fun main() {
    val s = "Kotlin"
    println(1 in s)
}