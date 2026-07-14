package ders4

fun main() {
    val karanlikModAktif = true

    val arkaPlanRengi =
        if (karanlikModAktif == true) {
            "#000000 - Siyah"
        } else {
            "#FFFFFF - Beyaz"
        }

    println("Arka Plan rengi: $arkaPlanRengi")
}