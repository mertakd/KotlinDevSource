package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.Collections.Set

/*
*Değişmez bir koleksiyon olan Set'in aksine, MutableSet değiştirilebilir veya değiştirilebilir: öğeleri serbestçe ekleyebilir ve kaldırabilirsiniz. */



fun main111() {

    val groceries = setOf("Banana", "Strawberry")
    println(groceries) // [Banana, Strawberry]



    val groceries2 = mutableSetOf("Banana", "Strawberry")
    groceries2.add("Water")
    println(groceries2) // [Banana, Strawberry, Water]



    //mutablelist ile farkı
    val groceries3 = mutableSetOf("Banana", "Banana", "Strawberry")
    println(groceries3) // [Banana, Strawberry]

    val secondGroceries3a = mutableListOf("Banana", "Banana", "Strawberry")
    println(secondGroceries3a) // [Banana, Banana, Strawberry]
}


fun main() {

    val groceries = mutableSetOf("Apple", "Water", "Banana", "Pen")

    groceries.remove("Apple")
    println(groceries) // [Water, Banana, Pen]

    val uselessGroceries = setOf("Banana", "Pen")
    groceries.removeAll(uselessGroceries)
    println(groceries) // [Water]

    groceries.clear()
    println(groceries) // []
}