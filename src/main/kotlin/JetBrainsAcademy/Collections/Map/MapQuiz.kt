package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.Collections.Map

// Sözel

//1
//Comprehension
//Which construct can you use to create a Pair?

//to




//2
//Comprehension
//Which construction can you use to confirm that a Map is empty?

//isEmpty()




// Quiz 1
fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
    var totalPrice = 0

    for (item in shoppingList) {
        // Check if the item is in the priceList
        if (priceList.containsKey(item)) {
            totalPrice += priceList[item] ?: 0
        }
    }

    return totalPrice
}


fun main() {
    val priceList = mapOf("Cola" to 500, "Apple" to 1500, "Banana" to 300)
    val shoppingList = mutableListOf("Cola", "Apple")
    val totalCost = bill(priceList, shoppingList)
    println(totalCost) // Output: 2000
}
