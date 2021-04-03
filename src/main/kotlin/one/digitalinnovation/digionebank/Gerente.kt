package one.digitalinnovation.digionebank

class Gerente(
        nome: String,
        cpf: String,
        salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calculaAuxilio() = salario * 0.2
}
