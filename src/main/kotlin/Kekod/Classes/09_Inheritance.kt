package Kekod.Classes

/**
 *1.25.00
 *                  Inheritance
 *
 * Miras aldığım sınıfın tüm özelliklerine sahibim. Neden bu şekilde sahip olmak istiyoruz.
 * Üst class lar sahip oldukları her şeyi alt class lara iletirler.
 * Miras almada bazen tüm özelliklerini kullanmak isteriz. Bazen o özelliklerle beraber extra yetkinlikleri olan başka bir versiyonunu istersiniz.Update li versiyonu gibid düşünelim.
 * Bir child class varsa, üst class dan daha fazla beceri setine sahiptir. aile örneği 1:33
 * 1.Miras almamızın birinci nedeni üst sınıfın özelikleriyle beraber kendi özelliklerimiz olsun. Biz üst class dan daha fazla şey yapabililelim.
   2.İkinci amacımız üst class ımız da yaptığımız beceri setini, yeni bir beceri setini eklememek isteyebiliriz.
   Mesela üst class ımızı on tane yerde kullanıryoruzdur, 11. yerde yeni bir yetkinliğe ihtiyacımız vardır.Ama sadece 11.yerde ihtiyacımız var.
   Bu on birimin kullanıldığı yerlerde extra hiç kullanılmayacak bir yetkinlik, bir fonksiyon eklemektense, bir child class oluşturup o eklenecek olan bir tane fazladan fonksiyonu 11. yerde kullanacağımız child class a veririz.
   Bu sayede geride kalan on tane ekran bu fazladan fonksiyonu kullanmak zorunda kalmazlar.
   child class lar daha fazla işlevi olduğu için memory de fazladan yer kaplar sistemi daha fazla yorar. Bu yüzden bu şekilde yönetmek daha uygundur.
   bu sayede üst class ın performansı da etkilenmez. yani memory de fazladan yer kaplamaz.
   özet- 1.39:00
   3.Bazen üst class ın sahip olduğu yetkinlikleri, child class larla değiştirmek isteyeceğiz.
     bir şablonumuz var ama bazı özellikleri child classlaarımda değştirebileyim, anlamı değişşin. Buna overload işlemi dicez.

 * Uygulama da kullanımı
 * Java da extends kullanarak yapıyoruz
 * Java da tüm class lar zaten open.Yani zaten miras alınabilir durumda.
 * Kolin de default olarak final durumda, yani final miras alınamaz demek.
 * Bu yüzden kotlin class ını miras alınabilir duruma getirmek için open keyword ünü kullanmamız gerekiyor. open ve final erişim düzenleyicileri olarak geçer.
 * Kotlinin yaptığı daha iyi open keyword ü grdüğümzde miras olayı gerçekleştiğini görebiliyoruz ama java da hepsi miras alınabilir durumda gözülküyor.
 * Kotlin de miras alma : iki nokta ile belirtiliyor java da ise extends ile.
 * extend edilen sınafa en bir tane parametre vermemiz gerekiyor
 * üst class da private olan bir değer, child class dan erişilemez.protected da erişiyor.
 * üst class da open olarak işaretlenmiş değişken ya da fonksiyon, child class da çağırıldığında override ediliyor.
 * override: eğer child class da bir değişken ya da fonksiyon override olmuşsa, şunu diyoruz. Üst sınıfta bu fonksiyonun bir görevi vardı, child class da override ederek mevcut yaptığı işi değiştirebiliyoruz, yani bu fonksiyonun anlamı artık farklı olacak demiş oluyoruz.buna polimorfism de deniliyor.
 * Polimorfizm(çok biçimlilik) : Üst class da ki bir fonksiyonu ya da değişkeni, ovverride ederek, child class larda, anlamını görevini değiştirerek, yeni bir anlam yeni bir görev tanımlamaya polimorfizm dicez.
 * super: super keyword ü üst class da ki fonksiyonu işaret ediyor.
   override ın iki türlü kullanımı olabilir: üst class ın halihazır da yaptığı şeyi yap, devamında benim istediğim şeyi de yap
   Bu durumda super i kullanırsa üst class ın yaptığı işlemin aynısı yapabilmemiz için super yazıdğımız da üst class ın fonksiyonunu çağırmış oluruz.
   üst class ın yaptığını değil de kendiniz işlev kazandımak istiyorsanız super i kaldırırız.
 * üst sınıf child sınıfa bir fonksiyonu override etmek istemiyorsa, final override fun drawShape() yapabilir.
 * iki class ile inheritance yapılamaz.
 */


//----------------------------------------------------------------------------------------------------------------------

/*

Ozetle bir parent class'in ozelliklerini (fonksiyon ya da degisken) alt siniflara (child class) aktarmaya denir.

*Visibility Modifier(görünüm düzenleyiciler)
 public, private, protected, internal.


*Erisim(access modifier) duzenleyiciler;
open --> miras alinacak sinifin open olmasi gerekiyor. ( Javada tum siniflar zaten open )
final --> Kotlin'de default olarak siniflar final, yani miras alinamaz.

ovverride ve overloading farklı !
overload : Bir fonksiyonun birebir aynısının parametreleri farklı, farklı sayıda parametre, parametre tipleri farklıyken, geri dönüş tipi farklıyken yazma olayına fonksiyon overloading diyorduk.


* Miras aldığımız class ın constructor larından birini belirmemiz gerekiyor. Bu primary ve secondery constructorlardan birini mutlaka belirtmemiz gerekiyor.

*super üst sınıfa
 this bulunduğu sınıfa işaret eder.


 */

//----------------------------------------------------------------------------------------------------------------------

open class Shape(val name: String) {                // open goruyoruz yani parent class

    internal var mColor: String =  " "                // default zaten public, istersek internal yapabiliriz buradaki gibi. Cunku alt siniftan erisim istiyoruz.
    open var mEdgeCount: Int = 0

    constructor(name: String, color: String) : this(name) {
        mColor = color
    }

    constructor(name: String, color: String, edgeCount: Int) : this(name) {
        mColor = color
        mEdgeCount = edgeCount
    }

    open fun drawShape() {
        println("Name: $name")
        println("Color: $mColor")
        println("EdgeCount: $mEdgeCount")
    }


    fun calculateArea(): Int = if (mEdgeCount != 0) {
        mEdgeCount * mEdgeCount
    } else {
        0
    }


}


//----------------------------------------------------------------------------------------------------------------------


class Rectangle(name: String) : Shape(name, "Red") {
    // miras almak icin : kullaniyoruz.
    // Miras aliyorsak miras alinacak min. 1 constructor almamiz gerekiyor.
    // Ya primary constructor ya da secondary constructor almamiz gerekli

    override fun drawShape() {
        // drawShape()
        // this.drawShape()
        super.drawShape()                                   // super.drawShape() --> ust siniftaki drawShape() 'in yaptigini yapmasi icin yazilir.
    }


    fun main() {
        // Asagidaki degisken ve fonksiyonlari miras aldik.
        calculateArea()
        drawShape()
        mColor
        mEdgeCount

        this.drawShape()      // -----> this kullanimi bu classi isaret eder
        super.drawShape()    // ----> super kullanimi bu class'taki degil, ust siniftaki fonksiyonu calistirir
    }

    override var mEdgeCount: Int                    // override edebilmek icin degisken ya da fonksiyonun open olmasi gerekiyor.
        get() = super.mEdgeCount                   // parent class 'takinden farkli bir is yapacak sekilde tekrar duzenlemek icin override ediyoruz.
        set(value) {}
}


//----------------------------------------------------------------------------------------------------------------------


open class Circle(name: String, color: String) : Shape(name) {

    open override fun drawShape() {
        super.drawShape()


        val circle = """
            
        CEMBER CIZDIK VARSAYALIM
        
        """.trimIndent()

        println(circle)
    }


}


//----------------------------------------------------------------------------------------------------------------------

open class Square(name: String, color: String, edgeCount: Int) : Shape(name, color, edgeCount) {

    final override fun drawShape() {
        // Final keyword koyarsak,
        // bunu miras alan bunun child class'inda bu fonksiyonun override edilmesini kapatmis oluruz

        val square = """
            
            *****************
            *               *
            *               *
            *               * 
            *****************
            
            """.trimIndent()
        println(square)
    }

}


//----------------------------------------------------------------------------------------------------------------------


class OneMeterSquare : Square("OneMeterSquare", "Blue", 4) {

    /*

    Asagidakileri override edemiyoruz cunku parent class'ta final olarak tanimladik.
    Bu fonksiyonlar cagrilabilir fakar overload edilemez.

    override fun drawShape(){
        super.drawShape()
        super.super.drawShape()
    }

    */

    fun main() {
        drawShape()             // cagirabildik, fakat override edemedik
    }

}


//----------------------------------------------------------------------------------------------------------------------


//----------------------------------------------------------------------------------------------------------------------

fun main() {

    val shape = Shape("Shape")
    val rectangle = Rectangle("Rectangle")
    val circle = Circle("Circle", "Magenta")
    val square = Square("Square", "Blue", 4)


    shape.drawShape()
    rectangle.drawShape()
    circle.drawShape()
    square.drawShape()

    // ONEMLI
// Child class'larda super.drawShape yazdigimiz icin once ust sinifin printi sonra alt sinifin printi yazilacak

}


//----------------------------------------------------------------------------------------------------------------------


/*

Polimorfizim -> ust sinifa yazilan bir islemin child class ta override edilerek farklı bi islem yaptirilmasina denir
Turkcesi = "Cok Bicimlilik"

 */

//----------------------------------------------------------------------------------------------------------------------


//----------------------------------------------------------------------------------------------------------------------