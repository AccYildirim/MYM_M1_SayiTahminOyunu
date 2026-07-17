package ders5

fun main() {

    val zarSayi = (1..6).random()

    println("Lütfen 1 ile 6 arasında bir sayı giriniz: ")

    val kullaniciTahmini = readln().toIntOrNull()

    if (kullaniciTahmini == null) {
        println("Geçersiz giriş yaptınız, lütfen sadece rakam kullanın!")
    } else if (kullaniciTahmini < 1 || kullaniciTahmini > 6) {
        println("Zar sadece 1, 2, 3, 4, 5 veya 6 gelebilir!")
    } else if (kullaniciTahmini < zarSayi || kullaniciTahmini > zarSayi) {
        println("Maalesef bilemediniz. Zar $zarSayi gelmişti.")
    } else {
        println("Tebrikler! Zar $zarSayi geldi ve doğru bildiniz.")
    }

}