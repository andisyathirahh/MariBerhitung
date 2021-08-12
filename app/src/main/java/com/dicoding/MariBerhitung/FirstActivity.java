package com.dicoding.MariBerhitung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button jawabanButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        jawabanButton=findViewById(R.id.jawaban);
        jawabanButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent intent = new Intent(FirstActivity.this, NumberTwoActivity.class);
                startActivity(intent);
            }
        });

        Button salah3Button=findViewById(R.id.salah3);
        salah3Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Coba lagi", Toast.LENGTH_LONG).show();
            }
        });

        Button salah4Button=findViewById(R.id.salah4);
        salah4Button.setOnClickListener(new View.OnClickListener() {

            @Override
        public void onClick(View v){
            Toast.makeText(getApplicationContext(), "Coba lagi", Toast.LENGTH_LONG).show();
        }
        });

        Button salah5Button=findViewById(R.id.salah5);
        salah5Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Coba lagi", Toast.LENGTH_LONG).show();
            }
        });
    }
}
