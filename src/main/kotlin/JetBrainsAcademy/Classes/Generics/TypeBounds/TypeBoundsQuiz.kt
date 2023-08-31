package JetBrainsAcademy.Classes.Generics.TypeBounds

// Quiz 1
fun <T: Comparable<T>> getBigger(a: T, b: T) : T {

    return if (a > b) a else b
}






// Quiz 2
open class Animal
class Cat : Animal(){



}

class Box<T : Animal> {

    fun <T:Animal> add(t:T) {}
}

fun main() {

    val catBox = Box<Cat>()
    val cat = Cat()

    catBox.add(cat)
}