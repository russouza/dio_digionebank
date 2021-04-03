package one.digitalinnovation.digionebank

class Gerente(
        nome: String,
        cpf: String,
        salario: Double,
        val senha: String
) : Funcionario(nome, cpf, salario), Logavel {
    override fun calculaAuxilio() = salario * 0.2
    override fun login(): Boolean = "senha123" == senha
    }

