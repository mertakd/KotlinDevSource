package JetBrainsAcademy.OOP

//primary constructor
//Constructors are class members that initialize a new object of the class.
//In other words, constructors set a new object state by defining its properties
//Birincil kurucu()primary constructor, bir sınıfı kısaca tanımlamanın kullanışlı bir yoludur.
//If you want to avoid redundant lines of code, try to make use of primary constructors and default arguments.

class Size(width: Int, height: Int) {
    val width: Int = width
    val height: Int = height
    val area: Int = width * height
}


class Size2 constructor(width: Int, height: Int) {
    val width: Int = width
    val height: Int = height
    val area: Int = width * height
}





//Property Declarations
//read only property bildirmek için val. mutable property için var.
class Size3(val width:Int, height: Int){

    val height:Int = height
    val area:Int = width * height

}



//Now let's put the remaining property height inside the primary constructor:

class Size4(val width: Int, val height: Int) {
    val area: Int = width * height
}




//Default and named arguments
class Size5(var width: Int = 1, var height: Int = 1) {
    val area: Int = width * height
}

fun main() {
    val size1 = Size5(3, 5) // width == 3, height == 5
    val size2 = Size5(width = 3, height = 5) // width == 3, height == 5
    val size3 = Size5(height = 5, width = 3) // width == 3, height == 5


    val sizeWide = Size5(10) // width == 10, height == 1
    val sizeHigh = Size5(height = 10) // width == 1, height == 10
}





//Single line classes
class Size6(val width: Int, val height: Int)




//Init
class Size7(_width:Int, _height:Int){
    var width:Int = 0
    var height:Int = 0

    init {
        width = if (_width >= 0) _width else{
            println("Error, the width should be a non-negative value")
            0
        }
        height = if (_height >=0) _height else{
            println("Error, the height should be a non-negative value")
            0
        }
    }

}





