package com.dicoding.MariBerhitung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quis);

        Button benarButton=findViewById(R.id.benar);
        benarButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(QuisActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });

        Button salahButton=findViewById(R.id.salah);
        salahButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Coba lagi", Toast.LENGTH_LONG).show();
            }
        });

        Button salah1Button=findViewById(R.id.salah1);
        salah1Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Coba lagi", Toast.LENGTH_LONG).show();
            }
        });

        Button salah2Button=findViewById(R.id.salah2);
        salah2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Coba lagi", Toast.LENGTH_LONG).show();
            }
        });




    }
}
