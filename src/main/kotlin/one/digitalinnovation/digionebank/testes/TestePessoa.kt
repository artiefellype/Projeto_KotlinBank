package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa
import one.digitalinnovation.digionebank.funcionario
import java.math.BigDecimal

fun main(){
    val artie = Pessoa(name = "Arthur Felipe", cpf = "192.168.234.23")
    println(artie.name)
    println(artie.cpf)

    val joaozinho = funcionario(name = "Joao da silva", cpf = "192.134.758-94", salario = BigDecimal(1600.00))
    println(joaozinho.name)
    println(joaozinho.cpf)
    println("R$ ${joaozinho.salario}")
}