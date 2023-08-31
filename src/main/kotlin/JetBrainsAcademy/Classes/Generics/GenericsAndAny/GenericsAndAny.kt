package JetBrainsAcademy.Classes.Generics.GenericsAndAny

class GenericType<T>(val t: T) {
    fun get(): T {
        return t
    }
}

fun main() {
    val stringInstance: GenericType<String> = GenericType<String>("abc")
    val stringField = stringInstance.get()
    println(stringField)
}