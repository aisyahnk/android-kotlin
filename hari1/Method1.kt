fun main() {
    val suhu1 = 62.6
    val suhu2 = 79.0
    val suhu3 = 89.6

    println(fahrenheit2Celcius(suhu1))
    println(fahrenheit2Celcius(suhu2))
    println(fahrenheit2Celcius(suhu3))
}

fun fahrenheit2Celcius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}