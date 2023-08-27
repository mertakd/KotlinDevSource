package JetBrainsAcademy.Classes.Object.ObjectDecleration

/**
 *Singleton, bir sınıfın küresel erişime sahip yalnızca bir örneğe sahip olmasını sağlayan bir tasarım modelidir.
 * Bu, kodun herhangi bir yerinde bir singleton sınıfının örneğini alabileceğimiz anlamına gelir.
 * Singleton sınıfının yalnızca tek bir örneği vardır.
 * Singleton sınıfı küresel bir erişim noktası sağlar.
 *
 * Singleton gerçekten kullanışlı bir kalıptır ve Kotlin singleton'ları bildirmek için özel bir yapı sağlar: object declaration.
 *
 * Nesne bildirimini kullandığınızda, Kotlin bunu kendisi yaptığı için yapıcı(constructor) kullanılamaz.
 *
 * İç sınıfın özelliklerini dış sınıfta kullabiliriz
 * Dış sınıfın özelliklerini ve işlevlerini iç sınıfta kullanamazsınız.
 * constants  yapılar top-level olarak bildirilmemili. Bunun yerine bir object içinde bildirmek daha uygundur. Yoksa hatalara neden olabilir.*/


class Player(val id: Int) {

    val speed = 7

    object Properties {
        /* Default player speed in playing field – 7 cells per turn */
        //val defaultSpeed = 7
        const val DEFAULT_SPEED = 7



        //val defaultSpeed2 = speed -> dış sınıfın özelliğine erişilmez
        fun calcMovePenalty(cell: Int): Int {
            return  cell
        }
    }

    /* Player'ın yeni bir örneğini oluşturur
    * Bu örnekte sınıfın yeni bir örneğini oluşturabilecek ek bir singleton oluşturduk.
    * Bu kalıba Fabrika adı verilir ve karmaşık durumlar için gerçekten yararlı olabilir.
    * */
    object Factory {
        fun create(playerId: Int): Player {
            return Player(playerId)
        }
    }




    val superSpeed = Properties.DEFAULT_SPEED * 2
    //Dış sınıfta iç içe geçmiş bir nesnenin özelliklerini ve işlevlerini de kullanabilirsiniz.
    //Bu, bir sınıfın tüm örneklerinde ortak olan bazı verileri depolamak ve değişkenleri başlatmak için yararlı olabilir.
}

fun main() {
    /* prints 7 */
    //println(Player.Properties.defaultSpeed)
    println(Player.Properties.DEFAULT_SPEED)
    println(Player.Properties.calcMovePenalty(25))



    println(Player.Factory.create(13).id)




}




//Compile-time constants
//Bildiğiniz gibi bazen kodunuzda hiç değişmeyecek değerleri kullanmak gerekiyor. Biz bunlara sabit değerler diyoruz(constant values).
//Bu tür sabitlerin değerleri derleme zamanında zaten bilindiğinden bunlara derleme zamanı sabitleri adı verilir.
// ilk olarak, String türünde bir değerle veya temel bir türle (Int, Double vb.) başlatılmalıdır. Ayrıca custom bir getter olamaz

object Languages {
    const val FAVORITE_LANGUAGE = "Kotlin"

}





//Objects and nested objects






