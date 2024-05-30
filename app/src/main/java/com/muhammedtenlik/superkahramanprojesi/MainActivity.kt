package com.muhammedtenlik.superkahramanprojesi

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun superkahramanyap(view:View){
        val isim=findViewById<TextView>(R.id.isimText)
        val yas =findViewById(R.id.yasText) as TextView
        val meslek=findViewById(R.id.meslekText) as TextView
        val sonucText=findViewById(R.id.sonucText) as TextView
        val superKahraman=SuperKahraman(isim.getText().toString(),yas.getText().toString(),meslek.getText().toString())
      //  sonucText.text="İsim: ${isim.getText()} Yaş: ${yas.getText()} Meslek: ${meslek.text}"
        sonucText.text="İsim: ${superKahraman.isim} Yaş: ${superKahraman.yas} Meslek: ${superKahraman.meslek}"
    }
}