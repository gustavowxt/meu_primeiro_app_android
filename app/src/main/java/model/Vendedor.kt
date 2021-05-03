package model

class Vendedor : Pessoa() {

    override fun falar(){
       super.falar()
        println("Vendedor")
    }

}