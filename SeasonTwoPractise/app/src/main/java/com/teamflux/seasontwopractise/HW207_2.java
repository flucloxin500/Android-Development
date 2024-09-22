package com.teamflux.seasontwopractise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HW207_2 extends AppCompatActivity {

    TextView tresulttemp,tresulttemp2;
    EditText edfar,edkel;
    Button bkelvin,bcelcius;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw207_2);

        tresulttemp = findViewById(R.id.tresulttemp);
        tresulttemp2 = findViewById(R.id.tresulttemp2);
        edfar = findViewById(R.id.edfar);
        edkel = findViewById(R.id.edkel);
        bkelvin = findViewById(R.id.bkelvin);
        bcelcius = findViewById(R.id.bcelcius);


        bkelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sFarenhait = edfar.getText().toString();
                float farenhait = Float.parseFloat(sFarenhait);

                float kelvin = (float) ((farenhait - 32.00)*5/9+273.15);

                tresulttemp.setText("Your Kelvin Temp is : "+kelvin);

            }
        });

        bcelcius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sKelvin = edkel.getText().toString();
                float kelvin = Float.parseFloat(sKelvin);

                float celcius = (float) (( kelvin - 273.1));

                tresulttemp2.setText("Your Kelvin Temp is : "+celcius);

            }
        });

    }
}