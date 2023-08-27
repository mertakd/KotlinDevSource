package Kekod.Classes

/**
 * ENUM CLASSES
 *
 * 1
 * Kullanım amacı aynı veri kümelerinin gruplanabilir olmasıını sağlar. -> string mesela
 * Opsiyonların tamamının neler olduğunu rahatça görebilmenizi sağlar
   ColorType ın kaç tane color içerdiğini görebiliyor oluyorum.
   Enum kullanmazsak bu tiplerin kaç tane olacağını göremeyeceğiz.
   Enum kullanmazsak vermememiz gereken bir parametre vermiş oluyoruz ve kod doğru çalışmıyor.
  Enum veri taşımak için kullanılmaz

 *  */

/*

Tip guvenligini (type-safety) saglar
Kullanim amaci ayni veri kumelerinin gruplanabilir olmasini saglar
Opsiyonlarin tamamaminin neler oldugunu rahatca gorebilmemizi saglar

abstract, open, inner, sealed olamazlar
yapisi geregi zaten final'dir. Final keyword'u kullanmak redundant uyarisi verir

ozunde class olduklari icin, constructor kullanabilirler ve bu constructor icersinde veri tutabilirler
java karsiliginda bu enum sabitleri static final class'lar seklinde tutulurlar
    bu sayede, kullanirken bu sabitlerin nesnesini olusturmak zorunda kalmayiz.

enum class'larin nesnesi olusuturulmaz.

Her enum sabiti final name: String ve final ordinal: Int degiskenler default olarak sahiptir
name ifadesi, enum'in kendisinin string halini verir
ordinal ifadesi, enum'daki sabitin index'ini verir ve 0'dan baslar.
bu degiskenler final olduklari icin, enum sabitleri icerisinde override edilemezler

enum class'lar herhangi baska bir class'i miras alamazlar
enum class'lar herhangi baska bir interface'i implement edebilirler.

enum class'lar abstract  property'ler ya da abstract func'lar alabilir
Bunlari aldiklarinda tum sabitler bu abstract yapilari override etmek zorundadir.

bir open function da yazilabilir. open olmasindan dolayi override etme zorunlulugu yoktur.
Ancak open olarak belirtilen func'nun body'si olmak zorundadir.

kullanim sekli;

enum class xxxType{
NAME1,
NAME2,
NAME3
}


Onemli not:
Tum enum sabitleri aslinda bir alt class'tir, ust sinifi yani enum class'i miras alir (class ya da interface).
Bu nedenle bu alt class'lari soyle cagirabiliriz
Teams.BESIKTAS
----Teams().BESIKTAS seklinde degil, nesne olusturmadan cagrilir


 */



interface TeamFunctionality{
    fun practice()

}





enum class ColorType{
    RED, BLUE, WHITE
}
//1
//Kullanım amacı aynı veri kümelerinin gruplanabilir olmasıını sağlar.
//Opsiyonların tamamının neler olduğunu rahatça görebilmenizi sağlar.




enum class TeamsType(val startCount: Int){

    FENERBAHÇE(3),
    GALATASARAY(4),
    BEŞİTAŞ(3),
    TRABZONSPOR(2)
}
//Eğer içeride bir value taşıyacaksak böyle kullanmamız lazım






enum class Teams(val startCount: Int) : TeamFunctionality{
    //val yapmazsak bu değişkene dışarıdan erişemeyiz.Bu Teams e dışarıdan eriştiğimiz de buradaki starCount u da okumak isteyeceğiz, bu yüzden val yada var ile bilgisini buraya veriyoruz.
    //var olarak tutma çünkü enum statik
    FENERBAHÇE(3){
        override fun practice() {
            TODO("Not yet implemented")
        }
    },


    GALATASARAY(4){
        override fun practice() {
            TODO("Not yet implemented")
        }
    },


    BEŞİKTAŞ(3){
        override fun practice() {
            TODO("Not yet implemented")
        }
    },

    TRABZONSPOR(2){
        override fun practice() {
            TODO("Not yet implemented")
        }
    },
}
//enum sabitleri arka planda class olarak tutuluyor.Yani fb, gs, bjk depğerleri
// static final class GALATASARAY extends Teams{}   bu şekil arka planda
//arka planda static oluşturulduğu için, kotlin de enumları nesnesini oluşturmadan direk kullanabiliyoruz.



//----------------------------------------------------------------------------------------------------------------------

enum class DaysOfWeek(val dayNumber: Int) {

    PAZARTESI(1) {
        override fun toString(): String {
            return "PAZARTESİ"                  // normalde gerek olmayan bir sey, cunku zaten DaysOfWeek.PAZARTESI.name yazınca degeri verecek
        }                                       // ekstra bir şey (türkçe karakter gibi) yapmak istersek override edelim, keko olmayalım
    },

    SALI(2),

    CARSAMBA(3),

    PERSEMBE(4),

    CUMA(5),

    CUMARTESI(6),

    PAZAR(7)
}


//----------------------------------------------------------------------------------------------------------------------

enum class Sex{
    Male {
        override val typeCount: Int
            get() = TODO("Not yet implemented")

        override fun isOptional() {
            TODO("Not yet implemented")
        }
    },

    Female {
        override val typeCount: Int
            get() = TODO("Not yet implemented")

        override fun isOptional() {
            TODO("Not yet implemented")
        }
    },
    Other{
        override val typeCount: Int
            get() = TODO("Not yet implemented")

        override fun isOptional() {
            TODO("Not yet implemented")
        }

    };

// bir enum class'ina, her bir unem sabitinde override edilmesini istedigimiz seyler varsa
    // mecburen interface implement etmek zorunda degiliz
    // asagidaki gibi abstract val veya fun olusturabiliriz
    // bu enum sabitleri aslinda bir CLASS oldugu icin, ust sinifin (Sex) abstract'larini override etmek zorunda kaliyor

    abstract val typeCount : Int
    abstract fun isOptional()
    open fun log() {}       // open, override zorunlulugu yok
}

//----------------------------------------------------------------------------------------------------------------------


//----------------------------------------------------------------------------------------------------------------------

fun main() {


    //Enum kullanılmadan logic yapılırsa
    //hangi değerlerin olduğunu kontrol edemeyeceğiz
    //15 sayfa da çağırdık diyelim güncellemesi zor olacak ve mutlaka unutup kaçırdığımız bir nokta olacak.

    val fb = "FENERBAHCE"
    val gs = "GALATASARAY"
    val bjk = "BESIKTAS"
    val ts = "TRABZONSPOR"

    val pzt = "PAZARTESI"
    val sal = "SALI"
    val car = "CARSAMBA"
    val per= "PERSEMBE"
    val cum = "CUMA"
    val cmt = "CUMARTESI"
    val paz = "PAZAR"

    val male = "MALE"
    val female = "FEMALE"

//----------------------------------------------------------------------------------------------------------------------

    println("4 buyuk takimdan birini yaziniz: ")
    val team: String = readLine()!!

    val starCount = when {
        team == fb ->{
            3
        }
        team == gs ->{
            4
        }
        team == bjk -> {
            3
        }
        team == ts -> {
            2
        }else -> {
            -1
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Enum kullanılarak logic  yapılıyor.
    val starCount2 = when (team){


        //  Alttaki kodun daha temiz yazilmis hali
        //
        //  Teams.FENERBAHCE.name.uppercase() -> {
        //
        //  }



        Teams.FENERBAHÇE.toString() -> {
            Teams.FENERBAHÇE.startCount
        }
        Teams.GALATASARAY.toString() -> {
            Teams.GALATASARAY.startCount
        }
        Teams.BEŞİKTAŞ.toString() -> {
            Teams.BEŞİKTAŞ.startCount
        }
        Teams.TRABZONSPOR.toString() ->{
            Teams.TRABZONSPOR.startCount
        }
        else -> {
            -1
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    println(DaysOfWeek.CARSAMBA.name)
    println(DaysOfWeek.CARSAMBA.toString())

    println(Teams.BEŞİKTAŞ.name)
    println(Teams.BEŞİKTAŞ.toString())
    println(Teams.BEŞİKTAŞ.startCount)

    println(DaysOfWeek.CARSAMBA.ordinal)
    println(DaysOfWeek.CARSAMBA.dayNumber)

    // FENERBAHCE degeri enum olarak yoksa, error firlatir.
    Teams.valueOf("FENERBAHCE")
    // Teams icerisindeki tum enum constant'larini bir liste halinde doner.
    Teams.values()






//----------------------------------------------------------------------------------------------------------------------


    val bestTeam = getBestTeam(Teams.BEŞİKTAŞ)
    //TİP GÜVENLİĞİ SAĞLANMIŞ OLDU


    val bestTestTeam = getBestTeam("GALATASARAY")
    //TİP GÜVENLİĞİ SAĞLANMAMIŞ OLDU
}

//----------------------------------------------------------------------------------------------------------------------

fun getBestTeam(team: Teams): Teams {
    return team
}


fun getBestTeam(team: String): String {
    return team
}