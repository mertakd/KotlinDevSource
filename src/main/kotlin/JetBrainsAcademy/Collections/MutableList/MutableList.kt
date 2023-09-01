package JetBrainsAcademy.Collections.MutableList

fun main1() {

    //LIST
    val places = listOf<String>("Paris", "Moscow", "Tokyo")
    println(places) // output: [Paris, Moscow, Tokyo]


    println("places 2")
    var places2 = listOf<String>("Paris", "Moscow", "Tokyo") // note var keyword
    places2 += "Saint-Petersburg" // reassignment, slow operation
    println(places2) // output: [Paris, Moscow, Tokyo, Saint-Petersburg]
    //yeniden atayarak eleman ekleyebiliyoruz bu verimsiz yol List de.




    //MUTABLE LIST
    val places3 = mutableListOf<String>("Paris", "Moscow", "Tokyo")
    places3.add("Saint-Petersburg")
    println(places) // output: [Paris, Moscow, Tokyo, Saint-Petersburg]
}


fun main2() {
    //INITIALIZING
    val cars = mutableListOf("Ford", "Toyota", "Audi", "Mazda", "Tesla")
    println(cars) // output: [Ford, Toyota, Audi, Mazda, Tesla]

    //Boş bir MutableList oluşturursanız türü belirtmeniz gerektiğini unutmayın:
    val cars2 = mutableListOf<String>()
    println(cars2) // output: []


    //Ayrıca toMutableList() fonksiyonunun yardımıyla List'i MutableList'e dönüştürebilirsiniz
    val cars3 = listOf("Ford", "Toyota").toMutableList()
    cars3.add("Tesla")
    println(cars) // output: [Ford, Toyota, Tesla]
}


fun main3() {

    val products = listOf("Milk", "Cheese", "Coke")
    val finalList = products.toMutableList()
    finalList.add("Chips")
    finalList[0] = "Water" // or finalList.set(0, "Water")
    println(finalList) // output: [Water, Cheese, Coke, Chips]
}


fun main4() {

    val products = mutableListOf("Milk", "Cheese", "Coke")
    val dadsProducts = listOf("Banana", "Watermelon", "Apple")

    products.addAll(dadsProducts)

    println(products) // output: [Milk, Cheese, Coke, Banana, Watermelon, Apple]
}


fun main5() {

    val products = mutableListOf("Milk", "Cheese", "Coke")

    products.removeAt(0)
    println(products) // output: [Cheese, Coke]

    products.remove("Coke")
    println(products) // output: [Cheese]

    products.clear()
    println(products) // output: []
}


fun main() {
    val products = mutableListOf("Cheese", "Milk", "Coke")

    for (product in products) {
        println("$product")
    }

// Cheese
// Milk
// Coke
}