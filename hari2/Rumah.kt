//OOP atau PBO
class Rumah (
    var jumlahLantai: Int,    //atribut
    var warna: String,        //nama atribut: inisialisasi tipe data
    var jumlahKamar: Int,     //boleh diisi default
    var jumlahToilet: Int,

    var isDoorOpen = false    //utk method 2
){
    fun showData() {          //method
        println("jmlh lantai : $jumlahLantai")
        println("warna : $warna")
        println("jmlh kamar : $jumlahKamar")
        println("jmlh toilet : $jumlahToilet")
    }

    //menambah method
    fun openDoor(){
        isDoorOpen = true
        println("pintu terbuka")
    }

    fun closeDoor(){
        isDoorOpen = false 
        println("pintu tertutup")
    }
}

fun main(){
    val rumah1 = Rumah(2, "putih", 4, 2)
    rumah1.showData()

    //mengubah atribut
    rumah1.warna = "ungu"
    rumah1.jumlahKamar = rumah1.jumlahKamar + 1
    rumah1.showData()

    //menambah object
    val rumah2 = Rumah(     //cara 2, named argument -> clarity
        jumlahLantai = 1, 
        warna = "hitam", 
        jumlahKamar = 2, 
        jumlahToilet = 1
        )

    rumah2.showData()

    //showdata jika atribut sudah default
    val rumah3 = Rumah()
    rumah3.showData()

    //jika yg diubah hanya 1 atribut
    val rumah4 = Rumah(
        warna = "abu2"
    )
    rumah4.showData()

    //jika ingin buat rumah baru spt rumah4
    val rumah5 = rumah4
    rumah5.showData

    //rumah1, rumah2, ruma3, dll adalah object

}