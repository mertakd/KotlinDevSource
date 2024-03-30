package Andromeda


/**
 *lambda expressionlar ve anonymous functions literal olarak adlandırılıyor.
 * Fonksiyon Literal: Bir fonksiyon tanımlanmadan anlık olarak kullanıldığı yapıya functions literal denir.
 *
 * Callback fonksiyonun içindeyken, belli başlı durumlardan fonksiyonu çağıranı haberdar etme durumu. Sadece dönüş değeri dönüyorum sana demek değil, ayrıca  diyelim ki işlemin yarısında hata oluşursa o callback ile geri dönüp diyebiliyorum ki bir hata oluştu bir şey yapmak ister misin?
    recyclerview da listener atıyoruz higherorder kullanırken aslında kullanım mantığı bu.

 * invoke: atadığımız lambda expresion un nullable olması durumunda burayı safety olarak kullanmak için invoke kullanıyoruz */


//val name = "${4+2}" //string literal
fun getName() = "Halil" //expression
fun getName1(parameter:String) = parameter  //statement










