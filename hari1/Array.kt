/*fun main() {
    val DAFTAR_HARI = arrayOf(
        "senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"
    ) 
    val hari = "senin"
    val angka = 2

    val hariAngka = DAFTAR_HARI.indexOf(hari + angka) % 7
    println(DAFTAR_HARI(hariAngka))

}*/

fun main() {
    val namaHari = arrayOf(
        "senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"
    ) 
    
    for (i in 0..namaHari.size-1) {
        println("hari ke-${i+1} adalah hari ${namaHari[i]}")
    }

}