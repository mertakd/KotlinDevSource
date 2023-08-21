package JetBrainsAcademy.Classes.Inheritance


//ouiz 1
open class Wood(val age:Int){

    fun getWoodInfo():String{
        return "age $age"
    }
}


class Pine(val isSpiny:Boolean, age:Int): Wood(age){

    fun getPineInfo():String{
        return getWoodInfo() + ", spiny $isSpiny"
    }
}

fun main1() {
    val pine = Pine(true,3)
    println(pine.getPineInfo() + "," + pine.getWoodInfo())
}


//quiz 2

open class Car(val model:String, val speed:Int)


class Bus(val typeOfBus:String, model:String, speed:Int) : Car(model, speed){

    fun printInfo() = println("Type of bus: $typeOfBus, model: $model, speed:$speed")
}


fun main3(){
    val bus = Bus("Personel", "N4", 130)
    bus.printInfo()
}




//quiz 3
open class Dog(val name:String, val color:String, val weight:Int){

    fun printInfo(){
        println("The dog's name is $name, his color is $color and his weight is $weight")
    }
}

class Labrador(name:String,color: String,weight: Int) : Dog(name,color,weight)

fun main() {
    val labrador = Dog("angry","black",25)
    labrador.printInfo()
}