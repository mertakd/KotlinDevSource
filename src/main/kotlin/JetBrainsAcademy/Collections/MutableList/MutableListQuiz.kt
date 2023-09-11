package JetBrainsAcademy.Collections.MutableList

import java.util.*

// Quiz 1
fun main11() {
    val numbers = mutableListOf(1, 2, 3, 4, 1, 5, 1)
    numbers.add(1)
    numbers.remove(1)
    println(numbers)
}


//Quiz 2
fun solution2a(elements: MutableList<String>, index: Int): MutableList<String> {
    if (index >= 0 && index < elements.size) {
        elements.removeAt(index)
    }
    return elements
}

fun solution2b(elements: MutableList<String>, index: Int): MutableList<String> {
    return elements.apply { removeAt(index) }
}
fun solution2c(elements: MutableList<String>, index: Int): MutableList<String> {
    // put your code here
    elements.removeAt(index)
    return elements
}

fun main2a() {
    val scanner = Scanner(System.`in`)

    // Kullanıcıdan dizi elemanlarını okuyun
    println("Dizi elemanlarını girin (boşluklarla ayrılmış):")
    val inputString = scanner.nextLine()
    val elements = inputString.split(" ").toMutableList()

    // Kullanıcıdan indeksi okuyun
    println("Silmek istediğiniz elemanın indeksini girin:")
    val index = scanner.nextInt()

    val result = solution2a(elements, index)

    println("Sonuç: ${result.joinToString(" ")}")
}







// Quiz 3
fun names3a(namesList: List<String>) = namesList
    .groupingBy { it }
    .eachCount()
    .map { (key, value) -> "The name $key is repeated $value times" }

fun names3b(namesList: List<String>): List<String> = namesList.toSet().map {
    "The name $it is repeated ${namesList.filter { itF -> it == itF }.size} times"
}
fun names3c(namesList: List<String>) =
    namesList.groupingBy { it }.eachCount().map { "The name ${it.key} is repeated ${it.value} times" }

fun names(namesList: List<String>): List<String> {
    val nameCount = mutableListOf<String>()
    for (name in namesList) {
        nameCount.add(
            "The name $name is repeated ${namesList.count { it == name }} times"
        )
    }
    return nameCount.distinct()
}
fun main3a() {
    val namesList = listOf("Alice", "Bob", "Alice", "Charlie", "Bob", "David", "Alice")

    val result = names(namesList)

    result.forEach { println(it) }
}








//Quiz 4
fun solution4aa(numbers: List<Int>, number: Int): MutableList<Int> {

    val myList = numbers.toMutableList()
    myList.add(number)
    return myList

}

fun main4a() {

    val list = listOf(2,4,6,8)
    val mySolution = solution4aa(list,29)
    println(mySolution)
}






// Quiz 5
fun solutions5a(first: List<Int>, second: List<Int>): MutableList<Int>{
    return (first + second).toMutableList()
}
fun main5a() {
    val list = listOf(2,4,6,8)
    val list2 = listOf(7,9,2,1)
    //val result = solutions5(list,list2)
    //println(result)
}





// Quiz 6
fun solution6a(strings: MutableList<String>, str: String): MutableList<String> {
    for (i in strings.indices) {
        if (strings[i] == str) {
            strings[i] = "Banana"
        }
    }
    return strings
}

fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    strings.replaceAll { if (it == str) "Banana" else it }
    return strings
}


fun main() {
    val strings = mutableListOf("Sometimes", "you", "have", "to", "shake", "up", "your", "life")
    val strToReplace = "shake"

    val result = solution(strings, strToReplace)

    println(result)
}







