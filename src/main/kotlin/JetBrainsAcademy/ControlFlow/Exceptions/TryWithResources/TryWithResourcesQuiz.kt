package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.TryWithResources

import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.FileWriter
import java.util.*

//Quiz 1
/*
* AutoCloseable or Closeable
We need to write a program that will read data from a file. Each line of the file consists of the employee's name and their salary. These salaries will be used to calculate the bonus based on the results of operating indicators for the year.
Which interface needs to be implemented in our class for correct work with the file?*/
//AutoCloseable




// Quiz 2
fun main2() {
    FileWriter("file.txt").use {
        it.write("Kotlin\nJava\nGo\nC++\nC#")
    }
    val file = FileReader("file.txt")
    file.use {
        val iterator = it.readLines().iterator()
        while (iterator.hasNext()) {
            println(iterator.next())
        }
    }
    try {
        println(file.ready())
    } catch (e: Exception) {
        println(e.message)
    }


    //Stream closed
}





// Quiz 3
fun main3() {
    FileWriter("file.txt").use {
        it.write("Kotlin\nJava\nGo\nC++\nC#")
    }
    val file = FileReader("file.txt")
    file.use {
        // any operations
    }
    println(file.read())


    //Exception in thread "main" java.io.IOException: Stream closed
}




//quiz4
//What is the goal of the use method?
//To guarantee system resource releasing


//Which resources can be released with the use method?
//any outer sources


//Which method is used for releasing resources in the standard library?
//close

//How many use methods can be nested inside the use method?
//one and more


fun main5() {

    try {
        Scanner(File("file.txt")).use { scanner ->
            val number = scanner.nextInt()
            println(number * 100)
        }
    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    } finally {
        println("Finally part")
    }


    //NoSuchElementException
}