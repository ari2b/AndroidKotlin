package com.example.androidkotlin

class House {
    val houseColor:String = "red"
    val numberOfWindows:Int = 2
    val isforSale:Boolean = false

    fun updateColor(){

    }

    fun putOnSale(){

    }
}

fun main(){
    val A1 = House()
    val A2 = House()
    val A3 = House()

    println(A1.houseColor)
    println("=".repeat(n = 20))
    println(A2.numberOfWindows)
    println("=".repeat(n = 20))
    println(A3.isforSale)
}