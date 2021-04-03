package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Bank

fun main() {
    val digiOneBank = Bank(nome = "Bradesco", number = 237)

    println(digiOneBank.nome)
    println(digiOneBank.number)

    //digiOneBank.nome = "Next" //Dá erro pq VAL é imutável
    val banco2 = digiOneBank.copy(nome = "Next")

    println(banco2.nome)
    println(banco2.number)
}