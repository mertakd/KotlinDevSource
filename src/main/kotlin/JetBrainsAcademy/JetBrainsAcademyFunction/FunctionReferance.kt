package JetBrainsAcademy.JetBrainsAcademyFunction



fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val oddFunction = ::isOdd
    print("Odd numbers: ")
    printNumbers(numbers, oddFunction)
    print("\nEven numbers: ")
    printNumbers(numbers, ::isEven)
}



fun isOdd(x: Int) = x % 2 != 0

fun isEven(x: Int) = x % 2 == 0

fun printNumbers(numbers: MutableList<Int>, filter: (Int) -> Boolean) {
    for (number in numbers) {
        if (filter(number))
            print("$number ")
    }
}