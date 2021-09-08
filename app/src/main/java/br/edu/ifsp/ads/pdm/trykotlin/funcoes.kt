package br.edu.ifsp.ads.pdm.trykotlin

fun multiplo(a: Int = 10, b:Int) = a % b == 0

infix fun Int.multiploo(b: Int): Boolean {
    return multiplo(this, b)
}

fun main() {
    println(multiplo(10,2))
    println(10.multiploo(2))
    println(11.multiploo(2))
    println(12 multiploo(2))
    println(13 multiploo 2)

    println(multiplo(b = 2))
}