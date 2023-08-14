package JetBrainsAcademy.Classes

class Superhero {
    val power = 1000

    class MagicCloak{

        val magicPower = 100
    }

    val magicPower = power * MagicCloak().magicPower



    class Hammer{

        val mightPower = 100
    }

    val mightPower = power * Hammer().mightPower
}


fun main1() {

    val cloak = Superhero.MagicCloak()
    val hammer = Superhero.Hammer()
}





/*

fun main() {

    val cat: Cat = Cat("Bob")
    val bow: Cat.Bow = cat.Bow("red")

    bow.printColor()
}


class Cat(val name:String){

    inner class Bow(val color:String){
        fun printColor(){
            println("The cat named $name has a $color bow.")
        }
    }

    val catBow = Bow("Green")
}

*/


class Cat(val name:String){
    fun sayMeow(){
        println("$name says: \"Meow\".")
    }


    inner class Bow(val color:String){
        fun putOnABow(){
            sayMeow()
            println("The bow is on!")
        }


        fun printColor(){
            println("The cat $name has a $color bow.")
        }
    }
}


fun main3() {

    val cat: Cat = Cat("Princess")
    val bow: Cat.Bow = cat.Bow("golden")

    bow.printColor()
    bow.putOnABow()
}


fun main() {

    val cat: Cat2 = Cat2("Capkin","Orange")
    val bow: Cat2.Bow = cat.Bow("golden")

    bow.printColor()
}

class Cat2(val name: String, val color: String) {
    inner class Bow(val color: String) {
        fun printColor() {
            println("The cat named $name is ${this@Cat2.color} and has a $color bow.")
        }
    }
}