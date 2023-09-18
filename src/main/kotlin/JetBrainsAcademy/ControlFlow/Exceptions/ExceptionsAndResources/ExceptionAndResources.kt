package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.ExceptionsAndResources

import java.io.FileReader
import java.io.FileWriter

fun main99() {

    val writer = FileWriter("somefile.txt")
    writer.write("hello!")

    writer.close()
}


fun main98() {

    val reader = FileReader("test.txt")
    reader.use {
        reader.read()
    }


    FileReader("test.txt").use { reader -> reader.read() }

    FileWriter("test.txt").use { it.write("something") }
}


class SomeResource : AutoCloseable {
    override fun close() {
        // close resource
    }
}