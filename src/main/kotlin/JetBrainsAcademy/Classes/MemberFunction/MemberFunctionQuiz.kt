package JetBrainsAcademy.Classes.MemberFunction

class Counter(var value: Int) {

    fun increment() {
        ++value
    }
}


fun main1() {
    val counter = Counter(1)
    val counter2 = Counter(1).increment()

}



// quiz 2
class Person(val name: String) {




    fun say() = println("Hi")
    fun self() = this
    fun signature() = name


    override fun toString(): String {
        return "person $name"
    }
}

fun main2() {
    val person = Person("mert")
    println( person.self())
}


//quiz 3
class Box(var height: Double, var width: Double, var length: Double) {

    fun getVolume() = height * width * length
}

fun main3() {
    val box1 = Box(25.0,32.0,76.0)
    println(box1.getVolume())
}


//quiz 4
class Application(val name: String) {
    fun run(one: String = " ", two: String = "", three: String) = println("$name\n$one\n$two\n$three")
}

fun main4() {

    val app1 = Application("Busuu")
    println(app1.run("stage1","stage2","stage3"))
}



//quiz 5
class Car(val make: String, val year:Int){

    var speed:Int = 0

    fun accelerate() {speed += 5}
    fun decelerate() {speed -= if (speed > 5) 5 else speed}
}

fun main6() {

    val car1 = Car("TOYOTA", 1994)
    car1.speed = 95
    car1.decelerate()
    println("The name ${car1.make}, making ${car1.speed}, ")
}



//quiz 6

class ArithmeticOperations(val x: Int, val y: Int) {
    fun addition() = x + y
    fun subtraction() = x - y
    fun multiplication() = x * y
    fun division() = x / y
}

fun main7() {

    val arit = ArithmeticOperations(5,9)
    println(arit.addition())
}