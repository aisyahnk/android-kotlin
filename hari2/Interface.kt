import kotlin.math.*
interface BangunDatar {
   //daftar method
    fun hitungLuas()
    fun hitungKel()
    fun showData()
}

class Segitiga: BangunDatar {
    var alas: Double = 0.0
    var tinggi: Double = 0.0
    var keliling: Double = 0.0
    var luas: Double = 0.0

    override fun hitungKel() {
        val sisi3 = sqrt(alas * alas + tinggi * tinggi)
        keliling = alas + tinggi + sisi3
    }

    override fun hitungLuas() {
        luas = 0.5 * alas * tinggi
    }

    override fun showData() {
        println("keliling = $keliling")
        println("luas= $luas")
    }
}

fun main (){
    val segitiga = Segitiga().apply {
        alas = 3.0
        tinggi = 4.0
    }
    segitiga.hitungKel()
    segitiga.hitungLuas()
    segitiga.showData()
}
