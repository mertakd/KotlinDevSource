package JetBrainsAcademy.Collections.List

//Quiz 1
fun solution1a(numbers: List<Int>) {
    val result = numbers.filter { it % 2 == 0 }
    println(result.joinToString(""))
}

fun solution1b(numbers: List<Int>) {
    numbers.forEach { if (it % 2 == 0) print("$it ") }
}


fun solution1c(numbers: List<Int>){
    for (i in numbers){
        if (i % 2 == 0) print("$i")
    }
}







//Quiz 2
fun solution2a(numbers: List<Int>): Int {

    var sum = 0
    for (num in numbers){
        sum += num
    }
    return sum
}
fun solution2b(numbers: List<Int>): Int = numbers.sum()

val solution2d: (numbers: List<Int>) -> Int = { it.sum() }







//Quiz 3
fun solution3a(strings: List<String>, str: String): Int{

    var count = 0

    for (string in strings){
        if (string == str){
            count++
        }
    }
    return count
}
fun main3a() {
    //val listMe = listOf("mert","davut","kerem","muhammed","sıddık","mert","mert")
    //val result = solution(listMe,"mert")
    //println(result)
}
fun solution3b(strings: List<String>, str:String) = strings.count(str::equals)
fun solution3c(strings: List<String>, str: String): Int = strings.count{ it == str}
fun solution3d(strings: List<String>, str: String): Int {
    // put your code here
    return strings.filter { s -> s == str }.count()
}
















// Quiz 4
fun solution4a(products: List<String>, product: String) {

    val position = mutableListOf<Int>()

    for (i in products.indices){
        if (products[i] == product){
            position.add(i)
        }
    }
    println(position.joinToString(" "))
}
fun solution4b(products: List<String>, product: String){

    println(products.indices.filter { products[it] == product }.joinToString(" "))
}

fun main4() {

    val listMe = listOf("Mustard", "Cheese", "Eggs", "Cola", "Eggs")
    val result = solution4a(listMe,"Eggs")
    println(result) // 2 4
}














// Quiz 5
fun solution(names: List<String>): Int {
    for (i in 1 until names.size step 2) {
        val word = names[i]
        if (word.startsWith("T")) {
            return i
        }
    }
    // If no matching word is found, you can return -1 or handle it as needed.
    return -1
}

fun solution5a(names: List<String>) =
    names.withIndex().first { it.index % 2 == 1 && it.value.startsWith("T") }.index

fun solution5b(names: List<String>): Int {
    return names
        .withIndex()
        .first { it.value.startsWith("T") && it.index % 2 != 0 }
        .index
}
fun solution5c(n: List<String>) = n.indices.first { it % 2 == 1 && n[it].first() == 'T' }
fun solution5d(names: List<String>) = names.indices.filter { it % 2 == 1 }.first { names[it][0] == 'T' }
fun solution5e(names: List<String>): Int {
    return names.withIndex().map { it.index % 2 == 1 && it.value[0] == 'T' }.indexOf(true)
}

fun main() {
    val names = listOf("Test", "Kora", "Terra", "Tetta", "Garry")
    val result = solution(names)
    println("Index of the first word starting with 'T': $result") // Output: Index of the first word starting with 'T': 3
}