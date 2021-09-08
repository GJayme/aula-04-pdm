package br.edu.ifsp.ads.pdm.trykotlin

import java.lang.NullPointerException

fun main() {
    var nome: String
    nome = "Gabriel"

    var sobrenome: String?
    sobrenome = "null"

    var sn: String
    sn = sobrenome?: "Jayme"

    println("${nome.count()}")

    try {
        println("${sobrenome!!.count()}")
        println("${sobrenome!!.length}")
    } catch (npe: NullPointerException) {

    }





}