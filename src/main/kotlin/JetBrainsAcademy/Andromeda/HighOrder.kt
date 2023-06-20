package JetBrainsAcademy.Andromeda

fun main1() {


}
/*
*lambda expressionlar vev ana fpnksiyonlar literal olarak adlandırılıyor yani fonksiyon sabit
* fonk literal: bir fonksiyonun tanımlanmadan anlık olarak kullanılmasına function literal denir
*
* */


/*
* anon fonk, lambda tanımlama
* (Int,Int)->Int
* 1.parametre ınt
* 2.parametre ınt
* bu fonksıyonun dönüş değeri int olur*/
//fun getName() = "Mert"
//fun getName(parametre:String) = val name stataement değer döndürmüyor
//val name = "${4+2}"

fun sum(a:Int, b:Int):Int{
    return a + b
}


//labnda expressionlar her zaman süsülü parantezlerle çevrilir {}
//il süslü parantezden sonra parametreler belirlenir parametreler arasına virgül konur, parametrelerden sonra
// -> işareti konuşur daha sonra fonksiyonun daha doğurusu expressionun body si normal fonksiyon gibi yazılır.
//lambda ex son ifadenin return tipi olarak tanımlanır. return demenize gerek yoktur.

fun main() {

    val sum = {a: Int , b: Int -> a + b}



}


/*
* lambda exp tek parametrere aldığında  zaman it olarak isimlendirilir.
* tek parametre de ok işareti koymamıza gerek yok.*/

//kotli byte kodla incele