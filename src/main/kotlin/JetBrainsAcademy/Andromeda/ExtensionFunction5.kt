package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.Andromeda

fun main() {
    val numbers = Array(5) {
        it + 1
    }

    numbers.swap(index1 = 0, index2 = 4)

    println(numbers.toList())




    //nullable int
    var number2: Int? = null

    println(number2.nullableExtension())
}


fun Array<Int>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}






fun Int?.nullableExtension(): String {
    return if (this == null) {
        "oops! error"
    } else {
        toString()
    }
}