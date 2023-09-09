package JetBrainsAcademy.ControlStructures.JumpsAndReturns


/*
*Kotlin'de bulunan tüm yapısal atlama ifadeleri:break,return,continue
* Which keyword allows jumping out of both a loop and a function at the same time?  return */



/*Break
* "break" ifadesi, en yakın iç içe geçmiş döngüyü sonlandırmak için kullanılır. Eğer belirli bir koşul gerçekleşirse, döngüden çıkmak için kendi koşullarınızı belirleyebilirsiniz.
* Bu durumda, "Döngüden önce" ve "Döngüden sonra" ifadeleri, döngü ile ilgili olmayan ve yalnızca döngü dışında çalışan kodlardır. "break" ifadesi yalnızca en yakın iç içe geçmiş döngüyü sonlandırır ve döngüden sonra gelen kodları etkilemez.
* Yani, "break" ifadesi yalnızca döngüyü kırar ve döngüden sonraki kod satırlarına geçer. Döngü öncesindeki veya sonrasındaki kodlar, döngüden bağımsız olarak çalışır ve "break" ifadesinden etkilenmez.
* Faydaları:
*Belirli bir koşul gerçekleştiğinde bir döngüyü sonlandırmak istediğinizde.
*İlgilenmediğiniz veya işlem yapmak istemediğiniz durumları atlamak için. Örneğin, bir liste veya dizi üzerinde dolaşırken belirli bir koşula sahip elemanları geçmek isteyebilirsiniz.
*Performans optimizasyonu için. Örneğin, bir arama işlemini gerçekleştirirken, bulunan bir sonuç olduğunda geri kalan aramalara gerek olmadığını anlarsınız ve döngüyü sonlandırabilirsiniz.
* break ve continue farkı: continue ifadesi bir döngü içindeki iterasyonu atlamak için kullanılırken, break ifadesi döngüyü tamamen sonlandırmak için kullanılır.*/
fun main11() {

    println("Before the loop")
    for (i in 1..10){

        if (i == 3){
            break
        }
        println(i)

    }
    println("After the loop")

}






// Bir yinelemeyi yoksaymanız gerektiğinde continue kullanmalısınız.
// continue break gibi döngüden çıkmıyor sadece yenilemeye devam ediyor

fun main22() {

    var result = ""
    for (i in "hello world") {
        if (i == 'o'){
            continue
        }
        result += i
    }
    println(result)

}

fun main33() {

    var result = ""
    for (i in "hello world"){
        if (i == 'o'){
            break
        }
        result += i
    }
    println(result)


}

/*
*Bu kod, "hello world" metnini karakter karakter dolaşan bir döngü içeriyor. Her karakter için döngüdeki kod çalıştırılırken, eğer karakter 'o' ise continue ifadesi kullanılarak mevcut iterasyon atlanıyor ve döngü bir sonraki karaktere geçiyor.
* Bu örnekte, continue ifadesi 'o' karakterini atlamak için kullanılıyor. Dolayısıyla, sonuç olarak "hello world" metninde 'o' karakterleri atlanarak result değişkenine karakterler ekleniyor ve sonuç olarak "hell wrld" elde ediliyor.
* Yani, döngüde continue ifadesiyle karşılaşıldığında, döngü içindeki geri kalan kodlar atlanır ve bir sonraki iterasyon başlar.
* continue ifadesi, bir döngü içinde belirli bir durumda mevcut iterasyonun atlanmasını sağlar. Ancak, continue ifadesi kullanımı kodun okunurluğunu azaltabileceğinden dikkatli kullanılmalıdır. */








//INNER LOOP  AND  structural jump
fun main44() {

    for (i in 1..4) {
        for (j in 1..4) {
            if (j == 2) continue // you want to ignore j = 2
            if (i <= j) break    // you will print the string if i is greater than j
            println("i = $i, j = $j")
        }
        println("Finished to examine i = $i")
    }

}








// Labels

/*
* Gördüğünüz gibi, break ve continue yalnızca bir döngüyü sonlandırır. Ancak dış döngüyü sonlandırmak istersek ne yapmalıyız? Bu durumda etiketleri kullanmalısınız. Onlara bir göz atalım.
* Yani etiketler sadece iç döngüyü değil dış döngüyü de kırmamıza yardımcı olur.
* */

fun main55() {

    loop@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i, j = $j")
            if (j == 3) break@loop
        }
    }
}
/*
*Görüldüğü gibi, break ifadesini bir etiketle birlikte kullanarak iç döngüyü (j döngüsü) tamamen sonlandırabiliriz. Bu sayede, iç döngü sonlandığında dış döngüye devam edilmez ve dış döngü de sonlanmış olur.
*Etiketler, iç içe geçmiş döngülerde dış döngüyü sonlandırmak istediğimiz durumlarda kullanılır. Etiketli break ifadesi, belirtilen etiketle etiketlenmiş döngüyü sonlandırır.
*   */



fun main65() {

    loop@ for (i in 1..3) {
        for (j in 1..3) {
            for (k in 1..3) {
                if (k == 2) continue@loop
                println("i = $i, j = $j, k = $k")
            }
        }
    }
}

//j döngüsü atlanır en üst döngüye döner









//When and structural jump expressions
fun main75() {

    //kotlin 1.4 öncesi

    Loop@ for (i in 1..10) {
        when (i) {
            3 -> continue@Loop
            6 -> break@Loop
            else -> println(i)
        }
    }

}


fun main85() {

    //kotlin 1.4 sonrası daha kolay

    for (i in 1..10) {
        when (i) {
            3 -> continue
            6 -> break
            else -> println(i)
        }
    }
}






// RETURN
//return deyimi hemen işlevin sonucunu döndürür ve return anahtar sözcüğünden sonraki kod çalıştırılmaz.
//Etiket olmadan, return ifadesi sonucu en yakın çevreleyen fonksiyona döndürmemizi sağlar.
//Herhangi bir nedenle döngüden çıkıp kalan döngü kodunu atlamak veya mevcut işlevden çıkmak istersek bu gerçekten yararlı olabilir.

fun foo() {
    val number = intArrayOf(1, 2, 3, 4, 5)
    for (it in number) {
        if (it == 3){
            return // yerel olmayan(non-local) doğrudan foo() çağırıcısına dönüş(return)
        }
        print(it)
    }
    println("this point is unreachable")
}

fun main95() {
    foo() // calling foo()
    println()
    println("foo() is over")
    for (i in 1..10) {
        for (j in 1..10) {
            println("i = $i, j = $j")
            if (j == 3) return // local return to the caller of main() /  main() çağırıcısına yerel dönüş
        }
        println("this point is unreachable")
    }
    println("this point is unreachable")
}











//The Return Statement
fun foo95() {
    val number = intArrayOf(1, 2, 3, 4, 5)
    for (it in number) {
        if (it == 3) return // non-local return directly to the caller of foo()
        print(it)
    }
    println("this point is unreachable")
}

fun main105() {
    //foo() // calling foo()
    println()
    println("foo() is over")
    for (i in 1..10) {
        for (j in 1..10) {
            println("i = $i, j = $j")
            if (j == 3) return // local return to the caller of main()
        }
        println("this point is unreachable")
    }
    println("this point is unreachable")
}









