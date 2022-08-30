//percabangan
fun main() {
    val angka = 5
    val isEven = if (angka % 2 == 0) true else false

    if(isEven) {  //jika kondisi yg akan dicek
        println("genap")  //jika terpenuhi mau ngapain?
    }else{                //jika tdk terpenuhi
        println("ganjil")
    }
}