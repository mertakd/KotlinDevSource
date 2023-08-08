package JetBrainsAcademy.Thread
import kotlin.concurrent.thread



fun main1() {
    val t: Thread = Thread.currentThread() // main thread



    println("Name: ${t.name}")
    println("ID: ${t.id}")
    println("Alive: ${t.isAlive}")
    println("Priority: ${t.priority}")
    println("Daemon: ${t.isDaemon}")


    val minPriority = Thread.MIN_PRIORITY
    val maxPriority = Thread.MAX_PRIORITY

    println("$minPriority $maxPriority")



}


fun main2() {
    //create threat
    val t1 = HelloThread() // a subclass of Thread

    val t2 = Thread(HelloRunnable()) // passing runnable

    val t3 = Thread {
        println("Hello, i'm ${Thread.currentThread().name}")
    }

    val t4 = thread(start = false, name = "Thread 4", block = {
        println("Hello, I'm ${Thread.currentThread().name}")
    })



    val t = thread(start = false, block = {
        println("Hello, I'm ${Thread.currentThread().name}")
    })
    t.start()
}


class HelloThread : Thread() {
    override fun run() {
        val helloMsg = "Hello, i'm $name"
        println(helloMsg)
    }
}



class HelloRunnable : Runnable {
    override fun run() {
        val threadName = Thread.currentThread().name
        val helloMsg = "Hello, i'm $threadName"
        println(helloMsg)
    }
}










fun main() {
    val workerThread = SquareWorkerThread("square-worker")
    workerThread.start() // start a worker (not run!)

    for (i in 0 until 5_555_555_543L) {
        if (i % 1_000_000_000 == 0L) {
            println("Hello from the main!")
        }
    }
}
class SquareWorkerThread(name: String) : Thread(name) {
    override fun run() {
        while (true) {
            val number = readln().toInt()
            if (number == 0) {
                break
            }
            println(number * number)
        }
        println("$name's finished")
    }
}