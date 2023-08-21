package JetBrainsAcademy.Classes.Inheritance

/**
*INHERITANCE
 *Kotlin default olarak class lar final dır, inheritance yapmak için open ön eki kullanılmalı */



open class Book(val pages:Int, val author:String, var cost:Float = 0F){

    fun getFullInfo():String{
        return "$pages pages, $author author, $$cost cost"
    }


}




class Comics(pages: Int, author: String, cost: Float) : Book(pages,author,cost)
//Comics parametrelerini, üst class olan book un parametrelerine iletiyoruz. yani book da kii parametreler Comics e ait

fun main2(){
    val spidermanBook = Comics(60,"The Universe",8.99F)
    println(spidermanBook.getFullInfo())
}





// 2.Extend it
//alt sınıflara daha fazla fonksiyon ekleyebiliriz
class Booklet(pages: Int,cost: Float) : Book(pages,"",cost){

    fun getUSDCost():String{
        return "$$cost cost"
    }


    fun getEuroCost():String{
        return "€$cost cost"
    }


}

fun isBigBook(book: Book): Boolean{
    return book.pages >= 100
}
fun main() {
    val centralBooklet = Booklet(5,0.14F)
    println(centralBooklet.getUSDCost())


    val spidermanBook = Comics(113, "The Universe", 8.99F)
    val centralBooklet2 = Booklet(5, 0.14F)
    println(isBigBook(spidermanBook)) //true
    println(isBigBook(centralBooklet2)) //false
    //Book örneğinin herhangi bir alt öğesini isBigBook() işlevine geçirebiliriz.
}