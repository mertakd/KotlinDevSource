import Kekod.Boo

class SomeCollection<T>(val list: List<T>) {
    // write your code here
    fun invert() {
        val reversed = list.reversed()
        println(reversed)
    }
}

fun main768678() {
    val list = listOf("hello", "bonjour", "guten tag")
    val collection = SomeCollection(list)
    collection.invert()
}


class Foo {
    fun <T> T.foo(that: T): T = throw Exception()

    init {
        "str".foo(42)
    }
}

fun main() {
    val foo = Foo()
    println(foo)
}