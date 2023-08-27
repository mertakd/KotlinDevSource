package JetBrainsAcademy.Classes.Delegate.ClassDelegate

interface Drawable {
    fun draw()
}

class Circle : Drawable {
    override fun draw() {
        println("Drawing a circle")
    }
}

class DrawingBoard(private val drawable: Drawable) : Drawable by drawable

fun main2() {
    val circle = Circle()
    val drawingBoard = DrawingBoard(circle)
    drawingBoard.draw() // "Drawing a circle"
}








interface Greeting{
    fun greet()
}


class EnglishGreeting : Greeting{
    override fun greet() {
        println("hello")
    }
}

class FrenchGreeting : Greeting{

    override fun greet() {
        println("bonjour")
    }
}


class Greeter(private val greeting: Greeting) : Greeting by greeting


fun main() {

    val englishGreeting = EnglishGreeting()
    val frenchGreeting = FrenchGreeting()

    val greeter1 = Greeter(englishGreeting)
    val greeter2 = Greeter(frenchGreeting)

    greeter1.greet() //hello
    greeter2.greet() //bonjour
}
//Yukarıdaki örnekte Greeter sınıfı, kaynak kodunu değiştirmeden nesnenin davranışını değiştirmek için Selamlama arayüzünün uygulanmasını farklı delegelere devreder.

