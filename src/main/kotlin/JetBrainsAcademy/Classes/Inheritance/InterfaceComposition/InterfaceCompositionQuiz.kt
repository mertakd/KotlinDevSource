package JetBrainsAcademy.Classes.Inheritance.InterfaceComposition



// Quiz 1
interface Level2{
    fun getLevel(): Int
}

interface Enemy2{
    fun isEnemy(): Boolean
}

interface Class2{
    fun getClass():String
}


class HighLevelledAlliedCleric : Level2, Enemy2,  Class2{

    override fun getLevel(): Int {
        return 25
    }

    override fun isEnemy(): Boolean {
        return false
    }

    override fun getClass(): String {
       return "Cleric"
    }

}


class LowLevelledHostileBarbarian : Level2, Enemy2, Class2{

    override fun getLevel(): Int {return 3 }


    override fun isEnemy(): Boolean {return true}

    override fun getClass(): String = "Barbarian"
}

//<-------------------KISA YOLU AŞAĞIDA----------------------------------------------------------- >

object HighLevelled : Level2{
    override fun getLevel(): Int = 25
}

object LowLevelled : Level2{
    override fun getLevel(): Int = 3
}

object Hostile : Enemy2{
    override fun isEnemy(): Boolean = true
}

object Ally :Enemy2{
    override fun isEnemy(): Boolean = false
}

object Cleric : Class2{
    override fun getClass(): String = "Cleric"
}

object Barbarian : Class2{
    override fun getClass(): String = "Barbarian"
}



class HighLevelledAlliedCleric2 : Level2 by HighLevelled, Enemy2 by Ally, Class2 by Cleric

class LowLevelledHostileBarbarian2 : Level2 by LowLevelled, Enemy2 by Hostile, Class2 by Barbarian








// Quiz 2
interface PrinterInterface {
    fun printSomething() = print("something")
    fun printSomethingElse() = print("something else")
}

interface NewLinePrinterInterface {
    fun printSomething() = println("new line something")
    fun printSomethingElse() = println("new line something else")
}

class MultiPrinterClass : PrinterInterface, NewLinePrinterInterface {
    override fun printSomething() = print("classy something")

    override fun printSomethingElse() {
        // Change only the following line
        super<NewLinePrinterInterface>.printSomethingElse()
    }
}








//Quiz 4

interface Weight {
    fun getWeight(): Int
    fun affectedByGravity(): Boolean
}

interface Form {
    fun getVolume(): Int
}

class HeavyBrick : Weight, Form {
    override fun getWeight(): Int = 50
    override fun affectedByGravity(): Boolean = true
    override fun getVolume(): Int = 20
}

class HeavyBrickComposition : Weight by Heavy, Form by Brick

// Do not change the code above.

object Heavy : Weight{

    override fun getWeight(): Int = 50

    override fun affectedByGravity(): Boolean = true
}

object Brick : Form {
    override fun getVolume(): Int = 20
}




//Quiz5
interface PrinterInterfaceEx {
    fun printSomethingEx() = print("something")
    fun printSomethingElseEx() = print("something else")
}

interface NewLinePrinterInterfaceEx {
    fun printSomethingEx() = println("new line something")
    fun printSomethingElseEx() = println("new line something else")
}

class MultiPrinterClassEx : PrinterInterfaceEx, NewLinePrinterInterfaceEx {
    override fun printSomethingEx() = print("classy something")

    override fun printSomethingElseEx() {
        super<NewLinePrinterInterfaceEx>.printSomethingElseEx()
        super<PrinterInterfaceEx>.printSomethingElseEx()
        super<PrinterInterfaceEx>.printSomethingEx()
        println("something?")
    }
}




