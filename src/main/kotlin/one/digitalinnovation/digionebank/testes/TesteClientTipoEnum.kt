package one.digitalinnovation.digionebank.testes
//imports ------------------------------------------
import one.digitalinnovation.digionebank.ClienteTipo
//--------------------------------------------------
fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val Pf = ClienteTipo.PF

    println("${Pf.name} - ${Pf.descricao}")
}