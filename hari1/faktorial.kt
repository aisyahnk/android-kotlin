//mencari faktorial
/*fun main () {
    val angka = 5

    var hasil = 1
    for (i in angka downTo 1){
        hasil = hasil * i   //hasil *= i
    }
    println(hasil)
}
*/


//mencari jumlah nol dibelakang hasil faktorial 
fun main () {
    val angka = 5

    var hasil = 0
    for (i in 1..angka){
        if (i % 5 == 0)
            hasil++
    }
    println(hasil)
}

fun limaPangkat(angka: Int): Int {
    var pangkat = 0
    var temp = angka
    while (temp % 5 == 0) {
        temp /= 5
        pangkat++
    }
    return pangkat
}
