fun main() {
    println("Write how many ml of water the coffee machine has:")
    val availableWater = readLine()?.toIntOrNull() ?: 0

    println("Write how many ml of milk the coffee machine has:")
    val availableMilk = readLine()?.toIntOrNull() ?: 0

    println("Write how many grams of coffee beans the coffee machine has:")
    val availableCoffeeBeans = readLine()?.toIntOrNull() ?: 0

    println("Write how many cups of coffee you will need:")
    val cupsNeeded = readLine()?.toIntOrNull() ?: 0

    val canMakeCups = minOf(
        availableWater / 200,
        availableMilk / 50,
        availableCoffeeBeans / 15
    )

    if (canMakeCups >= cupsNeeded) {
        if (canMakeCups == cupsNeeded) {
            println("Yes, I can make that amount of coffee")
        } else {
            val additionalCups = canMakeCups - cupsNeeded
            println("Yes, I can make that amount of coffee (and even $additionalCups more than that)")
        }
    } else {
        println("No, I can make only $canMakeCups cups of coffee")
    }
}
