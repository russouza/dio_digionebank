package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object { //método estático para ser invocado via classe não instancia
        fun imprime(classname: String, funcionario: Funcionario) {
            print(classname + ": ")
            println(
                    funcionario.toString()
            )
        }
    }
}