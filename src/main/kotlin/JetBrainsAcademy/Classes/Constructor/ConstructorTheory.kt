package JetBrainsAcademy.Classes.Constructor

/**
 * CONSTRUCTOR
 * Yapıcılar, sınıfın yeni bir nesnesini başlatan sınıf üyeleridir.
 * Başka bir deyişle, yapıcılar, PROPERTY leri  tanımlayarak yeni bir nesne durumu(object state) ayarlar.
 * Yani, bir nesne oluşturduğunuzda, bir yapıcıyı çağırırsınız.*/


class Size7 {
    var width: Int = 1
    var height: Int = 1
}

val size7 = Size7()
//Size ın arka planda yazılmasa da constructor u oluşturuluyor.



//PRİMARY CONSTRUCTOR
//constructor yaz yazma fark etmez
class Size2 constructor(width: Int, height: Int) {
    val width: Int = width
    val height: Int = height
    val area: Int = width * height
}



//DECLARATİON
class Size3(val width: Int, height: Int) {
    val height: Int = height
    val area: Int = width * height
}

class Size4(val width: Int, val height: Int) {
    val area: Int = width * height
}




//Default and named arguments
class Size5(var width: Int = 1, var height: Int = 1) {
    val area: Int = width * height
}

fun main5() {

    //val size5 = Size() // width == 1, height == 1

    //val size1 = Size(3, 5) // width == 3, height == 5
    //val size2 = Size(width = 3, height = 5) // width == 3, height == 5
    //val size3 = Size(height = 5, width = 3) // width == 3, height == 5
}


//Single line classes
class Size6(val width: Int, val height: Int)



//INIT
//Bazen, bazı özelliklerimizi diğer özelliklerin değerlerine veya diğer bilgi kaynaklarına göre ayarlamak isteriz. Bu gibi durumlarda, ön eki init olan başlatıcı blokları kullanırdık.
class Size(_width: Int, _height: Int) {
    var width: Int = 0
    var height: Int = 0

    init {
        width = if (_width >= 0) _width else {
            println("Error, the width should be a non-negative value")
            0
        }
        height = if (_height >= 0) _height else {
            println("Error, the height should be a non-negative value")
            0
        }
    }
}

fun main6() {
    val sizeInıt = Size(10,5)
    println(sizeInıt.height)
}


class Size8(val width: Int, val height: Int) {
    init {
        println("Initializer block that prints the width ($width) and the height ($height)")
    }
}


class Size9(_width: Int, _height: Int) {
    // 1: the width property is initialized
    val width = _width

    // 2: 1st init block is executed
    init {
        println("First initializer block that prints the width $width")
    }

    // 3: the height property is initialized
    val height = _height

    // 4: 2nd init block is executed
    init {
        println("Second initializer block that prints the height $height")
    }

    // 5: the area property is initialized
    val area = width * height
}

fun main() {
    val size6 = Size9(10,5)
    println(size6.width)
    println(size6.height)
    println(size6.area)
}