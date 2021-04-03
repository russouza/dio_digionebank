//Curso Kotlin DIO
package one.digitalinnovation.digionebank

abstract class Pessoa(
    val nome: String,
    val cpf: String
) {
/*    private set // Protege contra alterações.

    constructor() //construtor primário
*/
    fun pessoalInfo() = "$nome e $cpf"

    inner class Endereco {
        var rua: String = "Rua São Paulo"
        var nro: String =  "931"
    }

}

