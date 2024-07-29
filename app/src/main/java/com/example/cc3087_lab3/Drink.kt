package com.example.cc3087_lab3

abstract class Drink (name: String, precio: Double) : Food(name,precio) {

    override fun cook(): String {
        return "La bebida $name ha sido cocinada"
    }

    abstract fun pour() : String


}