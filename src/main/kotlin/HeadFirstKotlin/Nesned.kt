package HeadFirstKotlin

class Outer{
    val x = "This is in the Outer Class"


    class Nesned{
        val y = "This is in the Nesned Class"
        fun myFun() = "This is the Nesned function"
    }

    val nesnedValue= Nesned().myFun()
}


class Outer2{
    val x = "This is in the Outer Class"


    inner class Inner{
        val y2 = "This is in the Inner Class"
        fun myFun2() = "This is the Inner function"

        fun getX() = "The value of x is: $x"
    }

}



class Outer3{
    val x = "This is in the Outer Class"


    val myInner = Inner()


    inner class Inner{
        val y2 = "This is in the Inner Class"
        fun myFun2() = "This is the Inner function"

        fun getX() = "The value of x is: $x"
    }

}



fun main() {

    //Nesned Class
    val nesned = Outer.Nesned()
    println(nesned.y)
    println(nesned.myFun())


    //Inner Class
    val inner = Outer2().Inner()
    println(inner.y2)
    println(inner.myFun2())
    println(inner.getX())



    val inner2 = Outer3().myInner
    inner2.myFun2()
}