package one.digitalinnovation.digionebank

class Gerente(
    name: String,
    cpf: String,
    salario: Double,
    senha: String
): Funcionario(name, cpf, salario) {
    override fun calcAuxilio(): Double = salario * 0.4

    override fun login(senha: String): Boolean = "senha123" == senha
}