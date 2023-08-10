package Kekod.Classes



/**
 * Data class lar en azından mutlaka 1 parametre almak zorunda
 *
 * Parametreler mutlaka val ya da var olarak tanımlanmak zorundadır.En az bir parametreden sonra parametreerimizin mutlaka var ya da var ile tanımlanması gerekiyor
   aşağı da ki hazır fonksiyonlara erişi için val ya da var yazmak zorunludur.

 * Tüm data class lar final dır. ama final modifier i redundant uyarısı verir.
 *
 * open, abstract, sealed, inner class yapılamaz,bu data class lar miras alınamıyor demek.Yani mevcut data class ımızı, başka bir class ın üst class ı olarak konumlandıramıyoruz.Başka düz class ı, abstract class ı miras alabilirler,bir interface i implement edebilirler, ama kendileri bir super type olamıyorlar.yani başka class ları data class a implement edebiliyoruz ama tam tersi olmuyor data class bir yere implement edilemez.Yani child olabiliyorlar ama üst class olamıyorlar.
 *
 * Peki data class ların düz class lardan farkı nedir?
 * equals, hashCode, copy, componentN fonksiyonları arka planda default olarak oluşturulacak.Bu yapılar düz class larda manuel olarak ovveride edip kendimiz bazı işlemler yapmamız lazım.
   data class da manuel olarak fonksiyonu override edip return edeceği değeri kendiniz ayaralayabilirsiniz.
 * Class lar da arka planda bahsettiğimiz hazır fonksiyonlar ve componentler oluşturulmuyor.
 * equals: value ları karılaştırıyor, hashCode: nesne referansını karşılaştırıyor, toString:değeri çekiyor, copy: mevcut clası kopyalıyor.
 * Yukarı da ki fonksiyonlar sadece primary const. içerisinde ki değişkenlerle çalışır.
   üye değişkenler yani süslü parantezin içine yazılan değişkenler bu hazır fonksiyonlara erişemez.

 * Pair, Triple özelleştirilmiş generic data class lar mevcut

 * componentN fonksiyonları sebebiyle destructturing declaration olarak data class lar set edilebilir.
 * */


data class News(
    val title: String = "Title",
    val description: String,
    val hasMediaContent: Boolean,
    val mediaList: List<Media>
){
    val relatedNewsList : List<News> = arrayListOf()


    override fun toString(): String {
        return "return super.toString()"
    }


    fun log(){
        println("Title: $title, description: $description")
    }
}




class NewsData(
    val title: String = "Title",
    val description: String,
    val hasMediaContent: Boolean,
    val mediaList: List<Media>
){
    val relatedNewsList : List<News> = arrayListOf()


    override fun toString(): String {
        return "return super.toString()"
    }


    fun copy():NewsData{
        return NewsData(title,description,hasMediaContent,mediaList)
    }
}


class Media


fun main() {

    val newsOne = News(
        title = "Yeni bir eğitim dönemi başladı",
        description = "kotlin dersleri işlenecek",
        hasMediaContent = true,
        mediaList = arrayListOf()
    )





    val newsTwo = NewsData(
        title = "Yeni bir eğitim dönemi başladı",
        description = "kotlin dersleri işlenecek",
        hasMediaContent = true,
        mediaList = arrayListOf()
    )




    //destructturing declaration
    //destructturing declaration yapabilmemiz için arka planda componentN leri üretiyor olmamız lazım
    //daha okunaklı temiz görünmesini sağlıyor.
    val (title, description, hasMediaContent, mediaList) = newsOne
    mediaList
    //newsOne.mediaList  uzun yol


    //düz class olduğu için hata veriyor
    //val (title2, description2, hasMediaContent2, mediaList2) = newsTwo



    //copy   data class lar da  kullanımı
    val newsThree = newsOne.copy(description = "farklı description ")



    //copy işleminin düz class larda ki uzun hali
    val newsFour = News(
        title = newsOne.title,
        description = "Farklı description",
        hasMediaContent = newsOne.hasMediaContent,
        mediaList = newsOne.mediaList
    )

}