package ders4.alistirmalar

fun main() {
    val ortalama = 61

    val durum =
        if (ortalama >= 50) {
            "Geçti."
        } else {
            "Kaldı."
        }

    println(durum)

}