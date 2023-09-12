package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.Collections.Set

// Quiz 1
fun solution1a(strings: MutableList<String>): Set<String> {
    return strings.toSet()
}



// Quiz 2
fun solution2a(numbers1: Set<Int>, numbers2: Set<Int>): Int {
    val result = numbers1 - numbers2
    return result.size
}

fun main2a() {
    val inputSet1 = setOf(8, 11, 12, 13)
    val inputSet2 = setOf(8, 12)
    val output = solution2a(inputSet1, inputSet2)
    println(output) // Output will be 2
}




// QUİZ 3
fun solution(first: Set<String>, second: Set<String>): Set<String> {
    val result = first + second
    return result
}



// Quiz 4
fun solution4(first: Set<String>, second: MutableList<String>): Boolean {

    for (element in second) {

        if (element !in first) {
            return false
        }
    }
    return true
}

fun main4() {
    val inputSet = setOf("A", "B", "C", "D")
    val inputList = mutableListOf("A", "B", "C", "D")
    val output = solution4(inputSet, inputList)
    println(output) // Output will be true
}



