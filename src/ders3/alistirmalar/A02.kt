package ders3.alistirmalar

fun main() {
    println("Yaşadığınız şehri giriniz")
    val sehir = readln()

    println("Bugünün en düşük sıcaklığını giriniz")
    val dusukSicaklik = readln().toDouble()

    println("Bugünün en yüksek sıcaklığını giriniz")
    val yuksekSicaklik = readln().toDouble()

    val ortalama = (dusukSicaklik + yuksekSicaklik) / 2.0

    println("Burası $sehir. Bugün sıcaklık $dusukSicaklik ile $yuksekSicaklik arasında değişecek. Ortalama sıcaklık: $ortalama")
}