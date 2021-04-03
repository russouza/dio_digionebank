package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {

    val joao = Analista(nome = "João Pedro", cpf = "123.233.124-45", salario = 2000.00)
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

    imprimeReport(joao)
}

fun imprimeReport(funcionario: Funcionario) = println(funcionario.toString())
/*
    val john = Pessoa(nome = "Rubens", cpf = "192.168.084-90")
    //john.cpf = "192.192.292-90"  // private set impede de isso ser aceito

    //println(john)
    println(john.nome)
    println(john.cpf)
    println(john.Endereco().rua +", " + john.Endereco().nro)

    println(john.pessoalInfo())

    val rubens = Pessoa(john.nome,john.cpf)
    println(rubens.pessoalInfo())

    val marcio = Funcionario(nome = "Marcio Petenusso", cpf = "192.163.098-09", BigDecimal.valueOf(2000.0))
    println(marcio.nome + " - " + marcio.cpf + " - " + marcio.salario)
*/
