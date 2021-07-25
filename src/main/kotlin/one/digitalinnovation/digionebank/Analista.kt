package one.digitalinnovation.digionebank

class Analista(

    name: String,
    cpf: String,
    salario: Double

) : Funcionario(name, cpf, salario) {

    override fun calcAuxilio() = salario * 0.1
}