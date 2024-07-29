package com.example.cc3087_lab3

class Burger(name: String, price: Double) : Food(name, price) {
    override fun cook(): String {
        return "Para cocinar la hamburguesa $name se debe de colocar la torta de carne encima del azador." +
                "Luego, colocarla sobre el pan y agregar los condimentos deseados"
    }
}

