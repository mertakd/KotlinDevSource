package JetBrainsAcademy.LambdaExpressions

// let, run, with, apply,also
//Bu işlevler, nesneler için geçici bir kapsam oluşturur ve lambdalardan kod çağırır. Bir lambda içinde, it veya this anahtar kelimelerini kullanarak nesnelerle iletişim kurabiliriz




data class Musician2(var name: String, var instrument: String, var band: String)

fun main2b() {
    Musician("Dave Grohl", "Drums", "Nirvana").apply {
        println(this)
        band = "Foo Fighters"
        instrument = "Guitar"
        println(this)
    }
}




data class Musician(var name: String, var instrument: String, var band: String)

fun main() {
    val dave = Musician("Dave Grohl", "Drums", "Nirvana")
    println(dave)
    dave.band = "Foo Fighters"
    dave.instrument = "Guitar"
    println(dave)
}



//Apply genellikle nesne ayarı için kullanılır - örneğin, sınıf yöntemlerine veya parametrelerine yeni değerler atamak istiyorsanız.
//Hey, bu ayarları bu nesneye ve parametrelerine uygulayın!"
