package JetBrainsAcademy.Andromeda

fun main() {

    val result = printStrings("muslera","nelson","abdulkerim","boey","kazımcan","lucas","sergio","kerem","rachica","mertens","icardi")
    println(result)
}


fun printStrings(vararg vs: String) {
    vs.forEach { println(it) }
}
//statik fonksiyondur, VarargsKt sınıfının herhangi bir örneği oluşturulmadan doğrudan sınıf adı üzerinden bu fonksiyonlar çağrılabilir.








