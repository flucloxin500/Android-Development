package com.flucloxin.amader_satkania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MadrasahActivity extends AppCompatActivity {

    Button bgarmad,bkermad,bgarwommad,bbajmad,brasmad,bsatmad,bkanmad,bchomad,bbaimad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madrasah_layout);

        bgarmad = findViewById(R.id.bgarmad);
        bkermad = findViewById(R.id.bkermad);
        bgarwommad = findViewById(R.id.bgarwommad);
        bbajmad = findViewById(R.id.bbajmad);
        brasmad = findViewById(R.id.brasmad);
        bsatmad = findViewById(R.id.bsatmad);
        bkanmad = findViewById(R.id.bkanmad);
        bchomad = findViewById(R.id.bchomad);
        bbaimad = findViewById(R.id.bbaimad);


        bgarmad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+"Garangia Islamia Kamil Madrasha");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        bkermad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+"কেরানীহাট জামেউল উলুম ইসলামিয়া ফাযিল মাদ্রাসা");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        bgarwommad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+"Garangia Islami Rabbani Mahila Fazil(Degree) Madrasah");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        bbajmad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+"Bajaliya Hedaytul Islam Fazil Madrasha");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        brasmad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+"Rasulabad islamia fazil( degree) madrasah");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        bsatmad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+"Satkania Mahmudul Ulum Fazil Madrasha");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        bkanmad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+"Kanchana Anuarul Ulom Islamia Senior Alim Madrasha");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        bchomad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+"ছদাহা মোহাম্মদীয়া খাইরিয়া আলিম মাদ্রাসা(S.M.K Alim Madrasha)");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        bbaimad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+"বায়তুশ শরফ আখতারিয়া আদর্শ ফাজিল (স্নাতক) মাদ্রাসা");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });



    }
}