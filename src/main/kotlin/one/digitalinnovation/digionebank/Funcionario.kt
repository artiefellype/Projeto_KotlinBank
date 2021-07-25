package one.digitalinnovation.digionebank

abstract class Funcionario(
    name:String,
    cpf:String,
    val salario: Double,

) : Pessoa(name, cpf) {
    protected abstract fun calcAuxilio(): Double

    override fun toString(): String = """
        nome: $name
        cpf: $cpf
        salario: $salario
        Auxilio: ${calcAuxilio()}
    """.trimIndent()
}

