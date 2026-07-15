package ders4.alistirmalar

fun main() {

    println("Lütfen notunuzu giriniz: ")
    val not = readln().toIntOrNull()

    if (not == null) {
        println("Lütfen notunuzu rakamlar ile giriniz.")
    } else {
        val durum = if (not >= 50) "Geçti" else "Kaldı"

        if (not >= 85) {
            println("Takdir Belgesi Kazandınız.")
        } else if (not >= 50) {
            println("Geçtiniz.")
        } else {
            println("Kaldınız.")
        }
        println(durum)
    }


}