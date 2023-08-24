package JetBrainsAcademy.Classes.DataClass.DestructuringDeclarations

//Bazen bir nesneyi çeşitli değişkenlere ayırmak uygun olabilir.
//For example, to better manipulate it, or to make a piece of code more concise. In this topic, we'll see how this can be done.

data class User(val name: String, val age: Int, val isAdmin: Boolean)


fun main() {
    val anonym = User("Anonym", 999, false)
    val (userName, userAge, isAdmin) = anonym
    println(userName)  // prints Anonym
    println(userAge)   // prints 999
    println(isAdmin)   // prints false

    //ihtiyacımız olan tek şey bu! Artık tüm değişkenleri sınıftan ayırabilir ve onlarla ayrı nesneler olarak çalışabiliriz:
    //This feature is called a destructuring declaration.


    val userName1 = anonym.component1()
    val userAge1 = anonym.component2()
    val isAdmin1 = anonym.component3()

}





// 2.Destructuring without data classes
//data class larda zaten var override edemezsin component i

class User2(val name: String, val age: Int, val isAdmin: Boolean){
    operator fun component1(): String = name
    operator fun component2(): Int = age
    operator fun component3(): Boolean = isAdmin
}

// now we can use default destructuring syntax
fun checkIsAdmin(suspiciousUser: User2) {
    // destructuring
    val (name, age, isAdmin) = suspiciousUser

    if (isAdmin)
        println("Have a nice day!")
    else
        println("Sorry, you should not be here.")
}