package one.digitalinnovation.digionebank

class Pessoa {
    var name:String = "Artie"

    var cpf:String = "123.456.789.09"
    private set

    constructor()

    fun infoPerson() = "$name e $cpf"
}

fun main(){
    val artie = Pessoa()

    println(artie.infoPerson())

}