package ders2

fun main() {

    //Senaryo: Satın almak istediğiniz bir ürünü düşünerek bir ürün kartı verisi oluşturacağız.
    //
    //Ürün adı (String), almak istediğiniz adet (Int), ürünün birim fiyatı (Double) ve ürünün
// kargo bedava kampanyasına dahil olup olmadığı (Boolean) bilgilerini değişkenlere atayın.
    //adet ve birimFiyat değişkenlerini çarparak araToplam değerini hesaplayın.
    //Tüm bu bilgileri okunaklı bir formatta println kullanarak konsola yazdırın.
    //Deneyin: Boolean değerinizi false yapıp çıktının nasıl değiştiğini gözlemleyin.
    //Geliştirme: Değişkenlerden bazılarının tipini açıkça yazın, bazılarında ise tip çıkarımını
// kullanarak Kotlin’in otomatik atamasını test edin.

    val urun = "Lenovo"
    var adet = 1
    val birimFiyati = 99.999
    val kargoUcretsizMi = true

    val araToplam = adet*birimFiyati

    println("Ürün: " + urun)
    println("Adet: " + adet)
    println("Fiyatı: " + birimFiyati)
    println("Kargo ücretsiz mi? " + kargoUcretsizMi)







}