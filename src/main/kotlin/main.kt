package JetBrainsAcademy.Projects.CoffeeMachine
import java.util.Scanner


/*data class Automat(
    val name: String,
    val ml: String,
    val price: String,
    val description: String
)


fun automatList(){

    val automatList = mutableListOf<Automat>()

    val fanta = automatList.add(Automat("Fanta", "250 ml", "5.000 TL","Gazlı içecek, demir kutu, şekerli. "))
    val cola = automatList.add(Automat("Coca Cola", "1 lt", "10.00 TL","Gazlı içecek, plastik kutu, şekerli. "))
    val didi = automatList.add(Automat("Coca Cola", "1 lt", "10.00 TL","Gazlı içecek, plastik kutu, şekerli. "))


    val canga = automatList.add(Automat("Canga", "45g", "1.16 TL","Yer fıstığı, şeker, tam yağlı süt tozu, invert şeker şurubu, kakao yağ 532.Okcal"))
    val maximus = automatList.add(Automat("Maximus", "50g", "2.25 TL","Şeker, İnvert şeker şurubu, Yer fıstığı, 480 Okcal"))

    automatList.forEach {

        println("Name: ${it.name}, ML: ${it.ml}, Description: ${it.description}")
    }
}*/






// Ürün sınıfı
data class Urun(val ad: String, val boyut: String, val fiyat: Double, val aciklama: String)

// Otomat sınıfı
class Otomat(private val urunListesi: List<Urun>) {

    private var kullaniciBakiyesi: Double = 0.0


    // Ürün listesini göster
    fun urunListesiniGoster() {
        println("Ürün Listesi:")
        for ((index, urun) in urunListesi.withIndex()) {
            println("${index + 1}. ${urun.ad} - ${urun.boyut} ${urun.fiyat}TL")
        }
    }

    // Ürün seçimi
    fun urunSec(index: Int): Urun? {
        if (index >= 0 && index < urunListesi.size) {
            return urunListesi[index]
        }
        return null
    }

    // Ödeme alma
    fun odemeAl(miktar: Double): Boolean {
        if (miktar >= 0) {
            kullaniciBakiyesi += miktar
            return true
        }
        return false
    }

    // Ürünü verme ve bakiye kontrolü
    fun urunuVer(urun: Urun?): Boolean {
        if (urun != null && kullaniciBakiyesi >= urun.fiyat) {
            println("${urun.ad} ürününüz hazır. Kalan bakiye: ${kullaniciBakiyesi - urun.fiyat}TL")
            kullaniciBakiyesi -= urun.fiyat
            return true
        }
        return false
    }

    // Bakiye iadesi
    fun bakiyeIade(): Double {
        val iadeMiktari = kullaniciBakiyesi
        kullaniciBakiyesi = 0.0
        return iadeMiktari
    }
}

fun main() {
    val urunListesi = listOf(
        Urun("Fanta", "250ml", 5.00, "Gazlı İçecek Demir kutu Şekerli"),
        Urun("Coca Cola", "1L", 10.00, "Gazlı İçecek PLASTİK KUTU ŞEKERLİ"),
        Urun("Didi", "250ml", 5.00, "Soğuk Çay Demir kutu Şeftali aromalı"),
        Urun("Canga", "45g", 1.15, "Yer fıstığı, şeker, tam yağlı süt tozu, invert şeker şurubu, kakao yağı, 532 Kalori"),
        Urun("Maximus", "50g", 2.25, "Şeker, İnvert şeker şurubu, yer fıstığı, 480 Kalori")
    )

    val otomat = Otomat(urunListesi)

    otomat.urunListesiniGoster()

    println("Lütfen bir ürün seçin (ürün numarasını girin):")
    val secilenUrunIndex = readLine()?.toIntOrNull() ?: -1
    val secilenUrun = otomat.urunSec(secilenUrunIndex - 1)

    if (secilenUrun != null) {
        println("Lütfen ödeme yapın (TL cinsinden miktarı girin):")
        val odemeMiktari = readLine()?.toDoubleOrNull() ?: 0.0

        if (otomat.odemeAl(odemeMiktari)) {
            if (otomat.urunuVer(secilenUrun)) {
                println("Teşekkür ederiz! İyi günler dileriz.")
            } else {
                println("Üzgünüz, ödemeniz kabul edildi ancak ürün verilemedi.")
                println("Bakiyenizi iade alabilirsiniz: ${otomat.bakiyeIade()}TL")
            }
        } else {
            println("Geçersiz ödeme miktarı. Lütfen geçerli bir miktar girin.")
        }
    } else {
        println("Geçersiz ürün seçimi. Lütfen geçerli bir ürün numarası girin.")
    }
}







