abstract class BangunDatar {  //punya method, tp methodnya blh tidak diisi
    lateinit var nama: String
    var keliling: Double = 0.0
    var luas: Double = 0.0

    //method
    //abstract wajib di override
    //abstact tdk bisa dijadikan object
    abstract fun hitungKel()  
    abstract fun hitungLuas()

    fun showData(){
        println("keliling = $keliling")
        println("luas = $luas")
    }
}

class Persegi: BangunDatar(){
    var sisi: Double = 0.0
    override fun hitungKel(){
        keliling = 4 * sisi
    }

    override fun hitungLuas(){
        luas = sisi * sisi
    }
}

fun main () {
    val persegi = Persegi()
    persegi.sisi = 7.0
    persegi.hitungKel()
    persegi.hitungLuas()
    persegi.showData()
}