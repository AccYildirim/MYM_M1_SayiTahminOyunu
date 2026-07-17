package ders5

fun main() {
    val hedefSayi = (1..100).random()

    println("🎆🎆🎆🎆🎆---SAYI-TAHMİN-OYUNUNA-HOŞ-GELDİNİZ---🎆🎆🎆🎆🎆")
    println("Sayı Tahminim: ")

    val kullaniciTahmini = readln().toIntOrNull()

    val mesaj =
        if (kullaniciTahmini == null) {
            "HATA: Lütfen Geçerli Bir Sayı Giriniz! 🫩"
        } else if (kullaniciTahmini < 1 || kullaniciTahmini > 100) {
            "HATA: Lütfen 1 İle 100 Arasında Bir Rakam Giriniz! 😤"
        } else if (kullaniciTahmini < hedefSayi) {
            "Daha Büyük Bir Sayı Denemeliydin! 😢 (Sayı $hedefSayi idi.)"
        } else if (kullaniciTahmini > hedefSayi) {
            "Daha Küçük Bir Sayı Denemeliydin! 😢 (Sayı $hedefSayi idi.)"
        } else {
            "😀😀😀🎉🎉🎉TEBRİKLER ADAMIM, SAYIYI BULDUN!!!🎉🎉🎉😀😀😀 (Hile Mi Açtın Yoksa?🤨)"
        }
    println(mesaj)

}