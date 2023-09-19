package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.TypesAndDataStructures.DataTypes.TypeSystem

// ANY?  ANY  EN ÜST TÜR.
//ANY, UNIT, NUMBER, INT, NOTHING






//NOTHING
data class Person(val name: String?)

fun throwIfNull() {
    throw Exception("Name can't be null!")
}

fun main() {
    val person = Person(null)
    val personName = person.name ?: throwIfNull()
    println(personName)
}