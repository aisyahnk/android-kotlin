//kelas khusus atau enum, berisi pilihan nilai

enum class State {LOADING, SUCCESS, FAILED}

data class Mahasiswa(   //otomatis bisa di print
    var nama: String,
    var nim: String,
    var prodi: String,
)

fun main() {
    println("mengambil data...")
    var status = State.LOADING

    // lakukan proses ambil data

    status = State.SUCCESS
    println("data berhasil diambil")

    var mhs1 = Mahasiswa("aku", "12345", "pilkom")
    var mhs2 = Mahasiswa("aku", "12345", "pilkom")
    println(mhs1 == mhs2)
}