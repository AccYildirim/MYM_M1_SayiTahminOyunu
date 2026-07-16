package ders5

fun main() {
    val hedefSayi = (1..100).random()

    println("🎆🎆🎆🎆🎆---SAYI-TAHMİN-OYUNUNA-HOŞ-GELDİNİZ---🎆🎆🎆🎆🎆")
    println("Sayı Tahminim: ")

    val kullaniciTahmini = readln().toIntOrNull()

    if (kullaniciTahmini == null) {
        println("HATA: Lütfen Geçerli Bir Sayı Giriniz! 🫩")
    } else if (kullaniciTahmini < 1 || kullaniciTahmini > 100) {
        println("HATA: Lütfen 1 İle 100 Arasında Bir Rakam Giriniz! 😤")
    } else if (kullaniciTahmini < hedefSayi) {
        println("Daha Büyük Bir Sayı Denemeliydin! 😢 (Sayı $hedefSayi idi.)")
    } else if (kullaniciTahmini > hedefSayi) {
        println("Daha Küçük Bir Sayı Denemeliydin! 😢 (Sayı $hedefSayi idi.)")
    } else {
        println("😀😀😀🎉🎉🎉TEBRİKLER ADAMIM, SAYIYI BULDUN!!!🎉🎉🎉😀😀😀 (Hile Mi Açtın Yoksa?🤨) ")
    }


}