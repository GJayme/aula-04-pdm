package br.edu.ifsp.ads.pdm.trykotlin

fun retornaFuncao(x: Int): (String, String) -> String {
    val funcao = {a: String, b: String ->
        "${b+a}"
    }
    return if (x == 0) {
        ::concatena
    }
    else {
        a: String, b: String -> "${b+a}"
    }
}

fun processaTexto(
        str1: String,
        str2: String,
        processa: (String, String) -> String
) = processa(str1, str2)

fun concatena(a: String, b: String): String {
    return "${a + b}"
}

fun inverte(a: String, b: String) = "${a.reversed()}${b.reversed()}"

fun main() {
    val a = "Olá, "
    val b = "Mundo"
    val c = { a: String, b: String ->
        "${a.lowercase()+b.lowercase()}"
    }
    println(processaTexto(a, b, ::concatena))
    println(processaTexto(a, b, ::inverte))
    println(processaTexto(a, b, c))
    println(processaTexto(a, b, { s1, s2 ->
        "${s1.uppercase()+s2.lowercase()}"
    }))
    println(
        processaTexto(a, b) { s1, s2 ->
            "${s1.uppercase()+s2.lowercase()}"
        }
    )

    println(processaTexto(a, b, retornaFuncao(1)))
}