package com.flucloxin.amader_satkania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class CollegeActivity extends AppCompatActivity {

    Button bsatcolloc,bsatwomcolloc,bsatahcolloc,bjafcolloc,bcorcolloc,bcibcolloc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.college_layout);

        bsatcolloc = findViewById(R.id.bsatcolloc);
        bsatwomcolloc = findViewById(R.id.bsatwomcolloc);
        bsatahcolloc = findViewById(R.id.bsatahcolloc);
        bjafcolloc = findViewById(R.id.bjafcolloc);
        bcorcolloc = findViewById(R.id.bcorcolloc);
        bcibcolloc = findViewById(R.id.bcibcolloc);


        bsatcolloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+"Satkania Government College – সাতকানিয়া সরকারি কলেজ");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        bsatwomcolloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+"Satkania Adarsha Degree Mahila College");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        bsatahcolloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+"AL HELAL ADARSHA DEGREE COLLEGE");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        bjafcolloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+"North Satkania Zafar Ahmad Chowdhury College");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        bcorcolloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+"অলি আহমেদ বীর বিক্রম কলেজ");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        bcibcolloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+"Chibbari M.A. Motaleb College");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });








    }
}