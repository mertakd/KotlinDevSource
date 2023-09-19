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
