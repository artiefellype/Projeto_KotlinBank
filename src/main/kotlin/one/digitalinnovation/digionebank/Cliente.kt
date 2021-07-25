package one.digitalinnovation.digionebank

class Cliente(
    name: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(name, cpf), logavel {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome: $name
        CPF: $cpf
        Tipo: $clienteTipo
    """.trimIndent()
}