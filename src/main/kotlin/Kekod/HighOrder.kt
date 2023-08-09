package Kekod



/**
 * fonksiyonun body sini bir değişkene atarsak first citizen oluyor.
 *
 * değişkene atanan h.order
 * anaon func
 * recevier high order*/
fun main() {

    //foo(::logPrint)

    foo { message ->
        println("Message : $message")
    }


    foo2("comedy")


    highOrder
}

val highOrder = {surname:String ->
    println("surname: $surname")
    "surName: $surname"
    //bu bir değişken gibi duruyor ama değişken değil.Bu bir fonksiyon high ordder fonksiyonun kendisi oluyor.Geri dönüş tipi unit olması istiyorsak, son satırı beklenen geri dönüş tipinde olması lazım.
}


val ananDun = fun(surname:String):String{
    return "surname : $surname"
}


val ananDun2 = fun(surname:String):String = surname
// fonksiyonun body sini bir değişkene atarsak first citizen oluyor
// bu değişken bir fonksiyon artık





fun logPrint(message:String):String{
    return "log: $message"
}







fun foo(highOrderFunction: (message:String) -> Unit){
    highOrderFunction("comedy")
    //parametreleri fonksiyonun içinde tanımlıyoruz.

}


fun foo2(message:String):Unit{
    println("message: $message")
    //bunu yazsak da aynı şeye denk gelecekti.Ama mevzu zaten biz bu println işlemini burada yazmak istemiyoruz. Neden o zaman high-order kullanıyoruz. Yazdığımız business locigler de, kullandığımız mimariler de işi daha kolay yapabilmek için bu println kodunun fonksiyon içinde olmaması gerekecek. Mesela bu kod başka bir class dan almamız gerekecek.Böyle bir durumda high-order fonksiyonları kullanacağız.
}




/*
infix fun News.read(readTitle: (title:String) -> Unit){

}*/
