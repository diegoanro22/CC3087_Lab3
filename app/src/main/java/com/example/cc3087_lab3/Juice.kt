package com.example.cc3087_lab3

class Juice (name: String, price: Double) : Drink(name, price) {
    override fun pour(): String {
        return "El jugo $name se debe verter en un vaso vacio y con mucho cuidado"
    }
    override fun cook(): String {
        return "El jugo de $name se debe exprimir con ambas manos procurando sacar todo el jugo."
    }

}