package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.Collections.Filtering

val isEven: (Int) -> Boolean = { x -> x % 2 == 0}

fun main11() {

    val numbers = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


    // List of even numbers
    println(numbers.filter { x -> x % 2 == 0 })
    println(numbers.filter(isEven))
    println(numbers.filter{ isEven(it)})


    //listede ki tek sayılar
    println(numbers.filter{x -> x % 2 != 0})


    //listedeki çift sayıların 3 den büyük olan index lileri
    println(numbers.filterIndexed{i, number -> i > 3 && number % 2 == 0})

    // List of words with odd index and starting with "k"
    val words = listOf("peter", "kyle", "robert", "kate", "kevin", "anne", "jeremy")
    println(words.filterIndexed { i, word -> i % 2 != 0 && word.startsWith("k") })
}



fun main22() {
    val numbers = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val even = numbers.filter { x -> x % 2 == 0 }

    val odd = mutableListOf<Int>()
    for (i in numbers) {
        if (i % 2 != 0) {
            odd.add(i)
        }
    }

    println(even) // [0, 2, 4, 6, 8, 10]
    println(odd) // [1, 3, 5, 7, 9]
}



fun main33() {
    val elements = listOf(null, 0, "string", 3.14, null, 'c', "Luke")

    // Only string elements
    println(elements.filter { x -> x is String }) // [string, Luke]
    println(elements.filterIsInstance<String>()) // [string, Luke]
    // not null elements
    println(elements.filterNot { x -> x == null }) // [0, string, 3.14, c, Luke]
    println(elements.filterNotNull())
    // only integer elements
    println(elements.filterIsInstance<Int>())
}


fun main() {
    val numbers = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val (even, odd) = numbers.partition { x -> x % 2 == 0 }
    println(even) // [0, 2, 4, 6, 8, 10]
    println(odd) // [1, 3, 5, 7, 9]
}