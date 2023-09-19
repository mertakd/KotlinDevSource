package JetBrainsAcademy.Classes.Generics.BasicGenerics


// Quiz 1
class Container<T>(t: T){

    var value = t
}

fun main11() {

    //val container = Container("good job!")
    //println(container.value)

    val container:Container<String> = Container<String>("good job!")
    println(container.value)
}








// Quiz 2
class MyClass<T>(t: T){

    val item = t
}

fun main2() {
    //val myClass = MyClas("hyperskill")
    //println(myClass.item)

    val myClass = MyClass(29)
    println(myClass.item)
}









// Quiz 3

class RandomClass<T, S, U>(private val value1: T, private val value2: S, private val value3: U) {

    fun getFirstValue(): T{
        return value1
    }

    fun getSecondValue(): S{
        return value2
    }

    fun getThirdValue(): U{
        return value3
    }

}

fun main3() {

    val randomInstance = RandomClass("Hello", 42, true)

    val firstValue: String = randomInstance.getFirstValue()
    val secondValue: Int = randomInstance.getSecondValue()
    val thirdValue : Boolean = randomInstance.getThirdValue()

    println("First Value: $firstValue")
    println("Second Value: $secondValue")
    println("Third Value: $thirdValue")
}









// Quiz 4
class Box<T>(var furniture: T, val volume: Int){


    fun getFurnitureFromBox(): T {
        return furniture
    }

    fun getBoxVolume(): Int{
        return volume
    }
}

class Fridge
class Armchair


fun main4() {

    val fridgeBox: Box<Fridge> = Box<Fridge>(Fridge(), 200)
    val armchairBox: Box<Armchair> = Box<Armchair>(Armchair(), 200)


    println("Fridge box: Volume ${fridgeBox.getBoxVolume()}, Furniture ${fridgeBox.getFurnitureFromBox()}")
    println("Armchair box: Volume ${armchairBox.getBoxVolume()}, Furniture ${armchairBox.getFurnitureFromBox()}")


    //val fridgeBox = Box(Fridge(), 200)
    //val armchair = Box(Armchair(), 50)

    //println("Fridge Box: Volume ${fridgeBox.getBoxVolume()}, Furniture ${fridgeBox.getFurnitureFromBox()}")
    //println("Fridge Box: Volume ${armchair.getBoxVolume()}, Furniture ${armchair.getFurnitureFromBox()}")
}







// Quiz 5
data class QuizBox<T>(val hiddenItem: T) {

    var isChange = false

    var item: T = hiddenItem
        get() {
            println("You asked for the item")
            return field
        }
        set(value) {
            println("You changed the item")
            field = value
            isChange = true
        }
}

fun main5() {


    val quizBox:QuizBox<String> = QuizBox<String>("secret item")

    //get
    val item = quizBox.item
    println("Item: $item")


    //set
    quizBox.item = "new item"
    println("is changed: ${quizBox.isChange}")



    /*
    val quizBox = QuizBox("Hidden Item")
    println("Initial isChanged: ${quizBox.isChanged}") // false


    val itemValue = quizBox.item // Burada get() metodu çalışır
    println("Accessed item: $itemValue") // "Hidden Item"
    println("isChanged after accessing item: ${quizBox.isChanged}") // false


    quizBox.item = "New Item"
    println("isChanged after changing item: ${quizBox.isChanged}") // true

*/
}






// Quiz 6
class MyStack<T>(data: List<T>) {

    val items = data.toMutableList()

    fun push(data: T) {
        items.add(data) // Add the new item to the end of the list
    }

    fun pop(): T {
        if (items.isEmpty()) {
            throw NoSuchElementException("Stack is empty")
        }
        return items.removeAt(items.size - 1) // Remove and return the last item
    }
}

fun main56() {
    val stack = MyStack(listOf(1, 2, 3))

    stack.push(4)
    println(stack.pop()) // Output: 4
    println(stack.pop()) // Output: 3
    println(stack.pop()) // Output: 2
}







//Quiz 7
data class SweetBox<T>(val sweet: T, val numOfSweets:Int)

class Chocolate

class Marmelade

fun main7() {

    val chocolateBox: SweetBox<Chocolate> = SweetBox(Chocolate(),5)
    val marmaladeBox: SweetBox<Marmelade> = SweetBox(Marmelade(),5)

    println("Chocolate Box: ${chocolateBox.sweet}, Quantity: ${chocolateBox.numOfSweets}")
    println("Chocolate Box: ${marmaladeBox.sweet}, Quantity: ${marmaladeBox.numOfSweets}")
    /*val chocolateBox = SweetBox(Chocolate(),5)
    val marmaladeBox =  SweetBox(Marmalade(),10)

    println("Chocolate Box: ${chocolateBox.seewt}, Quantity: ${chocolateBox.numOfSweets}")
    println("Chocolate Box: ${marmaladeBox.seewt}, Quantity: ${marmaladeBox.numOfSweets}")*/
}



// Quiz 8
//Updating employee salary in a mutable list
//fun MutableList<employee>.update(index: Int, salary: Double): Unit {
//    this[index].salary = salary
//}

//fun <t> MutableList<t>.updateSalary(index: Int, salary: Double): Unit where T : Employee {
// this[index].salary = salary
//}






//Which types can be used as parameter types for a generic class?
//String
//
//Int
//
//your own class
//
//IntArray
//
//some class from Standard Kotlin Library









//T  First type
//S  Second type
//U  Third type
//V  Value or fourth type
//E  Element
//N  Number






