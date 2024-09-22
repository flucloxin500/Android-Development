package com.flucloxin.simplecalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textresult;
    int x,y,z;
    int plus,minus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textresult = findViewById(R.id.textresult);

        x=8;
        y=25;
        z=68;

         plus = x+y+z;
         minus = (z-x)+y;

        textresult.setText("Plus = "+plus+"\nMinus = "+minus);

    }
}