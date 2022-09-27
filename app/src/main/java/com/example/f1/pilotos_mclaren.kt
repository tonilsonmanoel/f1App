package com.example.f1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pilotos_mclaren : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilotos_mclaren)
        val lando_norris = findViewById<Button>(R.id.lando_norris)
        lando_norris.setOnClickListener {
            irParaLandoNorris()
        }
        val daniel_ricciardo = findViewById<Button>(R.id.daniel_ricciardo)
        daniel_ricciardo.setOnClickListener {
            irParaDanielRicciardo()
        }
    }
    private fun irParaLandoNorris(){
        val intent = Intent(this@pilotos_mclaren,lando_norris::class.java)
        startActivity(intent)
    }
    private fun irParaDanielRicciardo(){
        val intent = Intent(this@pilotos_mclaren,daniel_ricciardo::class.java)
        startActivity(intent)
    }

}