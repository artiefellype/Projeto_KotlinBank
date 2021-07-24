package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco
fun main(){
    val digiOneBank = Banco(name = "digiOne", number = 12)

    println(digiOneBank.name)
    println(digiOneBank.number)


    val Banco2 = digiOneBank.copy(name = "DigiTwo")

    println(Banco2.info())

}