package ders3.alistirmalar

fun main() {

    print("Lütfen Toplam Sepet Tutarını giriniz: ")
    var toplamSepetTutari = readln().toDouble()

    val randomIndirimYuzdesi = (10..50).random()

    val indirimTutari = toplamSepetTutari * randomIndirimYuzdesi / 100.0
    toplamSepetTutari -= indirimTutari

    println("\"Tebrikler! Çarktan %$randomIndirimYuzdesi indirim kazandınız. Yeni ödeyeceğiniz tutar: $toplamSepetTutari TL.")


}