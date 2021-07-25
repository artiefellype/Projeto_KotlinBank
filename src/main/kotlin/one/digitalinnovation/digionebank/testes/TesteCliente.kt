package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main (){
    val joao = Cliente(
        name = "Joaozinho carrara",
        cpf = "2424242424-24",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"

    )

    println(joao)

    TesteAutenticacao().autentica(joao)
}
