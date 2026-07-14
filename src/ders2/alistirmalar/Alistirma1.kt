package ders2.alistirmalar

fun main() {
    val uygulamaAdi = "Notlarım"
    val surumKodu = "1.0"

    var aktifKullaniciSayisi = 250

    println("Uygulama adı: " + uygulamaAdi)
    println("Sürüm kodu: " + surumKodu)
    println("Aktif kullanıcı sayısı: " + aktifKullaniciSayisi)

    aktifKullaniciSayisi += 40
    println("Güncel aktif kullanıcı sayısı: " + aktifKullaniciSayisi)

    aktifKullaniciSayisi -= 25
    println("Güncel aktif kullanıcı sayısı: " + aktifKullaniciSayisi)
}