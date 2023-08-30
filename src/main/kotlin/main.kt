


interface Animal {
    val amountOfLimbs: Int
    fun move()
    fun communicate()
}

interface Bird : Animal {
    val canFly: Boolean
    val flyingSpeed: Int
    fun buildNest()
}


class Parrot : Bird // : Animal
{
    // These properties are inherited from the Animal interface...
    override val amountOfLimbs: Int = 4

    override fun move() {

    }

    override fun communicate() {

    }

    // ...while these ones are specifically from the Bird interface

    override val canFly: Boolean = true

    override val flyingSpeed: Int = 20

    override fun buildNest() {

    }
}



interface MyInterface {
    val myProperty: Int
    fun myMethod(): Int = 10
    fun mySecondMethod() { print("Hola!") }
}

class MyClass : MyInterface {
    override val myProperty: Int = 10
}



