open class Hewan (){        //open, boleh di extend
    lateinit var nama: String 
    //protected var nama: String --> maka yg bukan anak tdk bisa memanggil
    var kaki: Int = -1

    //method
    open fun suara (){      //open agar bisa di polimorfisme (override)
        println("$nama bersuara")
    }
    open fun gerak (){
        println("$nama bergerak")
    }
}

//menambah class
class Kucing: Hewan(){  //inheritence, kucing mengextend hewan (anak class hewan), otomatis punya atribut yang sama
    init {
        nama = "kucing"
        kaki = 4
    } 

    //polimorfisme
    override fun suara() {
        println("miau")
    } 
}  

class Ikan: Hewan (){
    var sirip = 4
    init {
        nama ="ikan"
        kaki = 0
    } 

    override fun gerak() {
        println("berenang")
    } 
}

//encaptulation
class Tanaman {
    fun dimakan(hewan: Hewan){
        println("tanaman dimakan ${hewan.nama}")
    }
}

fun main() {
    val kucing = Kucing()
    val ikan = Ikan()
    val tanaman = Tanaman()
    tanaman.dimakan(kucing)
    tanaman.dimakan(ikan)
}

//memanggil
/*fun main (){
    val kucing = Kucing()
    kucing.suara()
    kucing.gerak()

    val ikan = Ikan()
    ikan.suara()
    ikan.gerak()

    //mengubah anak menjadi parent
    //anak = parent + sesuatu
    val hewan = ikan as Hewan
    hewan.suara()
    hewan.gerak()

    
}*/