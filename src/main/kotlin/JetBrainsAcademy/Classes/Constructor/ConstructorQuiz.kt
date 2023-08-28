package JetBrainsAcademy.Classes.Constructor


// quiz 1
class Point2D{
    val x: Double
    val y: Double

    constructor(x:Double, y:Double){
        this.x = x
        this.y = y
    }
}

fun main1() {
    val point = Point2D(3.0, 4.0)
    println("${point.x}, ${point.y}" )
}


// quiz 2



class ByteTimer(var time:Int){

    init {
        when{
            time < -128 -> time = -128
            time > 127 -> time = 127
        }
    }
}


fun main() {

    val timerValue = readln().toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)

    val cat = Pet("sarı", owner = "mert")
    println("${cat.animal} ${cat.name.toString()} ${cat.owner.toString()}")
}


class Pet(val name: String, val animal: String = "cat", val owner: String){
    override fun toString(): String {
        return "${name}, ${animal}, ${owner}"
    }
}
