//perulangan while
//menentukan pangkat 5
fun main() {
    var angka = 125

    var pangkat = 0
    while (angka % 5 == 0) {
        angka /= 5
        pangkat++
    }
    if (angka == 1) {
        println("5 ^ $pangkat")
    }else{
        println("bukan pangkat lima")
    }
}