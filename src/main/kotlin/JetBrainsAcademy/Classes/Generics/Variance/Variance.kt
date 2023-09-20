package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.Classes.Generics.Variance

/*
* Alt tür, üst türün tüm özelliklerini (geçerli değerler ve işlemler) devralır, ancak aynı zamanda ek değerlere veya işlemlere de sahip olabilir veya değerleri bir şekilde kısıtlayabilir.
  Başka bir deyişle, alt türün her değeri aynı zamanda üst türün de bir değeridir ancak bunun tersi geçerli değildir.

* */


fun main99() {
    val integer: Int = 1
    val number: Number = integer // Int is a subtype of Number

    val integer2: Int = 1
    val nullableInteger: Int? = integer2; // Int is a subtype of Int?
}

/*

open class Animal
class Dog : Animal()
class Spider : Animal()

fun main98() {
    val dog: Dog = Dog()
    val spider: Spider = Spider()
    var animal: Animal = dog // Dog is a subtype of Animal
    animal = spider // Spider is a subtype of Animal
}

*/


/*

class Box<T>
open class Animal
class Dog : Animal()
class Spider : Animal()

val d: Animal = Dog() // Dog is a subtype of Animal
val bd: Box<Animal> = Box<Dog>() // Error: Type mismatch
val bp: Box<Dog> = Box<Animal>() // Error: Type mismatch
val bn: Box<Number> = Box<Int>() // Error: Type mismatch
val bi: Box<Int> = Box<Number>() // Error: Type mismatch*/





/*

// INVARIANCE
open class Animal
class Dog : Animal()
class Cat : Animal()

// Box class defined as invariant
class Box<T>

// Invariance with MutableList
// MutableList is defined as MutableList<T> in Kotlin, it's invariant.
// You can produce and cosume values (get() and add()).
// Meaning you can't use a MutableList<Dog> where a MutableList<Animal> is expected and vice versa.
val mutableAnimalsFromDogs: MutableList<Animal> = mutableListOf<Dog>() // This will give a compiler error
val mutableDogsFromAnimals: MutableList<Dog> = mutableListOf<Animal>() // This will give a compiler error

// Invariance with Box
// Box is defined as Box<T> in Kotlin, it's invariant.
// Meaning you can't use a Box<Dog> where a Box<Animal> is expected and vice versa.
val boxOfAnimalsFromDogs: Box<Animal> = Box<Dog>() // This will give a compiler error
val boxOfDogsFromAnimals: Box<Dog> = Box<Animal>() // This will give a compiler error*/









//Covariance (out)
/*
open class Animal
class Dog : Animal()
class Cat : Animal()


class Box<T>



val animals: List<Animal> = listOf(Dog(), Cat())
val dogs: List<Dog> = listOf(Dog(), Dog())
val cats: List<Cat> = listOf(Cat(), Cat())
*/


/*

open class Animal
class Dog : Animal()
class Cat : Animal()

class Box<out  T>


fun main() {

    val dog: Dog = Dog()
    val dogBox: Box<Dog> = Box<Dog>()
    val animalBox: Box<Animal> = dogBox
}

*/

/*


open class Animal
class Dog  : Animal(){
    override fun toString(): String {
        return "hav"
    }
}
class Cat : Animal(){

    override fun toString(): String {
        return "meow"
    }
}

fun copyAnimals(source: MutableList<out Animal>, destination: MutableList<in Animal>) {
    destination.addAll(source)
}

fun main() {
    val dogs: MutableList<Dog> = mutableListOf(Dog(), Dog())
    val cats: MutableList<Cat> = mutableListOf(Cat(), Cat())

    val animals: MutableList<Animal> = mutableListOf()

    copyAnimals(dogs, animals)
    copyAnimals(cats, animals)

    println(animals)
}
*/


/*

open class Animal
class Dog : Animal(){

    override fun toString(): String {
        return "hav"
    }
}
class Cat : Animal(){

    override fun toString(): String {
        return "meow"
    }
}

class Box<T>(val item: T)

fun printItems(boxes: List<Box<*>>) {
    for (box in boxes) {
        println(box.item)
    }
}

fun main() {
    val dogBox = Box(Dog())
    val catBox = Box(Cat())

    val boxes: List<Box<*>> = listOf(dogBox, catBox)

    printItems(boxes)
}*/



open class Animal {
    fun feed() = println("The animal is fed")
}

class Dog : Animal() {
    fun pet() = println("The dog is petted")
}

class Cat : Animal() {
    fun ignore() = println("The cat ignores you")
}

class Box<in T, out R>(private var t: T, private val r: R) {
    fun put(t: T) {
        this.t = t
    }

    fun take(): R {
        return r
    }
}

fun main() {
    val dogBox: Box<Animal, Dog> = Box(Dog(), Dog())
    dogBox.put(Cat())  // OK: Cat is a subtype of Animal
    val dog: Dog = dogBox.take()  // OK: take() returns Dog

    val catBox: Box<Dog, Animal> = Box(Dog(), Cat())
    // Error: Can't put Cat in Box<Dog, Animal>
    // catBox.put(Cat())
    val animal: Animal = catBox.take()  // OK: take() returns Animal
}