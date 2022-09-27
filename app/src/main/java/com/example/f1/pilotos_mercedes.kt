package com.example.f1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pilotos_mercedes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilotos_mercedes)
        val george_russell = findViewById<Button>(R.id.lando_norris)
        george_russell.setOnClickListener {
            irParaGeorgeRussell()
        }
        val lewis_hamilton = findViewById<Button>(R.id.daniel_ricciardo)
        lewis_hamilton.setOnClickListener {
            irParaLewis()
        }
    }

    private fun irParaGeorgeRussell(){
        val intent= Intent(this@pilotos_mercedes,george_russel::class.java)
        startActivity(intent)
    }
    private fun irParaLewis(){
        val intent = Intent(this@pilotos_mercedes,lewis_haminto::class.java)
        startActivity(intent)
    }
}