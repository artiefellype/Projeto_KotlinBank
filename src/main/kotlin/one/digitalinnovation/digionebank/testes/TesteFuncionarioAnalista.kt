package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main(){
   val amarilo = Analista(name = "Amarilo da silva", cpf = "192.168.123-78", salario = 1600.00)
    ImprimeRelatorioFuncioanrio.imprime(amarilo)
}