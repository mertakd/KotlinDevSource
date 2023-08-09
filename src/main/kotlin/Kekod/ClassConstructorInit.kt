package Kekod


/*EKSTRA NOTLAR
*
*Open Class
*Kotlin'de open anahtar kelimesi, bir sınıfın diğer sınıflar tarafından miras alınabilir (subclass) ve genişletilebilir (extended) olmasına izin vermek için kullanılır. Yani open sınıf, miras alınabilir ve bu sınıfı genişletebilecek alt sınıflar oluşturulabilir.
* Bununla birlikte, standart bir sınıfın (normal class) alt sınıflar oluşturulmasına izin verilmez. */

/** ders 15
 * Constructor: yaratıcı, oluşturucu.
 * cosntructor ı ister içerde ister parametre de var val olarak tanımla.
 * Java dan farklı olarak init bloğu var. Kotlin de primary ve secondery olara ilkiye ayrılıyor constructorlar. Java da constructor lar fonsksiyon gibi görünen  class ismiyle aynı olması zorunlu olan yapılardı.Java da primary ve secondery constructer diye bir ayrım yoktur.Java da constructor parantezi açamıyoruz.
 * İnit bloğu primary constructor ın çağırımda kullanılıyor.
 * Primary constructer paremetreleri ilk olarak vermeye devam edersek ilk olarak init bloğu çalışacak.
 * secondery constructor u çalıştırırken içinde ki parametrelerden biri primary constructor da varsa ilk baş primary constructor ve init sonra secondery constructor çalışacak.
 * yani primary ve secondr constructor da da init bloğuna giriyoruz.
 * Peki neden böyle bir durum oluyor.Java da ki tüm constructorlar birbirinden bağımsızdır. Ama kotlin de secondery constructor lar mecburi bir şekilde primary constructor u this ile işaret etmek zorundalar.
 * constructor yazısını eğer annotation veya visibility modifier beliteceksek yazmamız lazım
 *
 *secondery constructor ları ne zaman overloading ediyordık?İçerisinde ki parametreler değişince. Bu şekilde  bazı parametreler zorunlu bazı parametreler opsinolken, secondery constructor lara ihtiyacak duyacağız
 *Zorunlu parametreler dışında opsiyonal parametreler varken business logic imiz değişmiyorsa, default parametre kullanmamızda bir sakınca yok.
 *Eğer içerde if case lerle ayırmıyorsak kodumuzu, budurmda bir tane constructor kullanıp default değerleri istediğimiz kadar kullanabiliriz.Ama if case lerle kullancaksak bu çirkin bir kod yapısı o yüzde constructorları override etmeliyiz. */



/**
 * VISIBILITY MODIFIER
 * Kotlin de 4 tane, Java da 3 tane
 *Private, Public, Protected, Internal
 *Internal kotlin e özel. java da internal yok. Protected ise kotlin ve java da farklı kullanılıyor.
 *Java default private dır. Kotlin de default public
 * her zaman değerlere erişmek istemeyebilir yada erişimi kısıtlamak isteyebiliriz. Bu konu da encapsulation ile ilgilidir.
 * Encapsulation bir clasın üye değişkenlerini private da tutup, bu değişkene erişebilecek fonksiyonları public de tutmamıza encapsulation diyoruz.
 * Fonksiyonlarında gerekmeyenlerini, dışarı açmak istemediklerimizi private da tutup, dışa açmak istediklerimizi publicde tutmamıza encapsulation denir.
 *
 * Private: saddece  bağlı bulunduğu class içerisinde kullanılabilir. dışarıda classlar yada child class lardan da erişilemez.
 * PRİVATE DEĞİŞKENE DIŞARIDAN ERİŞMEK İSTİYORSAK, PUPLİC BİR FONKSYON YAZIP ERİŞEBİLİRİZ.
 * Public: heryerden erişilebilir.
 * Protected: miras alan kişiler, yani miras alan child classlar da(dede-baba-oğul  -> oğul miras sahibi child)  sadece kullanabilsin, ama clasın dışına çıkıldığında miras alan kişilerin dışında kullanılamasın diyorsak protected kullanılacak.
 * Protected kendisinde(yani bulunduğu class da) ve child class larda public gibi davranır, ama class ın ve child classların dışında private gibi davranır.
 * Internal: kendi içinde,child classlarda, benzer aynı modülün içerisinde her yerde public. Ama modlün dışında private olur.Kısaca modüller arasında public ve private lı olarak düzenliyor. Modül içerinde public, harici modüllerde private*/


open class Foo(){

    private val name = "Gökhan"

    public var surName = "ÖZTÜRK"

    protected val email = "göhanöztürk@androidedu.io"

    internal val age = 24



    fun printName(){
        println("merhaba: $name")
        println("SurName: $surName")
        println("Email: $email")
    }

    fun getName():String{
        return name
    }
}



class Boo private constructor(): Foo(){
    //Boo, Foo nun child class ı.

    init {
        //name e erişilemez.
        surName
        email
        age
    }
}


class Doo(){

    init {
        val foo = Foo()

        //foo.name private erişilemiyor.
        foo.surName
        //foo.email  protected erişilemiyor child class olmadığı için
        foo.age
    }
}


fun main() {

    val foo = Foo()

    //foo.name = "sdjfasdk"  private olduğu için erişemiyoruz hata veriyor
    foo.surName
    //foo.email = "ajsdhakshdn"   protected olduğu için hata veriyor.



    //PRİVATE DEĞİŞKENE DIŞARIDAN ERİŞMEK İSTİYORSAK, PUPLİC BİR FONKSYON YAZIP ERİŞEBİLİRİZ.
    foo.getName()



}