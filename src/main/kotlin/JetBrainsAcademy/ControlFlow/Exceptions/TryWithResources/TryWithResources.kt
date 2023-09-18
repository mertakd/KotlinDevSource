package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.TryWithResources

import java.io.*
import java.util.*
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

fun main99() {

    val reader: Reader = FileReader("file.txt")
// code which may throw an exception
    reader.close()
}


fun main98() {

    var reader: Reader? = null
    try {
        reader = FileReader("file.txt")
        // code which may throw an exception
    } finally {
        reader!!.close()
    }
}


fun main97() {
    //readFile()
}
@Throws(IOException::class)
fun readFile97() {

    var reader: Reader? = null

    try {
        reader = FileReader("file.txt")
        throw RuntimeException("Exception1")
    } finally {
        reader?.close() // throws new RuntimeException("Exception2")
    }
}




@Throws(IOException::class)
fun readFile() {
    var reader: Reader? = null
    try {
        reader = FileReader("file.txt")
        throw RuntimeException("Exception1")
    } finally {
        try {
            reader!!.close() // throws new RuntimeException("Exception2")
        } catch (e: Exception) {
            // handle Exception2
        }
    }
}

fun main95() {
    readFile()
}


fun main() {
    val resource = CustomCloseable()
    resource.use {
        println("I am an example of some code!")
        it.exampleMethod()
    }
    println("End of program!")
}

class CustomCloseable : Closeable {
    override fun close() {
        println("Close resource")
    }

    fun exampleMethod() {
        println("Example of some method for the CustomCloseable class")
    }
}