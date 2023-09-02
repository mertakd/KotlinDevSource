package JetBrainsAcademy.Classes.Generics.InvarianceCovarianceContravarince

// bir sınıfın her zaman bir tür olmasına rağmen bir türün mutlaka bir sınıf olması gerekmediğidir.

//Varsayılan olarak Jenerikler Kotlin'de değişmezdir(invariant). Bu, Köpek'in Hayvan'ın bir alt türü olduğu, ancak <Köpek> Listesi'nin <Hayvan> Listesi'nin bir alt türü olmadığı anlamına gelir.


/*

fun main1() {
    var jerryTheSloth: Sloth
    var jerryTheSloth2: Sloth?

    val slothCrew = listOf(
        Sloth("Jerry", false),
        Sloth("Bae", true),
        Sloth("Chrissy", false)
    )


    val slothReg: List<Sloth> = listOf()
    val slothReg2 = listOf<Sloth>()


}

data class Sloth(val name: String, val isTwoFingered: Boolean) {
    fun eat() {}
    fun sleep() {}
}

fun feedCrew(crew: List<Sloth>) {
    crew.forEach {
        it.eat()
    }
}



data class Panda(val name: String) {
    fun eat() {}
    fun sleep() {}
}

fun feedCrew(crew: List<Panda>) {
    crew.forEach {
        it.eat()
    }
}

*/
/*

fun main() {
    val slothCrew = listOf(
        Sloths("Jerry", false),
        Sloths("Bae", true),
        Sloths("Chrissy", false),
    )

    val pandaCrew = listOf(
        Pandas("Jay"),
        Pandas("Peggy")
    )

    feedCrew(slothCrew)
    feedCrew(pandaCrew)
}



open class Mammal(val name: String) {
    fun eat() {
        println("eating $name")
    }
    fun sleep() {}
}

data class Sloths(val slothName: String, val isTwoFingered: Boolean): Mammal(slothName)

data class Pandas(val pandaName: String) : Mammal(pandaName)

fun feedCrew(crew: List<Mammal>) { // List<out E> is covariant on its element type
    crew.forEach {
        it.eat()
    }
}


*/


// Covariance  sınıfı, alt tiplemenin korunduğu generic bir sınıftır. out
// Contravarince üst tplemenin korunduğu, in.

/*

class Cat
class Dog

fun addDog(list: MutableList<Any>) {
    list.add(Dog())
}

fun main34() {
    val cats = mutableListOf(
        Cat(),
        Cat(),
        Cat()
    )

   //addDog(cats) // technically ok because Cat extends Any, but MutableList is invariant on its type parameter

    cats.forEach {
        println(it)
    }

    */
/* if MutableList would not be invariant on its type parameter, you
     * would receive a ClassCastException at runtime
     * since Dog cannot be cast to Cat
     *//*

}

*/



open class Animal
class Dog : Animal()
class Cat : Animal()

fun main45345() {
    val animals: MutableList<Animal> = mutableListOf()
    val dogs: MutableList<Dog> = mutableListOf()

    // Bu satır hata verir, çünkü MutableList<Dog> MutableList<Animal>'ın alt türü değildir.
    // animals = dogs

    // Bu satır da hata verir, çünkü MutableList<Animal> MutableList<Dog>'un alt türü değildir.
    // dogs = animals
}



open class Fruit
class Apple : Fruit()
class Banana : Fruit()

fun getFruits(): List<out Fruit> {
    return listOf(Apple(), Banana())
}

fun main2354324() {
    val fruits: List<out Fruit> = getFruits() // Covariance
    // val apple: Apple = fruits[0] // OK
}


fun main() {

    fun calculate(number: Number) {}

    val number: Int = 1
    calculate(number)

}




