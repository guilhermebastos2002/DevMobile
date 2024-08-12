package com.example.casahogwarts

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.CasaHogwarts.Contadores
import com.example.ac_devmobile.Tela2
import com.example.ac_devmobile.Tela3

class Tela0 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela0)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val openWebsiteButton: Button = findViewById(R.id.openWebsiteButton)
        openWebsiteButton.setOnClickListener {
            val url = "https://www.wizardingworld.com/sorting-hat"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val botao = findViewById<Button>(R.id.button)
        botao.setOnClickListener {
            val intent = Intent(this@Tela0, Tela2::class.java)
            startActivity(intent)
        }
    }
}