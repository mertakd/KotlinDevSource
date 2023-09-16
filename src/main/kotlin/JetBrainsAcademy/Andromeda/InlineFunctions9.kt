package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.Andromeda


/*
* inline ile yazarsak, inline fun higherOrderFunction içinde ki  lambda(), main de çağırılan higherOrderFunction {} içine kopyalanıyor.
* inline yaparsak fonksiyonu ve return yaparsak kendisini karşılayan üst scopa return edecek.bunan non - local return denir.
  inline fonksiyon olup main de   " return@higherOrderFunction " yazarsak,  çalışması devam ettiriliyor her şey yazdırılıyor. */
fun main() {


        println("calling started")
        /**
         * Higher order fonksiyon kotlin byte code çevriminde parametreler nesnelere dönüşür. Bunu örneğin bir döngüde
         * kullandığımız zaman her bir çağırımda nesne üretilir. bir fonksiyonun inline haline getirilmesi nesne oluşması
         * durumunu engeller
         */

        /**
         * inline fonksiyonlar reflection kullandığından dolayı en fazla 2-3 satırlı fonksiyonlar inline olarak
         * işaretlenmelidir. reflection her ne kadar yararlı olsa da performansa fazlasıyla etki eden bir şeydir.
         */


        println("lambda")

        higherOrderFunction {
            // bu scope local olarak adlandırılır
            /**
             * inline fonksiyonlar non-local returnlere izin verir. aynı zamanda lokal return de kullanabilirsiniz.
             */
            println("lambda")
            // non-local return return
            // local return return@higherOrderFunction
            return@higherOrderFunction
        }



        println("calling ended")


}


inline fun higherOrderFunction(noinline lambda: () -> Unit) {
    println("higher order function started")
    // println("lambda")
    lambda()
    println("higher order function ended")
}