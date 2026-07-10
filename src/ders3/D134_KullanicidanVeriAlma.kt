package ders3

fun main() {
    print("Adını Gir: ")
    val isim = readln()

    print("Kilonu Gir: ")
    val dunyaKilosu = readln().toDouble()

    println("Adınız: $isim, Dünyadaki Kilonuz: $dunyaKilosu kg")

    val marsKilosu = dunyaKilosu * 0.38
    val formatliMarsKilosu = "%.2f".format(marsKilosu)
    println("Marstaki Kilonuz: $formatliMarsKilosu kg")
}