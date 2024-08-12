package com.example.ac_devmobile
import android.widget.Button
import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

object Contadores {
    var sonserina = 0
    var grifinoria = 0
    var lufalufa = 0
    var corvinal = 0
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val botao = findViewById<Button>(R.id.botao)
        botao.setOnClickListener {
            val intent = Intent(this@MainActivity, Tela2::class.java)
            startActivity(intent)
        }


    }
}