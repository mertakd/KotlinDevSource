package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.TamingExceptions

fun calculateSpentMoney1(total: Int, itemPrice: Int): Int {
    val amountToBuy = total / itemPrice
    return amountToBuy * itemPrice
}



fun calculateSpentMoney2(total: Int, itemPrice: Int): Int {

    if (itemPrice == 0) {
        return 0
    }
    val amountToBuy = total / itemPrice
    return amountToBuy * itemPrice

}




//Yani kendimiz bir istisna üretiyoruz! Kotlin'de bunu yapmak için throw anahtar sözcüğü vardır.

fun calculateSpentMoney(total: Int, itemPrice: Int): Int {
    if (total < 0) {
        throw Exception("Total can't be negative")
    }
    if (itemPrice < 0) {
        throw Exception("Item price can't be negative")
    }
    if (itemPrice == 0) {
        return 0
    }
    val amountToBuy = total / itemPrice
    return amountToBuy * itemPrice
}

fun main() {
    //calculateSpentMoney(-10,4)
    makeAnException()

    val anException = Exception("New exception")
}


fun makeAnException(): Nothing {
    throw Exception("I'm an exception!")
}