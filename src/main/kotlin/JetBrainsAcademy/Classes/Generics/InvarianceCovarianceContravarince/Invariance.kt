package JetBrainsAcademy.Classes.Generics.InvarianceCovarianceContravarince

// bir sınıfın her zaman bir tür olmasına rağmen bir türün mutlaka bir sınıf olması gerekmediğidir.


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
class Cat
class Dog

fun addDog(list: MutableList<Any>) {
    list.add(Dog())
}

fun main() {
    val cats = mutableListOf(
        Cat(),
        Cat(),
        Cat()
    )

    addDog(cats) // technically ok because Cat extends Any, but MutableList is invariant on its type parameter

    cats.forEach {
        println(it)
    }

    /* if MutableList would not be invariant on its type parameter, you
     * would receive a ClassCastException at runtime
     * since Dog cannot be cast to Cat
     */
}

