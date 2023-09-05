package Kekod.Generics

/**
 * Parametre olarak verilebilecek hiyerarşiyi kısıtlmaya yarar. Mesela sadece Auto ve autonun cgild class larında gelenler alınsın
 * Her tipden değer alabilir.
 * derleme zamanında ttipi bilmez, çalışma zamanında tipi bilir.
 *
 * out : üst sınıfın, child kısmınında aktif olmasını sağlıyor. out olan classın kendisini yada child class nı eşitlik olarak verebilirizç
 * in : üst sınıf ve üst class ı nın aktif olması
 * T : sadece T varsa her şeyi alabiliyoruz.
 * reified :  reified sadece inline fonksiyonlar da kullanılıyor. derleme zamanında hangi tipde olabileceği biliniyor.*/


interface TransportationFunctions{
    fun run()
}

open class Auto : TransportationFunctions{
    open val name: String = ""
    open val color: String = ""

    override fun run() {
        println("Run boy run")
    }
}

open class Bycle{
    open val name: String = ""
    open val color: String = ""
}

// ========================================================================================


open class MiniCooper(
    override val name: String = "MiniCooper",
    override val color: String = "Red"
) : Auto(){

    override fun toString(): String {
        return "name: $name, color $color"
    }

    init {
        super.run()
    }

}


open class John : MiniCooper(){
    init {
        super.run()
    }
}

class JohnCabrio : John(){
    init {
        super.run()
    }
}




class Beetle(
    override val name: String = "Beetle",
    override val color: String = "Yellow"
) : Auto(){

    override fun toString(): String {
        return "name: $name, color $color"
    }

    init {
        super.run()
    }
}



open class Bisan(
    override val name: String = "Bisan",
    override val color: String = "Blue"
) : Bycle(), TransportationFunctions{

    override fun toString(): String {
        return "name: $name, color $color"
    }

    override fun run() {
        println("Run boy run")
    }
}


class BlackBisan(): Bisan()


class Corelli(
    override val name: String = "Corelli",
    override val color: String = "Gray"
) : Bycle(){
    override fun toString(): String {
        return "name: $name, color $color"
    }
}


// Auto -> MiniCooper -> John -> JohnCabario
//      -> Beetle(Auto nun çocuğu)

// Bycle -> Bisan -> BlackBisan
//       -> Corelli(Bycle ın çocuğu)



class TransportFactory<in T:Auto>(transportationVehicle: T){
    init {
        println(transportationVehicle.toString())
    }
}


fun main() {
    val miniCooper: MiniCooper = MiniCooper()
    val john: John  = John()
    val johnCaprio: JohnCabrio = JohnCabrio()
    val beetle: Beetle = Beetle()


    val bycle: Bycle = Bycle()
    val bisan: Bisan = Bisan()
    val blackBisan: BlackBisan = BlackBisan()
    val corelli: Corelli = Corelli()

    val miniCooperFactory: TransportFactory<MiniCooper> = TransportFactory<MiniCooper>(miniCooper)
    val johnFactory: TransportFactory<John> = TransportFactory<John>(john)
    val johnCabrioFactory: TransportFactory<JohnCabrio> = TransportFactory<JohnCabrio>(johnCaprio)
    val beetleFactory: TransportFactory<Beetle> = TransportFactory<Beetle>(beetle)


    val johnFactory2: TransportFactory<John> = TransportFactory<MiniCooper>(miniCooper)
    // üst class ın nesnesini oluşturuyoruz ama child class a atamaya çalışıyoruz.

    //val johnFactory3: TransportFactory<John> = TransportFactory<JohnCabrio>(johnCaprio)
    val johnFactory4: TransportFactory<John> = TransportFactory<John>(john)
    // out : John ve John un child dını kabul eder.
    // in : John kendisi ve John un üst class ı gelirse kabulüm. ama child class kabul değil.

    /*
    * İlk kısım değişkenin tipi               miniCooperFactory: TransportFactory<MiniCooper> =
      değişkenin tipine karşılık gelen nesne  TransportFactory<MiniCooper>(miniCooper)   */



    //sadece T nin kullanıldığı durumda arayüzler eşitse herşeyi alıyoruz  val johnFactory: TransportFactory<John> = TransportFactory<John>(john)
    // Yani arabaları da bisikletleri de alabiliriz.


    /*
    * class TransportFactory<T:Auto>(transportationVehicle: T)  bu kullanım şeklinde ise
    * Aynı değişken tipi ve karşılık gelen nesne aynı ise  hata vermez. T:Auto da araba türlerinin hepsi çalışıyor
    * */




    /**/









}

