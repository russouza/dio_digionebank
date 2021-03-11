//Curso Kotlin DIO
package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Rubens Souza"
    var cpf: String = "196.196.106-80" // Seria alterável
    private set // Protege contra alterações.

    constructor() //construtor padrão

    fun pessoalInfo() = "$nome e $cpf"

    inner class Endereco {
        var rua: String = "Rua São Paulo"
        var nro: String =  "931"
    }

}

fun main() {
    val john = Pessoa()
    //john.cpf = "192.192.292-90"  // private set impede de isso ser aceito

    println(john)
    println(john.nome)
    println(john.cpf)
    println(john.Endereco().rua +", " + john.Endereco().nro)

    println(john.pessoalInfo())

    val rubens = Pessoa()
    println(rubens.pessoalInfo())
}