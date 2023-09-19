package JetBrainsAcademy.Classes.Generics.BasicGenerics

class BoxBest<T>(t: T){

    var value = t
        get() = field
        set(value) {
            field = value;
        }
}


fun main8759647598() {

    val box1 = BoxBest(42)
    val box2 = BoxBest("hello")

    val obj1: BoxBest<Int> = BoxBest<Int>(123)
    val obj2: BoxBest<String> = BoxBest<String>("abc")


    println("Box1 value: ${box1.value}")
    println("Box2 value: ${box2.value}")

    box1.value = 99
    box2.value = "mert"

    println("Box 1 value after update: ${box1.value}")
    println("Box 2 value after update: ${box2.value}")
}









//Generic and several type parameters
class Pair<T, P>(var first: T, var second: P) {

    fun changeFirst(newValue: T) {
        first = newValue
    }


    fun changeSecond(newValue: P) {
        second = newValue
    }


    fun printData() {
        println("Values:")
        println("first = $first")
        println("second = $second")
    }

}

fun main980989008() {

    val nameLastname: Pair<String, String> = Pair("Mert","Akdogan")
    val nameAge: Pair<String, Int> = Pair("Kite",18)

    nameLastname.changeFirst("John")
    nameLastname.changeSecond("Smith")

    nameAge.changeFirst("fatma")
    nameAge.changeSecond(19)

    nameLastname.printData()
    nameAge.printData()


}

















class RandomCollection<T>(val items: List<T>) {
    fun get(index: Int): T {
        return items[index]
    }

    fun length(): Int {
        return items.size
    }
}


fun main5687568() {

    var nums = RandomCollection(listOf(10, 25, 32, 4))


    for (i in 0 until nums.length()) {
        print("${nums.get(i)} ") // "1 2 3 4 "
    }
}



/*
* Bu ifade, RandomCollection sınıfının çok amaçlı bir şekilde kullanılabileceğini ve bu sınıfın içinde farklı türlerdeki öğeleri saklayabileceğinizi belirtiyor. Bu, genel olarak "parametrize edilebilir" bir sınıf olduğu anlamına gelir. İşte daha ayrıntılı bir açıklama:

Temel Tipler: RandomCollection sınıfını temel veri türleriyle kullanabilirsiniz. Örneğin, tam sayılar (Int), ondalık sayılar (Double), karakterler (Char) gibi temel veri türlerini bu sınıfın içine yerleştirebilirsiniz. Örneğin:

kotlin
Copy code
val numbers = RandomCollection(listOf(1, 2, 3, 4))
val decimals = RandomCollection(listOf(1.5, 2.7, 3.0))
Standart Sınıflar: Aynı şekilde, standart Kotlin sınıflarını da kullanabilirsiniz. Örneğin, bir dize koleksiyonu (String) veya bir tarih koleksiyonu (Date) oluşturabilirsiniz:

kotlin
Copy code
val words = RandomCollection(listOf("Hello", "World", "Kotlin"))
val dates = RandomCollection(listOf(Date(), Date(System.currentTimeMillis() + 86400000)))
Kendi Tanımladığınız Sınıflar: Ayrıca, kendi oluşturduğunuz özel sınıfları da RandomCollection ile kullanabilirsiniz. Özel sınıflar, uygulamanızın ihtiyaçlarına göre tanımladığınız veri yapıları olabilir. Örneğin, bir Person sınıfı koleksiyonu oluşturabilirsiniz:

kotlin
Copy code
data class Person(val name: String, val age: Int)

val people = RandomCollection(listOf(Person("Alice", 30), Person("Bob", 25)))
Bu nedenle, RandomCollection sınıfını kullanarak, temel veri türleri, standart Kotlin sınıfları ve kendi tanımladığınız özel sınıflar gibi farklı türlerdeki koleksiyonları temsil edebilirsiniz. T generic parametre, bu çeşitliliği desteklemek için kullanılır ve sınıfın çok amaçlı kullanımına olanak tanır.
* */

