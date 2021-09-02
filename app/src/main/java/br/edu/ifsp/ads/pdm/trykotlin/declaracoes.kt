package br.edu.ifsp.ads.pdm.trykotlin

fun main() {
    // Declaração de variável
    var frase: String = "Hello, world!"
    println(frase)

    // Usando string templates
    println("$frase")
    println("${frase}")

    frase = "IFSP"

    // Acesso a funçoes ou propriedades
    println("Quantidade de caracteres: ${frase.count()}")
    println("Quantidade de caracteres: ${frase.length}")
}