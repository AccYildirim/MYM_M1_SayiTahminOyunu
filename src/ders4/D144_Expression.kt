package ders4

fun main() {
    val sicaklik = 15

    val uyari =
        if (sicaklik < 10) {
            "Hava soğuk. Mont giymenizi öneririm!"
        } else {
            "Hafif bir ceket yeterli olacaktır."
        }

    println("UYARI: $uyari")

}