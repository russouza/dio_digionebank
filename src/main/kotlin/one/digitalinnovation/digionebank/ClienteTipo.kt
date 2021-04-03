package one.digitalinnovation.digionebank

enum class ClienteTipo(val description: String) {
/*
As enum representam um conjunto fixo de valores, de uma forma mais ou menos autodocumentada.
Tornam o código mais explícito, mais legível, e menos vulnerável a erros de programação. ...
Enumerações podem definir comportamento (métodos) para as suas constantes, como em qualquer classe habitual
 */
    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");

    /*
    companion object {  // Função estática, acessa via classe e não via instância do objeto
        fun printDescription() = ClienteTipo.PF
    }
     */
}