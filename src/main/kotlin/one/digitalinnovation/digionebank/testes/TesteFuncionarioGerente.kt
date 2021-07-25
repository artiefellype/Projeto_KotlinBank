package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val mariazinha = Gerente(name = "Maria de Oliveira", cpf = "192.168.123-78", salario = 1600.00, senha = "senha123")
    ImprimeRelatorioFuncioanrio.imprime(mariazinha)
}
