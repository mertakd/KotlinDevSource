package JetBrainsAcademy.Projects.CoffeeMachine



// Global variables representing the coffee machine's state
var money = 550 // Initial amount of money
var water = 400 // Initial amount of water in ml
var milk = 540 // Initial amount of milk in ml
var coffeeBeans = 120 // Initial amount of coffee beans in grams
var disposableCups = 9 // Initial number of disposable cups

fun main() {
    println("Starting to make a coffee")
    grindCoffeeBeans2()
    boilWater2()
    mixCoffeeWithWater2()
    pourCoffeeIntoCup2()
    pourMilkIntoCup2()
    println("Coffee is ready!")

    println("Write how many cups of coffee you will need:")
    val cupsNeeded = readLine()?.toIntOrNull()
    if (cupsNeeded != null) {
        calculateIngredients(cupsNeeded)
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}

fun calculateIngredients(cupsNeeded: Int) {
    val totalWater = cupsNeeded * 200
    val totalMilk = cupsNeeded * 50
    val totalCoffeeBeans = cupsNeeded * 15

    println("For $cupsNeeded cups of coffee you will need:")
    println("$totalWater ml of water")
    println("$totalMilk ml of milk")
    println("$totalCoffeeBeans g of coffee beans")
}

fun grindCoffeeBeans2() {
    println("Grinding coffee beans")
}

fun boilWater2() {
    println("Boiling water")
}

fun mixCoffeeWithWater2() {
    println("Mixing boiled water with crushed coffee beans")
}

fun pourCoffeeIntoCup2() {
    println("Pouring coffee into the cup")
}

fun pourMilkIntoCup2() {
    println("Pouring some milk into the cup")
}
