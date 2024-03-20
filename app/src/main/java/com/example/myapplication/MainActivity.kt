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
        var mp : MediaPlayer = MediaPlayer.create(this, R.raw.ricardo1) // criação do mediaplayer responsavel por reproduzir os audios
        // referencia dos botões dos audios e controles
        val botao1 : Button = findViewById(R.id.botao1)
        val botao2 : Button = findViewById(R.id.botao2)
        val botao3 : Button = findViewById(R.id.botao3)
        val botao4 : Button = findViewById(R.id.botao4)
        val botao5 : Button = findViewById(R.id.botao5)
        val botao6 : Button = findViewById(R.id.botao6)
        val playbutton : Button = findViewById(R.id.play_button)
        val pausebutton : Button = findViewById(R.id.pause_button)
        val stopbutton : Button = findViewById(R.id.stop_button)
        // referencia da classe que configura os eventos de onclick dos botões
        val botoes : Botoes = Botoes()
        //chamada da função dos onclick, ela recebe como parametro todos os botoes o mediaplayer e o context
        botoes.setListeners(botao1,botao2,botao3,botao4,botao5,botao6,playbutton,pausebutton,stopbutton,mp,this)


    }
}