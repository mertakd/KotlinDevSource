package JetBrainsAcademy.Classes.MemberFunction

import kotlin.random.Random // library for getting random numbers
class MyClassWithProperty(var property: Int) {
    fun printProperty() {
        println(this.property)
    }
}






class Cat(val name: String) {

    /** The current state of the cat (by default a cat isn't sleeping). */
    var sleeping: Boolean = false

    /**
     * A cat says "meow" if it is not sleeping, otherwise, it says "zzz".
     * After a cat says "meow", it can sometimes fall asleep.
     */
    fun say() {
        if (sleeping) {
            println("zzz")
        } else {
            println("meow")

            if (Random.nextDouble() < 0.1) { //generates a double value between 0 and 1.0
                sleeping = true
            }
        }
    }

    /** The function wakes the cat. */
    fun wakeUp() {
        sleeping = false
    }
}

fun main() {
    val pharaoh = Cat("Pharaoh")  // Create a cat named "Pharaoh"

    repeat (5) {
        pharaoh.say()  // it says "meow" or "zzz"
    }

    pharaoh.wakeUp()  // wake the cat up
    pharaoh.say()  // it says "meow"
}