package br.ulbra.exemplo1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val botao2 = findViewById<Button>(R.id.meuSegundoBotao)
        botao2.setOnClickListener {
            Toast.makeText(
                this,
                "Você clicou no outro botão!",
                Toast.LENGTH_SHORT
            ).show()
        }

        val botao = findViewById<Button>(R.id.meuBotao)
        val editText = findViewById<EditText>(R.id.meuEditText)

        botao.setOnClickListener {
            val texto = editText.text.toString()
            Toast.makeText(
                this,
                "Você digitou: $texto",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
