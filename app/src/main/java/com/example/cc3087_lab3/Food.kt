package com.example.cc3087_lab3

abstract class Food (val name: String, val price: Double) {
    abstract fun cook() : String
}