package one.digitalinnovation.digionebank

enum class ClienteTipo(val description: String) {

    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");

    /*
    companion object {  // Função estática, acessa via classe e não via instância do objeto
        fun printDescription() = ClienteTipo.PF
    }
     */
}