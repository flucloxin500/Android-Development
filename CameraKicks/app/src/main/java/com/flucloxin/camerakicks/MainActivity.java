package com.flucloxin.camerakicks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity {

    Button clickButton;
    TextView tvDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        clickButton = findViewById(R.id.clickButton);
        tvDisplay = findViewById(R.id.tvDisplay);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvDisplay.setText("Haya! is working actually?");
            }
        });


        tvDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton.setText("yeah, This Button also working too!");
            }
        });





    }
}