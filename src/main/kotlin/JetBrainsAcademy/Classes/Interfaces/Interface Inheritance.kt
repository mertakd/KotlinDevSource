package JetBrainsAcademy.Classes.Interfaces

//Türetilmiş arayüzleri uygulamanın ana kuralı, sınıfın hem temel hem de türetilmiş arayüzden yöntem ve özellikleri uygulaması gerektiğidir:


interface FirstInterface {
    fun f() { print("First") }
    fun g()
}

interface SecondInterface {
    fun f() { print("Second") }
    fun g() { print("g") }
}

class FirstClass : FirstInterface {
    override fun g() { print("g") }
}

data class Client(val name: String, val age: Int, val gender: String) {
    var balance: Int = 0

    override fun toString(): String {
        return "Client(name='$name', age=$age, gender='$gender', balance=$balance)"
    }

}

fun main() {
    val bob = Client("Bob", 29, "Male")
    println(bob.age.toString())
}