package JetBrainsAcademy.Classes.BasicClasses


//soru1
class Point3D{
    var x:Int = 0
    var y:Int = 0
    var z:Int = 0
}


fun createPoint(x:Int, y:Int, z:Int):Point3D{
    return Point3D().apply {
        this.x = x
        this.y = y
        this.z = z
    }
}


fun main1() {
    val point = createPoint(1,2,3)
    println("Point coordinates: (${point.x}, ${point.y}, ${point.z})")
}




//quiz2
data class OperatingSystem(var name:String = "")

class DualBot{
    var primaryOs: OperatingSystem = OperatingSystem("Vim")
    var seconderyOs: OperatingSystem = OperatingSystem("Boss")
}

fun main2() {
    val os = DualBot().primaryOs
}



//quiz3
class Rectangle{
    var width:Int = 0
    var height:Int = 0
}

fun printArea(rectangle: Rectangle){
    println(rectangle.width * rectangle.height)
}

fun main3() {
    val myRectangle = Rectangle()
    myRectangle.width = 5
    myRectangle.height = 10

    printArea(myRectangle)
}



//quiz4
