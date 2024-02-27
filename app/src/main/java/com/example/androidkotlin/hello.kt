package com.example.androidkotlin

data class Biodata(
    val nama: String,
    val jenisKelamin: String,
    val hobi: List<String>,
    val citaCita: String,
    val agama: String
)

fun main() {
    val arisatya = Biodata(
        nama = "Arisatya Abhirama",
        jenisKelamin = "Laki-laki",
        hobi = listOf("Basket", "Ndengarkan musik"),
        citaCita = "Bisa buat game sendiri",
        agama = "Islam"
    )

    println("Nama: ${arisatya.nama}")
    println("Jenis Kelamin: ${arisatya.jenisKelamin}")
    println("Hobi: ${arisatya.hobi.joinToString(", ")}")
    println("Cita-cita: ${arisatya.citaCita}")
    println("Agama: ${arisatya.agama}")
}