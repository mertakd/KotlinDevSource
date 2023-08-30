abstract class Employee(var name: String, var surname: String){

    abstract val age: Int

    abstract fun doWork()

    fun fullName(): String{
        return "$name $surname"
    }
}

// DO NOT change the code below
class Worker(name: String, surname: String) : Employee(name, surname) {

    override val age = 40

    override fun doWork() {
        println("I am working!")
    }
}

fun main() {
    val name = readln()
    val surname = readln()

    val worker = Worker(name, surname)

    println("My name is: ${worker.fullName()}")
    worker.doWork()
}