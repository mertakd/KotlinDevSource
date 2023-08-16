package Kekod.Classes




/**
 *
 *                  ABSTRACT CLASSES
 *
 * Abstract class lar bir şözleşmedir.
   Sözleşmede bir buzdolabının olacağını söylüyor, ama buz dolabını vermiyor.
   Bu yüzden değişkenlere ilk atamasını ve fonksiyonlara body sini vermiyoruz abstract oldukları için.
 *
 * Abstract class sözleşme, metin. Dolasıyla child class larda yapılması zorunlu olmasını istediğim şeyleri, abstract class lar da topluyoruz.
   Bu sayede child class larda daha az kod yazarak, daha fazla iş yapabilmemi sağlıyor. boilerplate codlardan bizi kurtarıyor.

 * abstract val fridge: Fridge  ->  Bizden bir değer istemiyor. Yani memory de fiziksel olarak ne tutulacağını söylememizi istemedi. Kendimiz istesek bile değer ataması yapamıyoruz.
   abstract soyut bir kavram olduğu için burada bir buz dolabı olacak diyor, aama buz dolabı şuan ortada yok, bunu sen alacaksın diyor.

 * abstract fun clean(clock: Int) ->
 *
 * abs tract class da normal bir değişken yada fonksiyon kullanmamalıyız. hatta open fonksiyon bile kullanamamalıyız.
 */


//----------------------------------------------------------------------------------------------------------------------

/*

-final ve open modifer'ları kullanmak bazi durumlarda anlamsız ve yanlistir
-abstract olarak yazilmis class'a yeni eklenen tum abstract yapilar, tum child class'larda override edilmek zorundadır
-eger abstract class'imiza eklemek istediğiniz opsiyonel ypaılar varsa, bunlari child class'larin tamamina override etmek zorunda olmayalim diye
open keywordu ile tanımlayacağız
-abstract bir class abstact bir class i miras alirsa, abstract yapilari override etmek zorunda degildir
-abstract fun. body'si olmaz. property'lerin de default degeri olmaz

-abstract class'lar ayni zamanda instance'i olusturulmayan class'lardır. Bu sebeple singleton gibi pattern'ler icin de kullanilabiliyorlar.


-abstract class nedir? abstract classlar sablon classlardir


-abstract degiskene deger atamasina izin verilmez cunku bir sablondur;

-bir buzdolabi olacak --> bu bir sablondur
-bu buzdolabi su/dondurma buzdolabi olacak --> gibi bir atama yapilmaz

bize neyin olmasi gerektigini soyleyecek.


-abstract class "open" olmadigi halde miras alinabilir !!
-Ayni sekilde abstract olan bir fonksiyon override edilebilir (private'in tersine, open'a benzer)

-absract class bir sablon oldugu icin, final yapilamaz. Mantiken hatali, neden bu sozlesmeyi, sablonu olusturuyoruz o zaman?

-bir abstract class, baska bir abs. class override ederse ya da miras alirsa ederse; diger fonksiyonları override edebilir ya da etmeyebiliriz, visilbiity modifier a kalmis
fonksiyon da degisken de override edilebiliyor istenirse. Ayrıca istediği fonksiyonu yada değişkeni ovveride edebilir. Hepsini ovverride etmesine gerek yok, abstract-abstract ı miras alıyorsa.
abstract ve open keyword'leri bu nedenle benziyor

- üst sınıf ve child sınıf abstract ise, child sınıfta üst sınıfın değişkenini override etmeden de çağırabiliyoruz.


-absract class normal bir class tarafindan miras alinamaz degil, alinir ancak;
icindeki tum yapilari (fonksiyon ve degiskenleri) override etmesi gerekir, bir nevi yenisini olusturmus oluruz


- Eger child class da abstract class ise override etmek zorunda degiliz.


abstract class icinde bir sey yazmak istedik ama 10 tane olusturacagimiz child classta lazim degil 11. de lazim olacak. O zaman en ustteki abstract class'a open olarak yazma.
yeni abstract class ac, usttekini miras aldir, buraya ilgili fonksiyonu/degiskeni yaz, alttakine de bunu miras aldir

ve
aradaki abstrac class'ta zorunlu olan abstract fonksiyonunu override ettiyse
bu ara sinifi miras alan sinifta onu override etmek zorunda kalmayacak. Open gibi davranacak.
istersek tekrar override edilmemesi icin final yapabiliriz



open class ile abstract class farki nedir?
open class in nesnesi olusturulur abstract class'in olusturulmaz.

 */


//----------------------------------------------------------------------------------------------------------------------



abstract class MCDonalds {
    abstract val fridge: Fridge                         // inital degeri yok    -->    = "asdasd" veya Fridge() veya 1234 gibi
    abstract val superVisor: SuperVisor
    abstract val employeeOne: Employee
    abstract val employeeTwo: Employee
    abstract val employeeThree: Employee
    abstract val menuList: List<McHamburger>


    abstract fun clean(clock: Int)                  // body'si yok, cunku bu bir sablon yani abstract

    //opsiyonel
    open val policeOfficer: Police = TODO()

}

abstract class McDonaldsExpress : MCDonalds() {
    abstract fun sellCoffee(): McCoffee


    override fun clean(clock: Int) {
        println("Clean time $clock")
    }

    override var fridge: Fridge = TODO()
        get() = TODO("Not impleted yet")

}


class McDonaldsMaltepe : MCDonalds() {

    override val fridge: Fridge
        get() = TODO("Not implemented yet")
    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")
    override val employeeOne: Employee
        get() = TODO("Not yet implemented")
    override val employeeTwo: Employee
        get() = TODO("Not yet implemented")
    override val employeeThree: Employee
        get() = TODO("Not yet implemented")
    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        TODO("Not yet implemented")
    }


}


//----------------------------------------------------------------------------------------------------------------------


fun main() {

    val mcdonalds = McDonaldsMaltepe()

}


//----------------------------------------------------------------------------------------------------------------------


class Fridge
class SuperVisor
class Employee
class McCoffee
class Police
class McHamburger


//----------------------------------------------------------------------------------------------------------------------