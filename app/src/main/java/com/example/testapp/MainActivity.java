package com.example.testapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button bashplay;
    Button bdougplay;
    Button bdylanplay;
    Button bmattplay;
    Button bmaxplay;
    Button bseandornplay;
    Button bseandoranplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bashplay = (Button) findViewById(R.id.ash);
        final MediaPlayer mP1 = MediaPlayer.create(MainActivity.this, R.raw.ahh);
        bashplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mP1.isPlaying()){
                    mP1.pause();
                    bashplay.setBackgroundResource(R.drawable.ashplay);
                }
                else{
                    mP1.start();
                    bashplay.setBackgroundResource(R.drawable.ashpause);
                }
            }
        });

        bdougplay = (Button) findViewById(R.id.doug);
        final MediaPlayer mP2 = MediaPlayer.create(MainActivity.this, R.raw.fuckfuck);
        bdougplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mP2.isPlaying()){
                    mP2.pause();
                    bdougplay.setBackgroundResource(R.drawable.dougplay);
                }
                else{
                    mP2.start();
                    bdougplay.setBackgroundResource(R.drawable.dougpause);
                }
            }
        });


        bdylanplay = (Button) findViewById(R.id.dylan);
        final MediaPlayer mP3 = MediaPlayer.create(MainActivity.this, R.raw.jesusfuckingchrist);
        bdylanplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mP3.isPlaying()){
                    mP3.pause();
                    bdylanplay.setBackgroundResource(R.drawable.dylanplay);
                }
                else{
                    mP3.start();
                    bdylanplay.setBackgroundResource(R.drawable.dylanpause);
                }
            }
        });

        bmattplay = (Button) findViewById(R.id.matt);
        final MediaPlayer mP4 = MediaPlayer.create(MainActivity.this, R.raw.ohgodohfuck);
        bmattplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mP4.isPlaying()){
                    mP4.pause();
                    bmattplay.setBackgroundResource(R.drawable.mattplay);
                }
                else{
                    mP4.start();
                    bmattplay.setBackgroundResource(R.drawable.mattpause);
                }
            }
        });

        bmaxplay = (Button) findViewById(R.id.max);
        final MediaPlayer mP5 = MediaPlayer.create(MainActivity.this, R.raw.ohgodohgodohfuck);
        bmaxplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mP5.isPlaying()){
                    mP5.pause();
                    bmaxplay.setBackgroundResource(R.drawable.maxplay);
                }
                else{
                    mP5.start();
                    bmaxplay.setBackgroundResource(R.drawable.maxpause);
                }
            }
        });

        bseandornplay = (Button) findViewById(R.id.seandorn);
        final MediaPlayer mP6 = MediaPlayer.create(MainActivity.this, R.raw.ohohno);
        bseandornplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mP6.isPlaying()){
                    mP6.pause();
                    bseandornplay.setBackgroundResource(R.drawable.seandornplay);
                }
                else{
                    mP6.start();
                    bseandornplay.setBackgroundResource(R.drawable.seandornpause);
                }
            }
        });

        bseandoranplay = (Button) findViewById(R.id.seandoran);
        final MediaPlayer mP7 = MediaPlayer.create(MainActivity.this, R.raw.shitno);
        bseandoranplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mP7.isPlaying()){
                    mP7.pause();
                    bseandoranplay.setBackgroundResource(R.drawable.seandoranplay);
                }
                else{
                    mP7.start();
                    bseandoranplay.setBackgroundResource(R.drawable.seandoranpause);
                }
            }
        });

    }
}