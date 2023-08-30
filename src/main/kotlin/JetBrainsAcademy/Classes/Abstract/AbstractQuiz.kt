package JetBrainsAcademy.Classes.Abstract

import javax.naming.InitialContext

// Quiz 1
abstract class Employee(var name: String, var surname: String){

    abstract val age: Int

    abstract fun doWork()

    fun fullName(): String{
        return "$name $surname"
    }

}




class Worker(name: String, surname: String) : Employee(name, surname){

    override val age: Int = 40

    override fun doWork() {
        println("I am working!")
    }

}


fun main1() {

    val name = readln()
    val surname = readln()


    val worker = Worker(name, surname)

    println("My name is: ${worker.fullName()}")

}




// Quiz 2

abstract class Instrument(val name: String){
    abstract fun play()
}

interface Portable{
    fun carry()
}


class Guitar(name: String): Instrument(name), Portable{

    override fun play() {
        println("Playing the $name")
    }

    override fun carry() {
        println("Playing the $name")
    }

}
fun main2() {
    val name = readln()
    val guitar = Guitar(name)
    guitar.play()
    guitar.carry()
}



// Quiz 3
abstract class Animal2(){
    abstract fun makeSound(): String
}


class Cat: Animal2(){
    override fun makeSound(): String = "Meow!"
}

class Dog: Animal2(){
    override fun makeSound(): String = "Woof!"
}

fun main3() {
    val cat = Cat()
    val dog = Dog()
    val animals = mutableListOf(cat,dog)
    for (animal in animals){
        println(animal.makeSound())
    }
}


// Quiz 4

abstract class Calculator(val left: Int, val right: Int) {
    abstract fun perform(): Int
}



class Add(left:Int, right:Int) : Calculator(left,right){

    override fun perform():Int = left + right
}

class Multiply(left:Int, right:Int): Calculator(left, right){

    override fun  perform() = left * right
}

// Implement class Multiply

fun main4() {
    val left = readln().toInt()
    val right = readln().toInt()

    println(Add(left, right).perform())
    println(Multiply(left, right).perform())
}






// Quiz 5


abstract class Shape(val side: Double){
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double

    fun printDescription() {
        println("This is a shape.")
    }
}


class Square(side: Double) : Shape(side) {
    override fun calculateArea(): Double {
        return side * 5.0
    }

    override fun calculatePerimeter(): Double {
        return side * 4.0
    }
}


fun main() {
    val square = Square(readln().toDouble())
    println("Area = ${square.calculateArea()}")
    println("Perimeter = ${square.calculatePerimeter()}")
}