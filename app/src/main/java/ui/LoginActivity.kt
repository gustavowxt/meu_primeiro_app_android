package ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import br.com.brq.loginteste.R
import com.google.android.material.snackbar.Snackbar
import model.*

class LoginActivity : AppCompatActivity() {
    lateinit var btnLogin : Button
    lateinit var tituloView : TextView
    lateinit var editTextEmail: EditText
    lateinit var editTextSenha: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
        carregarElementos()
        carregarEventos()


        
        val vende = Vendedor()
        val cliente = Cliente()

        vende.falar()


//       private fun carregarElementos(){
//           btnLogin = findViewById(R.id.button_login)
//           tituloView = findViewById(R.id.textView)
//           editTextEmail = findViewById(R.id.editTextEmail)
//           editTextSenha = findViewById(R.id.editTextSenha)
//       }
//
//        private fun carregarEventos(){
//            btnLogin.setOnClickListener {  }
//        }


//        val carro = Carro(nome = "Celta", ano = 2015, numeroDoChassi = "ABABABABA", cor = CarroCor.PRETO)
//
//        carro.acelerar()
//
//        println(carro.toString())
//
//        val descricaoDoCarro = carro.buscarDescricaoCompleta()
//
//        print(descricaoDoCarro)


        // valor do email
//        val user = User(nome = "Gustavo", email = "gustavowxt@gmail.com", senha = "123", idade = 23)
//
//        if (user.validarEmail()) {
//            println("EMAIL VALIDADO TRUE")
//        } else {
//            println("EMAIL INVALIDO FALSE")
//        }
//
//        user.addIdade(novaIdade = 5)
//
//        println(user.idade)


    }



    //CARREGA EM VARIAVEIS OS COMPONENTES DA TELA

    private fun carregarElementos() {

        btnLogin = findViewById(R.id.button_login)
        tituloView = findViewById(R.id.TextViewTitulo)
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextSenha = findViewById(R.id.editTextSenha)
    }

    private fun carregarEventos() {
        btnLogin.setOnClickListener {
//            val intent = Intent(this, PrincipalActivity::class.java)
//            startActivity(intent)

            val email = editTextEmail.text.toString()
            val senha = editTextSenha.text.toString()

            val user = User(email = email, senha = senha)

            tituloView.text = "Novo titulo"
            Snackbar.make(it, tituloView.text, Snackbar.LENGTH_SHORT)
                .show()
        }
    }

}
