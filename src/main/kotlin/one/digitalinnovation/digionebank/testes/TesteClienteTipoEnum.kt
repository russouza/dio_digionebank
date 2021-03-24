package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.description}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.description}")
    }

    val clientePF = ClienteTipo.PF
    println(">> ${clientePF.name} - ${clientePF.description}")

    val clientePJ = ClienteTipo.PJ
    println(">> ${clientePJ.name} - ${clientePJ.description}")
}