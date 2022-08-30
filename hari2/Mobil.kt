//OOP part 2
class Mobil {
    var roda: Int = 4          
    var penumpang: Int = 8
    lateinit var warna: String      //jika ingin diinisialisasi di akhir
    lateinit var merk: String

    fun print() {
        println("roda = $roda ")
        println("penumpang = $penumpang")
        println("warna = $warna")
        println("merk = $merk")
    }
}

//memanggil atribut
fun main() {
    val mobil = Mobil().apply {     //apply agar penulisan mobil tdk usah berulang kali
    roda = 8                        //pemanggilan method agar tdk berulang pakai with(nama_method)
    penumpang = 2
    warna = "putih"
    merk = "toyota"
    }
    mobil.print()
}