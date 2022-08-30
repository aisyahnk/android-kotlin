import kotlinx.coroutines.*

fun main() = runBlocking {      //
    launch {                    //coroutine
        delay(2000L)
        println("halo blocking")
    }
    println("halo biasa")
}

suspend fun lakukanBlocking() { //akan melakukan block
    delay(2000L)
    println("halo blocking")
}