package com.example.ac_devmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tela3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val botao1 = findViewById<Button>(R.id.button1)
        botao1.setOnClickListener {
            val intent = Intent(this@Tela3, Tela4::class.java)
            startActivity(intent)
            Contadores.lufalufa++

        }

        val botao2 = findViewById<Button>(R.id.button2)
        botao2.setOnClickListener {
            val intent = Intent(this@Tela3, Tela4::class.java)
            startActivity(intent)
            Contadores.grifinoria++
        }

        val botao3 = findViewById<Button>(R.id.button3)
        botao3.setOnClickListener {
            val intent = Intent(this@Tela3, Tela4::class.java)
            startActivity(intent)
            Contadores.corvinal++
        }

        val botao4 = findViewById<Button>(R.id.button4)
        botao4.setOnClickListener {
            val intent = Intent(this@Tela3, Tela4::class.java)
            startActivity(intent)
            Contadores.sonserina++
        }
    }
}