package com.example.ac_devmobile
import android.content.Intent
import android.widget.Button


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.CasaHogwarts.Contadores
import com.example.casahogwarts.R

class Tela4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela4)

        val botao = findViewById<Button>(R.id.botao)
        botao.setOnClickListener {
            val maiorVariavel = maxOf(
                Contadores.sonserina,
                Contadores.corvinal,
                Contadores.lufalufa,
                Contadores.grifinoria
            )
            when (maiorVariavel) {
                Contadores.sonserina -> startActivity(Intent(this, Tela5::class.java))
                Contadores.corvinal -> startActivity(Intent(this, Tela6::class.java))
                Contadores.lufalufa -> startActivity(Intent(this, Tela7::class.java))
                Contadores.grifinoria -> startActivity(Intent(this, Tela8::class.java))
            }
        }
    }
}