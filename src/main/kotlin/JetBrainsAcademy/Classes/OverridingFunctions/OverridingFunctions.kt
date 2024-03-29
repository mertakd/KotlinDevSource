package JetBrainsAcademy.Classes.OverridingFunctions

import kotlin.math.roundToInt

open class Transport(val cost:Int){

    open fun getFullInfo():String{
        return "$$cost cost"
    }

    fun getTax():String{
        return "$${(cost * 0.25).roundToInt()}"
    }
}

fun getTransportInfo(transport: Transport):String{
    return "transport info: " + transport.getFullInfo()
}

open class Ship(cost: Int, val color:String) : Transport(cost){

    override fun getFullInfo(): String {
        return super.getFullInfo() + ", $color color"
    }
}


fun main() {

    val transport = Transport(1000)
    val ship = Ship(2000,"marine")
    //println(transport.getFullInfo())
    //println(ship.getFullInfo())

    println("reuse it")
    println(getTransportInfo(transport))
    println(getTransportInfo(ship))
}