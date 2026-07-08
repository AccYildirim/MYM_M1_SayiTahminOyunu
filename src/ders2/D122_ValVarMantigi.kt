package ders2

fun main() {
    val uygulamaAdi = "Hava Durumu Pro"
    // uygulamaAdi = "Hava Durumu Pro v2" (Hata alırız, çünkü val olan bir değişkene yeniden değer atanamaz.)

    var indirimOrani = 10
    indirimOrani = 15  // (var türünde bir değişken olduğu için değer atanabilir)

    println("Uygulama Adı: " + uygulamaAdi)
    println("İndirim Oranı: " + indirimOrani)

}