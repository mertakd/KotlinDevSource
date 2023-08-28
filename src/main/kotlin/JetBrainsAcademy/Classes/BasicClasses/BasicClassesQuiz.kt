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

fun createPoint2(x:Int,y:Int,z:Int) = Point3D().also { it.x = x; it.y = y; it.z = z}


fun main() {
    val point = createPoint(1,2,3)
    println("Point coordinates: (${point.x}, ${point.y}, ${point.z})")

    val point2 = createPoint2(5,10,25)
    println("${point2.x}, ${point2.y}, ${point2.z}")
}




//quiz2
data class OperatingSystem(var name:String = "")

class DualBot{
    var primaryOs = OperatingSystem("Windows")
    var seconderyOs = OperatingSystem("Mac Os")
}

fun main2() {
    val os = DualBot()
    println("${os.primaryOs}, ${os.seconderyOs}")
}



//quiz3
class Rectangle{
    var width:Int = 0
    var height:Int = 0
}

fun printArea(rectangle: Rectangle){
    println(rectangle.height * rectangle.width)
}

fun main3() {
    val myRectangle = Rectangle()
    myRectangle.width = 5
    myRectangle.height = 10

    printArea(myRectangle)
}



//quiz4
class Student(val name : String, var age : Int){

    fun introduceSelf() = "Hello, I am $name and I am $age years old"
}

fun main6() {
    val student1 = Student("mert",22)
    println(student1.introduceSelf())
}



//quiz 5
