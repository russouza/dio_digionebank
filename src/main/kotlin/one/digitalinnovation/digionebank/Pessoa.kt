package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Rubens Souza"
    var cpf: String = "196.196.106-80"
}

fun main() {
    val john = Pessoa()

    println(john.nome)
    println(john.cpf)
}