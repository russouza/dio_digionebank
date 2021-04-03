package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.Gerente

fun main() {

    val joao = Gerente(nome = "Guilherme Alexandre", cpf = "123.233.124-45", salario = 2000.00, senha = "senha123")
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

    ImprimeRelatorioFuncionario.imprime("Manager",joao)
    TesteAutenticacao().autentica(joao)
}