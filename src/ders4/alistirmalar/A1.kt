package ders4.alistirmalar

fun main() {

    val yas = 18
    val egitimTamam = true

    if (yas >= 18) {
        println("Yaşınız tutuyor.")
    } else {
        println("Yaşınız ehliyet almak için uygun değil.")
    }

    if (yas >= 18 && egitimTamam) {
        println("Kaydınız Onaylandı.")
    } else {
        println("Kayıdınız Reddedildi.")
    }


}