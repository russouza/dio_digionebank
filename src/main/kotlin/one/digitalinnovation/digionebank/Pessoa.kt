//Curso Kotlin DIO
package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Rubens Souza"
    var cpf: String = "196.196.106-80"

    inner class Endereco {
        var rua: String = "Rua São Paulo"
        var nro: String =  "931"
    }

}

fun main() {
    val john = Pessoa()

    println(john.nome)
    println(john.cpf)
    println(john.Endereco().rua +", " + john.Endereco().nro)
}