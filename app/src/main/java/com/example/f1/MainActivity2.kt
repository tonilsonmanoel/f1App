package com.example.f1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val pilotos_redbull = findViewById<Button>(R.id.pilotos_redbull)
        pilotos_redbull.setOnClickListener {
            irParaRedbull()
        }
        val pilotos_mercedes = findViewById<Button>(R.id.pilotos_mercedes)
        pilotos_mercedes.setOnClickListener {
            irParaMercedes()
        }
        val mclaren= findViewById<Button>(R.id.pilotos_mclaren)
        mclaren.setOnClickListener {
            irParaMclaren()
        }
    }

    private fun irParaRedbull(){
        val intent = Intent(this@MainActivity2,pilotos_redbull::class.java)
        startActivity(intent)
    }
    private fun irParaMercedes (){
        val intent = Intent(this@MainActivity2,pilotos_mercedes::class.java)
        startActivity(intent)
    }
    private fun irParaMclaren(){
        val intent = Intent(this@MainActivity2,pilotos_mclaren::class.java)
        startActivity(intent)
    }
}