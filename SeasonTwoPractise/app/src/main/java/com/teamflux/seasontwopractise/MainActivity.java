package com.teamflux.seasontwopractise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b207_1,b207_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b207_1 = findViewById(R.id.b207_1);
        b207_2 = findViewById(R.id.b207_2);

        b207_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, HW207_1.class);
                startActivity(myIntent);

            }
        });

        b207_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,HW207_2.class);
                startActivity(myIntent);
            }
        });
    }
}