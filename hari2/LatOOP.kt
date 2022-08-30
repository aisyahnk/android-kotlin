//latihan oop membuat class

class Mahasiswa (
    var nim: Int,
    var kodeJurusan: Int,
    var nama: String,
){
    fun showData(){
        println("Nim Mahasiswa : $nim")
        println("kode jurusan : $kodeJurusan")
        println("Nama Mahasiswa : $nama")
    }
 }
 
    fun main() {
        val mhs1 = Mahasiswa(123, 1, "aku") 
        mhs1.showData()
    }
