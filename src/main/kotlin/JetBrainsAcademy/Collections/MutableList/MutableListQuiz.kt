package JetBrainsAcademy.Collections.MutableList

// Quiz 1
fun main11() {
    val numbers = mutableListOf(1, 2, 3, 4, 1, 5, 1)
    numbers.add(1)
    numbers.remove(1)
    println(numbers)
}


//Quiz 2
fun solution(elements: MutableList<String>, index: Int): MutableList<String> = elements.apply { removeAt(index) }
