package ders3.alistirmalar

fun main() {

    var ejderhaCani = 1000.0

    println("Kahraman adını giriniz")
    val kahramanAd = readln()

    println("Saldırı gücünü giriniz")
    var saldiriGucu = readln().toDouble()

    val kritikHasarBonusu = (10..50).random()
    saldiriGucu += kritikHasarBonusu

    ejderhaCani -= saldiriGucu
    val formatliEjderhaCani = "%.2f".format(ejderhaCani)

    println(
        """
        ---*SAVAŞ RAPORU*---
        
        Kahraman Adı: $kahramanAd
        Ejderhaya Verilen Hasar: $saldiriGucu
        Kritik Hasar: $kritikHasarBonusu
        Ejderhanın Kalan Canı: $formatliEjderhaCani
        
        
        
        
    """.trimIndent()
    )


}