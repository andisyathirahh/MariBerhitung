package com.dicoding.MariBerhitung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NumberTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button benar2Button=findViewById(R.id.benar2);
        benar2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(NumberTwoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button salah3Button=findViewById(R.id.salah6);
        salah3Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Coba lagi", Toast.LENGTH_LONG).show();
            }
        });

        Button salah4Button=findViewById(R.id.salah7);
        salah4Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Coba lagi", Toast.LENGTH_LONG).show();
            }
        });

        Button salah5Button=findViewById(R.id.salah8);
        salah5Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Coba lagi", Toast.LENGTH_LONG).show();
            }
        });
    }
}
