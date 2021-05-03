package model

class User (
    val email: String,
    val senha: String,
    ) {

    fun validarEmail() : Boolean {
        return email != ""
    }

    fun validarSenha() : Boolean{
        return senha != "" && senha.length >= 6
    }

    override fun toString(): String {
        return super.toString()
    }
}