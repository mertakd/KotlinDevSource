package Kekod.Classes

/**
 *
 *      Object Singleton
 *
 */

//----------------------------------------------------------------------------------------------------------------------
/*

1) Singleton pattern nedir?
Bir class nesnesinin, memory'de herhangi bir T anında, 1 tane olmasina object singleton diyoruz.
class'in nesnesinden memory'de ayni anda sadece 1 tane olmasini istiyoruz.
Her ekranda, kullanimda yeni bir nesne olusturmak istemeyiz.
-Counter nesnesi örneği her sayfa da nesne oluşturursak sonra sıfırlanır ama siingleton ile bu olmaz.

*retrofit, room da kullanılıyor.
*Remote: Bir erkrandan başka bir ekrana giderken istek atıyoruz diyelim, isteklerin cevabı gelmeden başka ekrana döndük, o istekleri arka planda cancel edeceğiz diyelim.
  Aynı instance elimizde yok, yeni bir retrofit instance ı oluşturduk bu instance ile yeni bir istek attık
  eski retrofit instance sını zaten kaybettik ve onun kuyruğunda ki herhangi bir isteği iptal etme şansımız yok.
  Yeni retrofit instance ile de eskisinin kuyruğuna erişemiyoruz.
*Local: room da yaptığımız işlemler diyelim ki uzun süren işlemler.
  Bir işlemi başlattık başka bir ekrana geçtik. İlk ekran da başlattığımız işlemi çok uzun sürdü diye iptal etmek istiyoruz.
  Bu durum da ilk ekranda başlattığımız işlemin nesnesine ikinci ekranda erişiyor olamamız lazım ki işlemi iptal edebilelim.
  Ama singleton kullanmazsak ikinci ekranda da db ye erişmek istediğimizde yeniden nesne oluştururuz ve bu nesneden de ilk ekranda ki işleme ulaşamayız.

Teknik Açıklama
* static olan değişken ya da sınıfa garbage colector silmiyor.yani static olan field lara dokunmuyor diğer field ları temizliyor.
  bu sayde herhangi bir T anında o class ın nesnesine ihtiyaç duyduğumuz da, zaten memory de bir kez yaratıldıysa, ikincisini yaratmadan garbage collector un silemediği o objeyi geri döndürüyoruz.


2) Singleton pattern'in eksileri nedir?
Java karsiliginda static keywordu ile yazildigi icin, yanlis ve gereksiz kullanimlarda (ornek veri tasimak icin kullanmak)
    garbage collector'in toplamadigi veri sayisi artacak.memory de çok yer tutacak yani
Bu da memory leak'e sebep olabilir.

 */

/**
 *  Ozetle JAVA'da 3 adimda yapilir;
 *
 *  1- Constructor'i private olarak olustur. Böylece dışarıdan sınıfın nesnesi oluşturulamaz. Amaç dışarıdan oluşturulamasın, içeriden sadece bir kez oluşturulsun
 *  2- Class'in icinde kendisinin degiskenini olustur (volatile static olarak)
 *  3- Bu degiskeni donduren bir newInstance() fonksiyonu yaz (synchronized static olarak) -- null check yaparak --
 *
 *  synchronized: bunu kullanmazsak, farklı thread ler  de  bir çok nesne oluşturabilir.
    üç thread aynı anda erişmek istiyor nesneye diyelim, ilk erişen dışındaki iki thread için erişimi kapatır, nesne oluşturan fonksiyona erişimi kapatır yani
    ilk baş birinci thread işlemi yapar diğerleri ni bekletir sonra2 yi o işini bitirir sonra 3 işlemini yapar.
 * volatile : synchronized ın aynı görevini değişkenlere yapar. Yani aynı anda mevcut değişkene sadece tek bir işlemcinin erişebilir olmasını sağlatır.
 */

//----------------------------------------------------------------------------------------------------------------------

//              Kotlin'de kullanim sekli asagidaki gibidir;

object ProfileKotlin{
    var nickName: String? = null
    var counter: Int = 0
}




//----------------------------------------------------------------------------------------------------------------------
fun main() {

    ProfileKotlin.nickName = "kOgunlu"
    ProfileKotlin.counter++
    ProfileKotlin.counter++
    ProfileKotlin.counter++
    ProfileKotlin.counter++

    println(ProfileKotlin.counter)

}




//----------------------------------------------------------------------------------------------------------------------