package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class funcionario(
    name:String,
    cpf:String,
    val salario: BigDecimal,

) : Pessoa(name, cpf) {
    abstract fun calcAuxilio():
}