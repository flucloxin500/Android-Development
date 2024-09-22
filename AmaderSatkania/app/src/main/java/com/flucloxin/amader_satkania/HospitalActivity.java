package com.flucloxin.amader_satkania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HospitalActivity extends AppCompatActivity {

    FloatingActionButton calluhc,callsah,callmsgh,callchdc,callahl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospital_layout);

        calluhc = findViewById(R.id.calluhc);
        callsah = findViewById(R.id.callsah);
        callmsgh = findViewById(R.id.callmsgh);
        callchdc = findViewById(R.id.callchdc);
        callahl = findViewById(R.id.callahl);

        calluhc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01829964890"));
                startActivity(intent);


            }
        });

        callsah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"));
                startActivity(intent);


            }
        });

        callmsgh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:07109618282"));
                startActivity(intent);


            }
        });

        callchdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01886350550"));
                startActivity(intent);


            }
        });

        callahl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1816083925"));
                startActivity(intent);


            }
        });
    }
}