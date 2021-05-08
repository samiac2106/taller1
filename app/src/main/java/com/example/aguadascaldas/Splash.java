package com.example.aguadascaldas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    MediaPlayer himno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        himno=MediaPlayer.create(this, R.raw.himno);
        himno.start();

        TimerTask inicio=new TimerTask() {
            @Override
            public void run() {
                Intent intent= new Intent(Splash.this, Home.class);
                startActivity(intent);
                finish();
            }
        };

        Timer tiempo= new Timer();
        tiempo.schedule(inicio, 10000);
    }

}

