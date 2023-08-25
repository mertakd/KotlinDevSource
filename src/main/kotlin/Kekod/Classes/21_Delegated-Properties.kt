package Kekod.Classes

/**
 *Memory de gereksiz yer kaplamasını istedmediğimiz nesneleri, daha sonra gerektiğinde çağırdığımız yapı
  ne zaman yer kaplayacağına biz kara vermiş oluyoruz.
  mesela uygulama da ui başlatılacak yavaş başlatılmasın diye bu yapı kullanılır kullanıcı o ekranda bazı view lar ile iletişime geçmek zorunda değildir.. bu yüzden bazı eylemler sonra başlatılabilir.
 * val lazy veya lateinit var ile bu yapılıyor
 * lazy val -  lateinit var olmalı
 * lazy-lateinit: uygulama ayağa kalktıkdan, ekran çizildikten sonra, ya da kullanıcının alacağı aksiyondan sonra ihtiyacımız olacak sa o zaman kullanmamız gerekiyor. ekran ilk açılırken bunlara ihtiyaç duymuyor olmamız lazım.
 * delegete ne zaman ooluşturulaacağını ifade ediyor.*/


data class User5(
    val name: String = "Mert",
    val surName: String = "Akdoğan"
)

class CardDetailFragment{


    val user:User5 by lazy (LazyThreadSafetyMode.PUBLICATION) {
        println("User5 Init")
        User5()
    }


    lateinit var user2: User5

    lateinit var userType: String

    fun printUserInfo(){
        //bu fonksiyon çağırılırsa eğer sınıf ayağa kalkacak.
        println("name: ${user.name}, serName = ${user.surName}")

        if (this::user2.isInitialized.not()){
            user2 = User5()
        }
        println("name: ${user2.name}, surName = ${user2.surName}")
    }

    init {
        userType = "Premium"
    }
}

fun main() {

    val cardDetailFragment = CardDetailFragment()

    //btnPrint.onClickListener{
    //    cardDetailFragment.printUserInfo()
    //}


}