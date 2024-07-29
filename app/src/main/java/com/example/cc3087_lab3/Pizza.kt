package com.example.cc3087_lab3

class Pizza (name: String, price: Double) : Food(name, price) {
    override fun cook(): String {
        return "Para hornear la pizza de $name se debe de agregar los ingredientes deseados y luego colocar la masa en el horno." +
                "Luego de 20 minutos, sacar la pizza y partirla en 8 pedazos."
    }

}