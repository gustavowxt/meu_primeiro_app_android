package model

class Carro (
    val nome: String,
    val numeroDoChassi: String,
    val ano: Int,
    val cor: CarroCor
) : Automovel() {

    override fun acelerar() {
        println("MEU CARRO $nome está acelerando")
    }

    private fun frear(){
        println("$nome parando....")
    }

    fun buscarDescricaoCompleta() : String{
        frear()
        return "$nome ---- $numeroDoChassi ----- $ano ----- $cor"
    }


}