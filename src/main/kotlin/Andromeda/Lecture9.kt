package Andromeda

fun main() {
    //inline lar nesne olarak değilde kodun kendi içerisine gömülmesini sağlıyor.
    /*
    * hisher oreder fonksiyonlar da kotlin byte code çevriminde parametreler nesnelere dönüşürü.Bunu örneğin bir döngüde kullandığımız zaman her bir çağırımda nesne üretilir.
    * inline fonksiyonlar reflaction kullandığından dolayı en fazla iki üç satırlı fonksiyonlar inline olarak işaretlenmelidir. reflection her ne kadar yararlı olsadda performansı fazlasıyla etki eden bir şeydir.
    *inline ve crossinline  function byte code incele
     */
    callingFunction()
}


fun callingFunction(){
    highOrder {
        println("lambda")
        //non local return : parametre almadan sonlardırmaz. normal fonksiyonda return hata verir.
        //
        return
    }
}
inline fun highOrder(lambda:() -> Unit){

    println("higher order function started")
    lambda()
    println("higher order function ended")

}

