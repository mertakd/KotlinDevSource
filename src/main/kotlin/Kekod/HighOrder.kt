package Kekod



/**
 * fonksiyonun body sini bir değişkene atarsak first citizen oluyor.
 *
 * değişkene atanan h.order
 * anaon func
 * recevier high order*/
fun main() {

    foo(::logPrint)
}

val highOrder = {surname:String ->
    println("surname: $surname")
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



fun foo(highOrderFunction: (message:String) -> String){
    highOrderFunction("comedy")
}