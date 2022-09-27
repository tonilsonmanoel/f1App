package com.example.f1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pilotos_redbull : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilotos_redbull)
        val max_verstappen = findViewById<Button>(R.id.lando_norris)
        max_verstappen.setOnClickListener{
            irParaMaxVerstappen()
        }
        val sergio_perez = findViewById<Button>(R.id.daniel_ricciardo)
        sergio_perez.setOnClickListener {
            irParaSergioPerez()
        }
    }

    private fun irParaMaxVerstappen(){
        val intent = Intent(this@pilotos_redbull,max_verstappen::class.java)
        startActivity(intent)
    }
    private fun irParaSergioPerez(){
        val intent = Intent(this@pilotos_redbull,sergio_perez::class.java)
        startActivity(intent)
    }

}