package ders3.alistirmalar

fun main() {
    println("Lütfen Adınızı Giriniz:")
    val isim = readln()

    println("Lütfen boyunuzu cm cinsinden giriniz")
    val boy = readln().toDouble()

    println("Lütfen kilonuzu giriniz")
    val kilo = readln().toDouble()

    val boyMetre = boy / 100
    val vucutKitleIndeksi = kilo / (boyMetre * boyMetre)
    println("Vücut Kitle İndeksiniz: $vucutKitleIndeksi")
}