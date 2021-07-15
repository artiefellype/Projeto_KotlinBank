package one.digitalinnovation.digionebank

class Pessoa {
    var name:String = "Artie"

    var cpf:String = "123.456.789.09"
    private set 


}

fun main(){
    val artie = Pessoa()

    println(artie.name)
    println(artie.cpf)

}