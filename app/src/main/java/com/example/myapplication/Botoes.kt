package com.example.myapplication

import android.content.Context
import android.media.MediaPlayer
import android.widget.Button

class Botoes {
    fun setListeners(
        botao1: Button,
        botao2: Button,
        botao3: Button,
        botao4: Button,
        botao5: Button,
        botao6: Button,
        playbutton : Button,
        pausebutton : Button,
        stopbutton: Button,
        mediaplayer : MediaPlayer,
        context:Context,

        ){

        var mp = mediaplayer// criação de uma variavel que pode ser manipulada dentro da classe
        // criação dos onclick
        botao1.setOnClickListener{
            // checa se o mp está tocando
            if(mp.isPlaying){
                // se estiver, ele para o audio e troca pro audio que deve ser tocado agora, vai para o inicio e reproduz
                mp.stop()
                mp = MediaPlayer.create(context, R.raw.ricardo1)
                mp.seekTo(0)
                mp.start()
            }
            if(!mp.isPlaying){
                //se não estiver tocando ele coloca o audio do botão e reproduz
                mp = MediaPlayer.create(context, R.raw.ricardo1)
                mp.start()
            }
        }
        botao2.setOnClickListener{
            // checa se o mp está tocando
            if(mp.isPlaying){
                // se estiver, ele para o audio e troca pro audio que deve ser tocado agora, vai para o inicio e reproduz
                mp.stop()
                mp = MediaPlayer.create(context, R.raw.ricardo2)
                mp.seekTo(0)
                mp.start()
            }
            if(!mp.isPlaying){
                //se não estiver tocando ele coloca o audio do botão e reproduz
                mp = MediaPlayer.create(context, R.raw.ricardo2)
                mp.start()
            }
        }
        botao3.setOnClickListener{
            // checa se o mp está tocando
            if(mp.isPlaying){
                // se estiver, ele para o audio e troca pro audio que deve ser tocado agora, vai para o inicio e reproduz
                mp.stop()
                mp = MediaPlayer.create(context, R.raw.ricardo3)
                mp.seekTo(0)
                mp.start()
            }
            if(!mp.isPlaying){
                //se não estiver tocando ele coloca o audio do botão e reproduz
                mp = MediaPlayer.create(context, R.raw.ricardo3)
                mp.start()
            }
        }
        botao4.setOnClickListener{
            // checa se o mp está tocando
            if(mp.isPlaying){
                // se estiver, ele para o audio e troca pro audio que deve ser tocado agora, vai para o inicio e reproduz
                mp.stop()
                mp = MediaPlayer.create(context, R.raw.ricardo4)
                mp.seekTo(0)
                mp.start()
            }
            if(!mp.isPlaying){
                //se não estiver tocando ele coloca o audio do botão e reproduz
                mp = MediaPlayer.create(context, R.raw.ricardo4)
                mp.start()
            }
        }
        botao5.setOnClickListener{
            // checa se o mp está tocando
            if(mp.isPlaying){
                // se estiver, ele para o audio e troca pro audio que deve ser tocado agora, vai para o inicio e reproduz
                mp.stop()
                mp = MediaPlayer.create(context, R.raw.ricardo5)
                mp.seekTo(0)
                mp.start()
            }
            if(!mp.isPlaying){
                //se não estiver tocando ele coloca o audio do botão e reproduz
                mp = MediaPlayer.create(context, R.raw.ricardo5)
                mp.start()
            }
        }
        botao6.setOnClickListener{
            // checa se o mp está tocando
            if(mp.isPlaying){
                // se estiver, ele para o audio e troca pro audio que deve ser tocado agora, vai para o inicio e reproduz
                mp.stop()
                mp = MediaPlayer.create(context, R.raw.ricardo6)
                mp.seekTo(0)
                mp.start()
            }
            if(!mp.isPlaying){
                //se não estiver tocando ele coloca o audio do botão e reproduz
                mp = MediaPlayer.create(context, R.raw.ricardo6)
                mp.start()
            }
        }
        // funções de play, pausa e parada
        playbutton.setOnClickListener {
            mp.start()
        }
        pausebutton.setOnClickListener {
            mp.pause()
        }
        stopbutton.setOnClickListener {
            mp.stop()
            mp.seekTo(0)
        }
    }

}