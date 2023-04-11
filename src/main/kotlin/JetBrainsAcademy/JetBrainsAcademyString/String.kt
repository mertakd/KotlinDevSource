package JetBrainsAcademy.JetBrainsAcademyString

fun main1() {
    val number = readLine()!!.toString()
    println(number[number.length - 2])
}


fun main2() {
    fun main() = println(readLine()!! == readLine()!!)
    //iki string eşit mi değil mi karşılaştırıyor.
}


fun main3() {
    val line1 = readLine() ?: ""
    val line2 = readLine() ?: ""
    val line3 = readLine() ?: ""
    val isEqual = line3 == line1 + line2
    println(isEqual)
}

fun main4() {
    val (a, b, c) = Array(3) { readln() }
    print(a + b == c)

}

fun main5() {
    val firstName = readLine() ?: ""
    val lastName = readLine() ?: ""
    val initials = firstName.first().toUpperCase() + ". " + lastName.capitalize()
    println(initials)

    //println("${readln().first()}. ${readln()}") }
}


fun main6() {
    val (first, last, age) = readLine()!!.split(" ")
    println("${first.first()}. $last, $age years old")
}


fun main() {
    val inputString = readLine()!!
    val index = readLine()!!.toInt()
    val symbol = inputString[index - 1]
    println("Symbol # $index of the string \"$inputString\" is '$symbol'")
}


