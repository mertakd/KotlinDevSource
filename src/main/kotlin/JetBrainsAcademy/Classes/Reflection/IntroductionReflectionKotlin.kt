package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.Classes.Reflection

class Friend {
    private val friendName = "Eyad"
    private val friendAge = 20
}



fun main99() {
    //val friend = Friend()
    //println(friend.friendName)
}


fun main98() {
    val friend = Friend() // this is normal object
    val friendFields = friend.javaClass.declaredFields // (2)
    friendFields.forEach { println(it) }


}
// output:
// private final java.lang.String Friend.friendName
// private int Friend.friendAge


fun main97() {

    val friend = Friend()
    val field = friend.javaClass.getDeclaredField("friendName")

    field.isAccessible = true

    field.set(friend,"Alex")
    println(field.get(friend))
}








//The javaClass
fun main5674567() {
    val friend = Friend2() //just an object
    val methods = friend.javaClass.declaredMethods // array of methods
    methods.forEach {
        it.isAccessible = true // make the methods not private
        println(it.invoke(friend)) // invoking the methods
    }
}

class Friend2 {
    private val friendName = "Eyad"
    private var friendAge = 20

    private fun greeting(): String {
        return "Hello, $friendName"
    }
    private fun tellSecretMessage(): String{
        return "I am not in danger. I am the danger, $friendName"
    }
}


class Cat{
    private val catName = "Black"
    private val catAge = 3
}

fun main() {
    val cat = Cat()
    val field = cat.javaClass.getDeclaredFields()
    field.forEach { println(it) }


}