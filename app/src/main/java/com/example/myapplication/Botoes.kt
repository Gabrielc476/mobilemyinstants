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
        mediaplayer : MediaPlayer,
        context:Context
        ){
        var mp = mediaplayer
        botao1.setOnClickListener{
            if(mp.isPlaying){

                mp.stop()
                mp = MediaPlayer.create(context, R.raw.ricardo1)
                mp.seekTo(0)
                mp.start()
            }
            if(!mp.isPlaying){
                mp = MediaPlayer.create(context, R.raw.ricardo1)
                mp.start()
            }
        }
        botao2.setOnClickListener{
            if(mp.isPlaying){

                mp.stop()
                mp = MediaPlayer.create(context, R.raw.ricardo2)
                mp.seekTo(0)
                mp.start()
            }
            if(!mp.isPlaying){
                mp = MediaPlayer.create(context, R.raw.ricardo2)
                mp.start()
            }
        }
        botao3.setOnClickListener{
            if(mp.isPlaying){

                mp.stop()
                mp = MediaPlayer.create(context, R.raw.ricardo3)
                mp.seekTo(0)
                mp.start()
            }
            if(!mp.isPlaying){
                mp = MediaPlayer.create(context, R.raw.ricardo3)
                mp.start()
            }
        }
        botao4.setOnClickListener{
            if(mp.isPlaying){

                mp.stop()
                mp = MediaPlayer.create(context, R.raw.ricardo4)
                mp.seekTo(0)
                mp.start()
            }
            if(!mp.isPlaying){
                mp = MediaPlayer.create(context, R.raw.ricardo4)
                mp.start()
            }
        }
        botao5.setOnClickListener{
            if(mp.isPlaying){

                mp.stop()
                mp = MediaPlayer.create(context, R.raw.ricardo5)
                mp.seekTo(0)
                mp.start()
            }
            if(!mp.isPlaying){
                mp = MediaPlayer.create(context, R.raw.ricardo5)
                mp.start()
            }
        }
        botao6.setOnClickListener{
            if(mp.isPlaying){

                mp.stop()
                mp = MediaPlayer.create(context, R.raw.ricardo6)
                mp.seekTo(0)
                mp.start()
            }
            if(!mp.isPlaying){
                mp = MediaPlayer.create(context, R.raw.ricardo6)
                mp.start()
            }
        }
    }

}