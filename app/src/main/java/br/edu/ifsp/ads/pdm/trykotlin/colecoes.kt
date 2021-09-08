package br.edu.ifsp.ads.pdm.trykotlin

fun main() {
    var familia: List<String> = listOf("Gabriel", "Livia", "Luna", "Aslan", "Chica", "Tóta")

    // For
    for (integrante in familia) {
        println(integrante)
    }

    println("\n")

    // familia.add("Moranguinho") -> não da pra add pq List é imutável
    familia = listOf("Gabriel", "Livia", "Luna", "Aslan", "Chica", "Tóta", "Moranguinho")

    for (integrante in familia) {
        println(integrante)
    }

    println("\n")

    val listaInteiros: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10)
    for (i in 0..9) {
        println(listaInteiros[i])
    }

    println("\n")

    val listaInteiros2: List<Int> = (1..10 step 2).toList()
    for (i in 0..listaInteiros2.size - 1) {
        println(listaInteiros2[i])
    }

    println("\n")

    listaInteiros.forEach { println(it) }

    println("\n")

    val listaCursos: MutableList<String> = mutableListOf(
            "Análise e desenvolvimento de sistemas",
            "Sistemas para dispositivos móves"
    )
    listaCursos.add("Técnico em imformática para Internet")
    listaCursos.forEach { curso: String ->
        println(curso)
    }

    println("\n")

    val setCursos: MutableSet<String> = mutableSetOf("ADS", "SDM", "TII")
    setCursos.add("ADS")
    setCursos.add("SDM")
    setCursos.forEach { println(it) }

    val familiaMap: MutableMap<String, String> = mutableMapOf(
            Pair("Pai", "Gabriel"),
            Pair("Mãe", "Livia"),
            Pair("Gato", "Aslan"),
            Pair("Gata", "Luna")
    )

    familiaMap.put("Cachorro", "Chiquinha")
    familiaMap.keys.forEach { chave ->
        println("$chave: ${familiaMap[chave]}")
    }

    val hashMap: HashMap<String, String> = HashMap()
}