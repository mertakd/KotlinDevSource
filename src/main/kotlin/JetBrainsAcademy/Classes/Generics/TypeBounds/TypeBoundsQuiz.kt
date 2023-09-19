package JetBrainsAcademy.Classes.Generics.TypeBounds

// Quiz 1
fun main34() {
    var cat = Cat("Kitty")
    var book = Bookk("Harry Potter")

    printTypeBound(cat)
    //printTypeBound(book)   Compile-time error: "Type mismatch"

}

fun <T : Animal> printTypeBound(item: T) {
    println(item.name)
}


open class Animal(var name: String)
class Cat(name: String) : Animal(name)
class Bookk(name: String)










// Quiz 2
// don't change Letter and CherryPie!
class Letter
class CherryPie

// correct the code
class MailBox<T : Letter>(var value: T) {

    fun sendLetter() {
        println("Letter is sent!")
    }
}


fun main2() {
    // Letter sınıfından bir örnek oluşturabiliriz.
    val letter = Letter()

    // Bu örneği kullanarak MailBox sınıfını oluşturabiliriz.
    val mailbox = MailBox(letter)

    // MailBox içindeki mektubu göndermek için sendLetter() yöntemini çağırabiliriz.
    mailbox.sendLetter()
}






//Quiz 3
open class Animal3
class Cat3 : Animal3()


class Box3<T: Animal3>{

    fun <T:Animal3> add(t:T){}
}


fun main3() {

    val animal = Animal3()
    val cat = Cat3()

    val animalBox = Box3<Animal3>()
    val catBox = Box3<Cat3>()

    animalBox.add(animal)
    catBox.add(cat)

}



// Quiz 4
fun <T: Comparable<T>> getBigger(a: T, b: T): T {
    return if (a > b) a else b
}

fun main4() {
    val biggerDouble = getBigger(3.5, 2.8)
    println("Bigger double: $biggerDouble")
}



// Quiz 5
interface Logger { fun log() }
interface Cooker { fun cook() }

class Microwave : Logger, Cooker {
    override fun log() = println("Microwave finished cooking!")
    override fun cook() = println("Microwave is  cooking")
}
class MultiCooker : Logger, Cooker {
    override fun log() = println("Multicooker finished cooking!")
    override fun cook() = println("Multicooker is  cooking")
}


class SmartKitchen<T> where T : Cooker, T : Logger {

    fun finishCooking(device: T) {
        device.log()
    }
}

fun main45675() {

    val microwave = Microwave()
    val multiCooker = MultiCooker()

    val kitchen = SmartKitchen<Microwave>()
    kitchen.finishCooking(microwave)

    val kitchen2 = SmartKitchen<MultiCooker>()
    kitchen2.finishCooking(multiCooker)


}






class Box<T : Animal5> {
    private var content: T? = null

    fun add(animal: T) {
        content = animal
    }
}

// Don't change the class below
open class Animal5
class Cat5 : Animal5()

fun main() {
    val box = Box<Animal5>()
    val cat = Cat5()
    box.add(cat)



}






//SÖZEL

//1
//Milky chance
//You have a function feedWithMilk(animal: Any). You need to add an upper bound so that feedWithMilk takes only the types which extend Animalas arguments . Choose the right option.

//fun <T : Animal> feedWithMilk(animal : T) { }




//2
//Multiple bounds
//You have a generic function doubleTypesTry() which takes List<T> as an argument. Select the correct form where the type T has two upper bounds — the types Type1 and Type2.

//fun <T> doubleTypesTry(list: List<T>) where T: Type1, T : Type2 { }







//3
//Facts about type bounds
//Choose the correct statements about type bounds:

//When you use multiple bounds, the first type should be a class or an interface
//
//By default, all type parameters are constrained by the type Any?




//4
//Advantages of type bounds
//What are the advantages of using type bounds?

//The amount of code can be reduced thanks to type bounds
//
//We can restrict type parameters using type bounds





//5
//Definitely non-nullable
//How do you declare a definitely non-nullable type?

//T & Any




