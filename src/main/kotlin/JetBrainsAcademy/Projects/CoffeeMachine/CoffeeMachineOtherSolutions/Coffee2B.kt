package JetBrainsAcademy.Projects.CoffeeMachine.CoffeeMachineOtherSolutions



fun main() {
    print("Write how many cups of coffee you will need: ")
    val guestsNumber = readln().toUInt()
    println("For $guestsNumber cups of coffee you will need:")
    val cup = KoffeeMachine.standardKoffeeCup
    listOf(cup.waterVolume, cup.milkVolume, cup.coffeeVolume).forEach {
        with(it) { println("${guestsNumber * quantity} ${unit.desc} of ${type.desc}") }
    }
}


class KoffeeMachine {
    companion object {
        var standardKoffeeCup: KoffeeCup = StandardKoffeeCup()
    }

    fun `Starting to make a coffee`() = println("Starting to make a coffee")
    fun `Grinding coffee beans`() = println("Grinding coffee beans")
    fun `Boiling water`() = println("Boiling water")
    fun `Mixing boiled water with crushed coffee beans`() = println("Mixing boiled water with crushed coffee beans")
    fun `Pouring coffee into the cup`() = println("Pouring coffee into the cup")
    fun `Pouring some milk into the cup`() = println("Pouring some milk into the cup")
    fun `Coffee is ready!`() = println("Coffee is ready!")
}

abstract class KoffeeCup {
    abstract val waterVolume: Volume
    abstract val milkVolume: Volume
    abstract val coffeeVolume: Volume
}

class CustomKoffeeCup(
    val _waterVolume: Volume,
    val _milkVolume: Volume,
    val _coffeeVolume: Volume
) : KoffeeCup() {
    override val waterVolume = _waterVolume
    override val milkVolume = _milkVolume
    override val coffeeVolume = _coffeeVolume
}

class StandardKoffeeCup : KoffeeCup() {
    override val waterVolume = Volume(Ingredient.WATER, 200U, Unit.ML)
    override val milkVolume = Volume(Ingredient.MILK, 50U, Unit.ML)
    override val coffeeVolume = Volume(Ingredient.COFFEE_BEANS, 15U, Unit.GM)
}

data class Volume(val type: Ingredient, val quantity: UInt, val unit: Unit)

enum class Ingredient(val desc: String) {
    WATER("water"),
    MILK("milk"),
    COFFEE_BEANS("coffee beans")
}

enum class Unit(val desc: String) {
    ML("ml"),
    GM("g")
}