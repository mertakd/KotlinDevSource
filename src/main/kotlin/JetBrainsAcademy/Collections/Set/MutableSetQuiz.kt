package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.Collections.Set

// Quiz 1
fun solution(elements: MutableSet<Int>, element: Int): MutableSet<Int> {

    if (elements.contains(element)) {
        return mutableSetOf() // Return an empty set if the element is present.
    }

    return elements // Return the original set if the element is not present.
}


fun main() {

    val elements = mutableSetOf(5, 6, 7)
    val elementToCheck = 0
    val result = solution(elements, elementToCheck)
    println(result.joinToString(" ")) // This will print "5 6 7"

}