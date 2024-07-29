package com.example.cc3087_lab3

class IceCream (name: String, price: Double) : Food(name, price), Dessert {
    override fun cook(): String {
        return "El helado de $name se debe enfriar colocandolo en una refrigeradora o en el freezer"

    }

    override fun eat(): String {
        return "El helado $name se ha comido"
    }

}