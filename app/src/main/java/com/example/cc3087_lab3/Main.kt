package com.example.cc3087_lab3

/*
    Programador : Diego Rosales
    Lenguaje : Kotlin
    Fecha : 29/07/2024
    Ultima modificacion : 29/07/2024

 */


fun main(){
    val burger = Burger("De res", 35.0)
    val pizza = Pizza("Peperoni", 40.0)
    val iceCream = IceCream("chicle", 12.0)
    val juice = Juice("naranja", 10.0)

    println(burger.cook())
    println(pizza.cook())
    println(iceCream.cook())
    println(juice.cook())

    println(iceCream.eat())

    println("La hamburguesa a un 10% de descuento tiene un precio de: ${burger.discountedPrice(10.0)}")
}

fun Food.discountedPrice(discountPercentage: Double): Double {
    return price - (price * discountPercentage / 100)
}