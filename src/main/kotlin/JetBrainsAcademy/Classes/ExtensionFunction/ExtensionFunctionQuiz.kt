package JetBrainsAcademy.Classes.ExtensionFunction


// Quiz 1
class Cat(var sleeping:Boolean){
    fun wakeUp(){
        sleeping = false
    }

}


fun Cat.wakeUp(){
    this.sleeping = true
}

fun main11() {
    val cat = Cat(false)
    cat.wakeUp()
    println(cat.sleeping) //false
}






//Quiz 2   Last Digit
fun Int.lastDigit(): Int{
    return this % 10
}

fun Int.lastDigit2() = this.toString().last().digitToInt()

fun main22() {

    val number = 12345
    val lastDigit = number.lastDigit()
    println("Son basamak: $lastDigit")
}




// Quiz 3
fun next(prev: Int): Int = prev * 1000 - 10

fun Int.nextValue(): Int {
    return next(this)
}


fun main33() {
    val initialValue = 5 // Başlangıç değeri olarak 5'i seçiyoruz
    val nextValue = initialValue.nextValue() // nextValue işlevi kullanarak bir sonraki değeri hesaplıyoruz
    println("Başlangıç değeri: $initialValue")
    println("Bir sonraki değer: $nextValue")
}





// Quiz 4
fun Int.negative() = -this
fun Int.addFive() = this + 5
fun Int.double() = this * 2

fun main4() {
    1.negative().addFive().double()
}







// Quiz 5
class Product(val name: String)

class Fridge {
    fun open() = println(1)
    fun find(productName: String): Product {
        println(productName)
        return Product(productName)
    }
    fun close() = println(3)
}

fun Fridge.take(productName: String): Product {
    open() // Open the fridge
    val product = find(productName) // Find the product
    close() // Close the fridge
    return product
}


fun main() {
    val fridge = Fridge()
    val productName = "Milk"
    val takenProduct = fridge.take(productName)
    println("You have taken ${takenProduct.name} from the fridge")
}



