package ders4

fun main() {
    print("Yaşınızı Giriniz: ")
    val yas = readln().toIntOrNull()
    println("Yaşınız: $yas")

    if (yas == null) {
        println("HATA: Lütfen Sadece Rakam Kullanarak Geçerli Bir Yaş Giriniz!")
    } else if (yas < 18) {
        println("Reşit değilsiniz. İşleme devam edemezsiniz!")
    } else {
        println("Reşitsiniz. İşleme devam edebilirsiniz.")
    }

}