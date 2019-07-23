package com.dicoding.MariBerhitung;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class AngkaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);

        ImageButton one = findViewById(R.id.angka_lima);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.lima);
        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });

        ImageButton two = findViewById(R.id.angka_empat);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.empat);
        two.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp1.start();
            }
        });

        final MediaPlayer mpTujuh = MediaPlayer.create(this, R.raw.tujuh);
        (findViewById(R.id.angka_tujuh)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpTujuh.start();
            }
        });

        final MediaPlayer mpsatu = MediaPlayer.create(this, R.raw.satu);
        (findViewById(R.id.angka_satu)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpsatu.start();
            }
        });

        final MediaPlayer mptiga = MediaPlayer.create(this, R.raw.tiga);
        (findViewById(R.id.angka_tiga)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mptiga.start();
            }
        });

        final MediaPlayer mpenam = MediaPlayer.create(this, R.raw.enam);
        (findViewById(R.id.angka_enam)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpenam.start();
            }
        });

        final MediaPlayer mpdel = MediaPlayer.create(this, R.raw.del);
        (findViewById(R.id.angka_del)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpdel.start();
            }
        });

        final MediaPlayer mpdua = MediaPlayer.create(this, R.raw.dua);
        (findViewById(R.id.angka_dua)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpdua.start();
            }
        });

        final MediaPlayer mpsem = MediaPlayer.create(this, R.raw.sem);
        (findViewById(R.id.angka_sem)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpsem.start();
            }
        });
    }




}
