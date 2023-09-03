import Kekod.Boo

class RandomClass<T, S, U>(private val value1: T, private val value2: S, private val value3: U){

    fun getFirstValue(): T{
        return value1
    }

    fun getSecondValue(): S{
        return value2
    }

    fun getThirdValue(): U{
        return value3
    }

}


fun main() {

    val randomInstance = RandomClass("Hello",42,true)

    val firstValue: String = randomInstance.getFirstValue()
    val secondValue: Int = randomInstance.getSecondValue()
    val thirdValue: Boolean = randomInstance.getThirdValue()

    println("First Value: $firstValue")
    println("First Value: $secondValue")
    println("First Value: $thirdValue")
}




