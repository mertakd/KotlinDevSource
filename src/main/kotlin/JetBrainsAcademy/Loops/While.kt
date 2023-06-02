package JetBrainsAcademy.Loops

fun main1() {

    /*
    //çift olan sayıları yazdır
    var i = 0
    while (i < 10){
        i++
        if (i % 2 == 0){
            print("$i")
        }
    }
     */

/**
 * şart saplanmasa da kontrol ediliyor
    var i = 5

    do {
        i++
        print("$i")
        i -= 2

    }while (i > 1)

 */
}

fun main2() {
    var count = 0
    var num = readLine()!!.toInt()

    while (num != 0) {
        count++
        num = readLine()!!.toInt()
    }

    println(count)
}

fun main() {
    //verilen sayıları birbiriyle topluyor.
    var sum = 0
    var num = readLine()!!.toInt()


    while (num != 0){
        sum += num
        num = readLine()!!.toInt()
    }
}