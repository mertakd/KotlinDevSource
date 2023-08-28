package JetBrainsAcademy.Classes.Constructor.SecondaryConstructor

// quiz 1

class IceCreamOrder{
    val price:Int

    constructor(popsicles:Int){
        price = popsicles * 7
    }


    constructor(scoops:Int, toppings:Int){
        price = scoops * 5  +  toppings * 2
    }
}


fun main2() {

    val order1 = IceCreamOrder(3)
    val order2 = IceCreamOrder(2,4)

    println("Order 1 price: ${order1.price}")
    println("Order 1 price: ${order2.price}")
}





//quiz2

class News {
    var title: String = "-"
    var text: String = "-"
    var tag: String = "-"

    constructor(title: String, text: String) {
        this.title = title
        this.text = text
        this.tag = "no tags"
    }
}

fun main3() {

    val news = News("title","text")

}




//quiz3
class Kitty {
    var color: String = ""
    var age: Int = 0

    constructor(color: String, age: Int) {
        this.color = color
        this.age = age
    }

    constructor(age: Int, color: String) {
        this.color = color
        this.age = age
    }

    constructor(color: String) {
        this.color = color
    }

    constructor(age: Int) {
        this.age = age
    }
}



//quiz4
class Fabric(var color: String) {
    var pattern: String = "none"
    var patternColor: String = "none"

    constructor(color: String, pattern: String, patternColor: String) : this(color) {
        this.pattern = pattern
        this.patternColor = patternColor
        println("$patternColor $pattern pattern is printed on the fabric")
    }

    init {
        println("$color fabric is created")
    }


}
fun main() {
    val fabric = Fabric("white", "nokta", "siyah")
}




//quiz5
class EspressoMachine {
    var costPerServing: Float = 0.0f

    constructor(coffeeCapsulesCount: Int, totalCost: Float) {
        costPerServing = totalCost / coffeeCapsulesCount
    }

    constructor(coffeeBeansWeight: Float, totalCost: Float) {
        costPerServing = totalCost / (coffeeBeansWeight / 10)
    }
}

fun main23() {
    val makine1 = EspressoMachine(coffeeCapsulesCount = 20, totalCost = 30.0f)
    val makine2 = EspressoMachine(coffeeBeansWeight = 250.0f, totalCost = 50.0f)
}