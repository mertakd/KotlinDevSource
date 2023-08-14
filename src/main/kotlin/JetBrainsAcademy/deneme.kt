package JetBrainsAcademy

class Cat(val name: String, val color: String, val size: Int) {

    fun sayMeow() {
        println("$name says: \"Meow\".")
    }

    inner class Bow(val color: String, val size: Int) {
        fun printColor() {
            print("The cat named $name is $color. ")
            print("The size of $name is $size. ")
            print("The cat named $name has a ${this.color} bow. ")
            print("The size of the bow is ${this.size}.")
        }
    }
}

fun main2() {
    val cat = Cat("Bob", "white", 10)
    val bow = cat.Bow("red", 15)
    bow.printColor()
}





class Vehicle {
    inner class Engine {
        fun start() {
            println("RRRrrrrrrr....")
        }
    }
}
// do not touch the class above

fun main() {
    // start your vehicle, put your code here
    val vehicle:Vehicle = Vehicle()
    val engine:Vehicle.Engine = vehicle.Engine()
    engine.start()
}