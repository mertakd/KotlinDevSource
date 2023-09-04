package JetBrainsAcademy.Classes.Generics.TypeAliases


typealias Kitten = Pet.Kitten

class Pet {
    class Kitten(name: String) {
        var kittenName = name
        fun getName(): String {
            return kittenName
        }
    }
}

fun mainAlias() {
    var kitten: Kitten = Kitten("Fluffy")
    println(kitten.getName()) // Fluffy
    println(kitten.getName().length) // 6
}

fun mainNotAlias() {
    fun main() {
        var kitten: Pet.Kitten = Pet.Kitten("Fluffy")
        println(kitten.getName()) // Fluffy
        println(kitten.getName().length) // 6
    }
}


class ClassWithVeryLongName{}
typealias SomeClass = ClassWithVeryLongName


//TÜRÜ VURGULAYARAK
typealias Password = String
val myPassword: Password = "hyperskill"





// GENERİCS KULLANIMI

typealias DessertBox<T> = BoxForSomeDessert<T>

class BoxForSomeDessert<T>(var dessert: T) {
    fun getDessertFromBox(): T {
        return dessert
    }
}

class Tart(var name: String) {}

fun main() {
    var tartBox = DessertBox(Tart("tastytart"))
    println(tartBox.getDessertFromBox().name) // tastytart
}

