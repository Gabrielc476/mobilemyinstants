package com.example.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun play(mp:MediaPlayer){
            mp.start()
        }
        fun pause(mp:MediaPlayer){
            mp.stop()
        }
        val botao1 : Button = findViewById(R.id.botao1)
        botao1.setOnClickListener{

            if()

            

        }



    }
}