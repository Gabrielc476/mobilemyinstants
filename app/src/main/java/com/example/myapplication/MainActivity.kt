package com.example.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mp : MediaPlayer = MediaPlayer.create(this, R.raw.ricardo1)
        val botao1 : Button = findViewById(R.id.botao1)
        val botao2 : Button = findViewById(R.id.botao2)
        val botao3 : Button = findViewById(R.id.botao3)
        val botao4 : Button = findViewById(R.id.botao4)
        val botao5 : Button = findViewById(R.id.botao5)
        val botao6 : Button = findViewById(R.id.botao6)

        val botoes : Botoes = Botoes()
        botoes.setListeners(botao1,botao2,botao3,botao4,botao5,botao6,mp,this)


    }
}