import Kekod.Boo


class ListUtils{

    companion object Info{

        fun <T> info(list:List<T>): String{
            if (list.isEmpty()){
                return "[]"
            }
            return list.joinToString ( ",", "[", "]")
        }

    }
}


fun main1() {

    val numbers = listOf(1,2,3,4,5)
    val emptyList = emptyList<Int>()

    val numbersInfo = ListUtils.Info.info(numbers)
    val emptyListInfo = ListUtils.Info.info(emptyList)

    println(numbersInfo)
    println(emptyListInfo)
}



data class Box<T>(val item:T){}

fun <T> Box<T>.guessBox(){
    println("In this box you have: $item")
}

fun main45() {

    val stringBox = Box("my books")
    val intBox = Box(27)

    val st = stringBox.guessBox()
    val int = intBox.guessBox()

    println("$st and $int")
}

