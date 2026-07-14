package ders2.alistirmalar

fun main() {

    val urunAdi: String = "Dior Allık"
    val adet: Int = 3
    val birimFiyat: Double = 2399.99
    val stoktaVar: Boolean = true
    var toplamfiyat = adet * birimFiyat


    println("Alınan Ürün: $urunAdi")
    println("Adet: $adet")
    println("Birim Fiyatı: $birimFiyat")
    println("Stok Durumu: $stoktaVar")
    println("Toplam Ödenecek Tutar: $toplamfiyat")
    println("Sepet Tutarı %.2f TL".format(toplamfiyat))


}