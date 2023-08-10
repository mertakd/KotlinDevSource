package Kekod.Classes

/**
 * ENUM CLASSES
 *
 * 1
 * Kullanım amacı aynı veri kümelerinin gruplanabilir olmasıını sağlar. -> string mesela
 * Opsiyonların tamamının neler olduğunu rhatça görebilmenizi sağlar
   ColorType ın kaç tane color içerdiğini görebiliyor oluyorum.
   Enum kullanmazsak bu tiplerin kaç tane olacağını göremeyeceğiz.
   Enum kullanmazsak vermememiz gereken bir parametre vermiş oluyoruz ve kod doğru çalışmıyor.

 *  */



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
}
//enum sabitleri arka planda class olarak tutuluyor.Yani fb, gs, bjk depğerleri
// static final class GALATASARAY extends Teams{}   bu şekil arka planda
//arka planda static oluşturulduğu için, kotlin de enumları nesnesini oluşturmadan direk kullanabiliyoruz.
