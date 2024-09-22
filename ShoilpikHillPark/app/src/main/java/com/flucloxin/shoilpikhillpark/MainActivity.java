package com.flucloxin.shoilpikhillpark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button bParking,bMosque,bBackyard,bLift,bFloor,bRooftop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bParking = findViewById(R.id.bParking);
        bMosque = findViewById(R.id.bMosque);
        bBackyard = findViewById(R.id.bBackyard);
        bLift = findViewById(R.id.bLift);
        bFloor = findViewById(R.id.bFloor);
        bRooftop = findViewById(R.id.bRooftop);



        bParking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent myintent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(myintent);

            }
        });

    }
}