fun main() {
    val hari = "senin"
    val angka = 2

    val hariAngka = day2Number(hari + angka) % 7
    println(number2Day(hariAngka))
}

//method
fun day2Number(day: String) = when (day) {
        "senin" -> 0
        "selasa" -> 1
        "rabu" -> 2
        "kamis" -> 3
        "jumat" -> 4
        "sabtu" -> 5
        "minggu" -> 6
        else -> -1
    }

fun number2Day(number: int) = when (number){
        0 -> "senin"
        1 -> "selasa"
        2 -> "rabu"
        3 -> "kamis"
        4 -> "jumat"
        5 -> "sabtu"
        6 -> "minggu"
    } 

}
