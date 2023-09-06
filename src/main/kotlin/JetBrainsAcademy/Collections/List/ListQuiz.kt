package JetBrainsAcademy.Collections.List

//Quiz 1
fun solution22(numbers: List<Int>) {
    val result = numbers.filter { it % 2 == 0 }
    println(result.joinToString(""))
}

//Quiz 2
fun solution12(numbers: List<Int>): Int {

    var sum = 0
    for (num in numbers){
        sum += num
    }
    return sum
}



//Quiz 3
fun solution(strings: List<String>, str: String): Int{

    var count = 0

    for (string in strings){
        if (string == str){
            count++
        }
    }
    return count
}

fun solution2(strings: List<String>, str:String) = strings.count(str::equals)

fun main3() {
    val listMe = listOf("mert","davut","kerem","muhammed","sıddık","mert","mert")
    val result = solution(listMe,"mert")
    println(result)
}



// Quiz 4
fun solution4(producs: List<String>, product: String){
    val positions = mutableListOf<Int>()
    for (i in producs.indices){
        if (producs[i] == product){
            positions.add(i)
        }
    }
    println(positions.joinToString(" "))
}

fun main4() {

    val listMe = listOf("Mustard", "Cheese", "Eggs", "Cola", "Eggs")
    val result = solution4(listMe,"Eggs")
    println(result)
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

fun solution2(names: List<String>) =
    names.withIndex().first { it.index % 2 == 1 && it.value.startsWith("T") }.index

fun main() {
    val names = listOf("Test", "Kora", "Terra", "Tetta", "Garry")
    val result = solution(names)
    println("Index of the first word starting with 'T': $result") // Output: Index of the first word starting with 'T': 3
}