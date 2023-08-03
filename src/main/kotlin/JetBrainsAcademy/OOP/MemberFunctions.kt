package JetBrainsAcademy.OOP

import kotlin.random.Random


//member functions lar ayrıca methods olarak da adlandırılıyor
class MyClass {

    fun print() = println("Hello from print")
}


class MyClassWithProperty(var property:Int){

    fun printProperty(){
        println(this.property)
    }
}

fun main1() {

    val myObject = MyClassWithProperty(10)
    myObject.printProperty()
}



















class User(val userName:String, val password:String){


    fun login():Boolean {


        if (this.userName == "user" && this.password == "password"){
            println("Giriş başarılı. Hoşgeldiniz, ${this.userName}")
            return true
        }else{
            println("Hatalı kullanıcı adı ve şifre")
            return false
        }
    }
}

fun main2() {

    val user = User("user", "password")

    user.login()
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
