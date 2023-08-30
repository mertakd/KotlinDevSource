package JetBrainsAcademy.Classes.Interfaces

/**
 * Kotlin'de arayüzler sınıflara benzer şekilde tanımlanır, ancak yapıcılar olmadan arayüzler durumları saklayamaz.
 * Bu, bir arayüzün örneğini oluşturamayacağımız, ancak o arayüzü uygulayan sınıfın bir örneğini yaratabileceğimiz anlamına gelir.
 * Burada basit bir arayüzümüz var; farklı hayvanları temsil edecek sınıflar için bir "iskelet".
 * Bir arayüzün yöntemleri, tıpkı diğer yöntemler gibi, bazı değerleri döndürebilir (yukarıdaki örnekte belirtildiği gibi).
 * tüm arayüz uygulanmalı yoksa hata alırız.
 *
 * body li bir fonk siyon yazarsak bunu implement etmemize gerek kalmaz.
 * interface ler sınıflar dan ziya de nesnelerle etkileşime girerler.
 * What OOP principles do interfaces implement?
    Encapsulation ve Abstraction*/

interface Animal {

    val numberOfLimbs: Int
    fun move()
    fun communicate(): String
}

class Cat : Animal {
    override val numberOfLimbs: Int = 4

    override fun move() {
        //run()
    }

    override fun communicate(): String {
        return ""//sayMeow()
    }
}


class Parrot : Animal {
    override val numberOfLimbs: Int = 2

    override fun move() {
        //fly()
    }

    override fun communicate(): String {
        return "" // speak()
    }
}


// 4.Adding default implementation
interface Animal2 {
    val numberOfLimbs: Int
    fun move()
    fun communicate(): String
    //val age = 10 // Error: Property initializers are not allowed in interfaces
}


interface Animal3 {
    val numberOfLimbs: Int
    fun move()
    fun communicate(): String

    val age: Int
        get() = 10
}
//setter ile değer atılabilir.




interface Animal4 {
    val numberOfLimbs: Int
    fun move()
    fun communicate(): String

    val age: Int
        get() = 10

    // Default implementation of a method
    fun printNumberOfLimbs() {
        print(numberOfLimbs)
    }

    fun boxex()


}


class Bird() : Animal4{

    override fun move() {
        TODO("Not yet implemented")
    }

    override fun communicate(): String {
        TODO("Not yet implemented")
    }

    override val age: Int
        get() = super.age

    override val numberOfLimbs: Int
        get() = TODO("Not yet implemented")

    override fun printNumberOfLimbs() {
        super.printNumberOfLimbs()
    }

    override fun boxex() {
        TODO("Not yet implemented")
    }
}
fun main() {
    val bird = Bird()
    bird.communicate()
}



//Varsayılan uygulama sağlanmadığı sürece, bir sınıfın arayüzün tüm üyelerini ve yöntemlerini uygulaması gerekir.
//A class implementing the interface, must implement all abstract members of the latter.


