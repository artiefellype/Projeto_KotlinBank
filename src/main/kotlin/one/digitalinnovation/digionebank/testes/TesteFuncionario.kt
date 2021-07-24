package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa
import one.digitalinnovation.digionebank.funcionario
import java.math.BigDecimal

fun main(){
    val jose = Pessoa(name = "josé da silva", cpf = "192.168.345-56")
    println(jose.name)
    println(jose.cpf)

    val amarilo = funcionario(name = "Amarilo da silva", cpf = "192.168.123-78", salario = BigDecimal(1600.00))
    println(amarilo.name)
    println(amarilo.cpf)
    println("R$ ${amarilo.salario}")
}