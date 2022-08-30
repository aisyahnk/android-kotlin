fun main () {
    val angka = 15 //apakah prima atau bukan

    if (isPrime(angka))
        println("prima")
    else
        println("bukan prima")
}

fun isPrime(angka: Int): Boolean{
    for (i in 2..angka-1){
        if (angka % 1 == 0)
        return false
    }
    return true
}