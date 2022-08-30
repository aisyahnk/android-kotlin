fun main() {
    val nilai = arrayOf(87, 77, 94, 78, 56)

    var hasil = 0
    for (i in nilai){
        hasil = hasil + i
    }
    val nilaiRata = hasil.toDouble() / nilai.size
    println(nilaiRata)
}