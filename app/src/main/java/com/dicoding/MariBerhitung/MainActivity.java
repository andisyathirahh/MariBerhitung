package com.dicoding.MariBerhitung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button angkaButton=findViewById(R.id.angka);
        angkaButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, AngkaActivity.class);
                startActivity(intent);
            }
        });

        Button tambahButton=findViewById(R.id.tambah);
        tambahButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, TambahActivity.class);
                startActivity(intent);
            }
        });

        Button kurangButton=(Button)findViewById(R.id.kurang);
        kurangButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, KurangActivity.class);
                startActivity(intent);
            }
        });

        Button quizButton=(Button)findViewById(R.id.quis);
        quizButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, QuisActivity.class);
                startActivity(intent);
            }
        });
    }
}
