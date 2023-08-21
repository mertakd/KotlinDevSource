package JetBrainsAcademy.Classes.Constructor.SecondaryConstructor



// 1.Custom constructor
//örnekde secondery constructor kullanılarak bildiriliyor.
//hem primary hem secondery constructor ı beraber bildiremezsiniz.

class Size{
    var width:Int = 0
    var height:Int = 0


    constructor(_width:Int, _height:Int){
        width = _width
        height = _height
    }
}

fun main1() {
    val size1 = Size(3,4)
    val size2 = Size(22,45)
}


// 2.Birden ç.ok constructor oluşturulur ama her birinin kendi imzası olamalıdır.
//İmzaların, adlarına göre değil, parametre türlerine göre tanımlandığını unutmayın.
class Size2 {
    var width: Int = 0
    var height: Int = 0

    constructor(_height: Int) {
        height = _height
    }

    constructor(_width: Int, _height: Int) {
        width = _width
        height = _height
    }

    constructor(_width: Int, _height: Double) {
        width = _width
        height = _height.toInt()
    }

    constructor(_height: Double, _width: Int) {
        width = _width
        height = _height.toInt()
    }
}


// 3.THIS KEYWORD
//this constructor dışındaki değişkenleri görür.

class Size3{
    var width: Int = 0
    var height: Int = 0

    constructor(width:Int, height:Int){
        this.width = width
        this.height = height
    }
}


// 4.Varsayılan Değerleri Atamak
//secondery cons da val var kullanamazsın
//Yeniden atama gibi görünüyor, ancak değerleri yalnızca başlatıyorsunuz, yani yanlış bir şey yok.

class Size4 {
    val width: Int
    val height: Int
    val area: Int

    constructor(width: Int, height: Int) {
        this.width = width
        this.height = height
        this.area = width * height
    }
}




// 5.Constructor Delegation
//Bir sınıfın birincil kurucusu varsa, her ikincil kurucunun doğrudan veya dolaylı olarak başka bir ikincil kurucu(lar) aracılığıyla birincil kurucuyu çağırması gerekir. Buna delegasyon denir
// this anahtar sözcüğü ile yapılır.
// propertyler ve init ler, secondery constructor en önce initialize edilir.
// primary constructor, initializer blocks, and property initialization gerçekleşir sonra secondery constructor çalışır.
class Size5(val width:Int, val height:Int){
    var area:Int = width * height

    constructor(width: Int, height: Int, outerSize:Size5) : this(width, height){
        outerSize.area -= this.area
        println("Updated outer object's area is equal to ${outerSize.area}")
    }
}



class Size6(val width: Int, val height: Int) {
    var area: Int = width * height

    init {
        println("Object with area equal to $area is created")
    }

    constructor(width: Int, height: Int, outerSize2: Size6) : this(width, height) {
        outerSize2.area -= this.area
        println("Updated outer object's area is equal to ${outerSize2.area}")
    }
}

fun main() {
    val outerObject = Size6(5, 8)
    val innerObject = Size6(2, 3, outerObject)
}