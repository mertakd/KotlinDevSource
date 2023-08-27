package JetBrainsAcademy.Classes.Delegate.BasicDelegate


//Quiz 1
interface foo{
    fun printMessage()
}


class bar(val x:String) : foo{
    override fun printMessage() {
        print(x)
    }
}



class baz(base: foo) : foo by base{

    override fun printMessage() {
        print("hello kotlin")
    }
}


fun main1() {

    val b = bar("işe yaramaz kod")
    val baz = baz(b).printMessage()
}





//quiz 2
// Do not change the code below!

interface IConsolePrinter {
    val message: String
    fun printMessage()
}

class BasicConsolePrinter(val x: String, val y: String) : IConsolePrinter {
    override val message: String
        get() = "$x $y"

    override fun printMessage() {
        print("Hello Kotlin")
    }
}

class DerivedConsolePrinter(base: IConsolePrinter) : IConsolePrinter by base {
    override fun printMessage() {
        print(message)
    }
}

fun main2() {
    val h = "Hello"
    val d = "Delegate"
    val k = "Kotlin"

    // Do not change the code above!

    val delegate = BasicConsolePrinter(h, d)

    // Do not change the code below!

    val printer = DerivedConsolePrinter(delegate)
    printer.printMessage()
}



//quiz 3
interface IIndex {
    fun print()
    val index: Int
}

interface IValue {
    fun print()
    val value: Int
}

class IndexData(override val index: Int) : IIndex {
    override fun print() = print(index)
}

class ValueData(override val value: Int) : IValue {
    override fun print() = print(value)
}

fun getDateTime() = "03-05-2021-14:33"

class LogDataCollector(index: IIndex, value: IValue) : IIndex by index, IValue by value {
    override fun print() = print("[${getDateTime()}]: $index, $value")
}

fun main() {

    LogDataCollector(IndexData(5), ValueData(10)).print()
}

