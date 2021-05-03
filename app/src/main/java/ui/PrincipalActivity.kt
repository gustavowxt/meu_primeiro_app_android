package ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.brq.loginteste.R

class PrincipalActivity : AppCompatActivity() {
    lateinit var btnTerceira : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("----- ON CREATE")

        setContentView(R.layout.activity_principal)
        carregarElementos()
        carregarEventos()

    }

        override fun onStart() {
            super.onStart()
            println("----- ON START")
        }

        override fun onResume() {
            super.onResume()
            println("----- ON RESUME")
        }

        override fun onRestart() {
            super.onRestart()
            println("----- ON RESTART")
        }

        override fun onPause() {
            super.onPause()
            println("----- ON PAUSE")
        }

        override fun onStop() {
            super.onStop()
            println("----- ON STOP")
        }

        override fun onDestroy() {
            super.onDestroy()
            println("----- ON DESTROY")
        }

        fun carregarElementos() {
            println("CARREGOU ELEMENTOS")
            btnTerceira = findViewById(R.id.button1)

        }

        fun carregarEventos() {
            println("CARREGOU EVENTOS")
            btnTerceira.setOnClickListener {
                val intent = Intent(this, TerceiraActivity::class.java)
                startActivity(intent)

            }
        }


    }
