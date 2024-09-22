package com.teamflux.surahfornamaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    LinearLayout lnamazsurah,lmasnundua,lfarazamal,lspecialnamaj,lsalatwakt,lweeklyamal;
    TextView marqueeText;
    private long backPressedTime;
    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        marqueeText = findViewById(R.id.marqueeText);
        lnamazsurah = findViewById(R.id.lnamazsurah);
        lmasnundua = findViewById(R.id.lmasnundua);
        lfarazamal = findViewById(R.id.lfarazamal);
        lspecialnamaj = findViewById(R.id.lspecialnamaj);
        lsalatwakt = findViewById(R.id.lsalatwakt);
        lweeklyamal = findViewById(R.id.lweeklyamal);

        /// Marquee Text ///

        marqueeText.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        marqueeText.setSelected(true);

        lnamazsurah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SurahActivity.class);
                startActivity(myIntent);

            }
        });

        lmasnundua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, DuaActivity.class);
                startActivity(myIntent);

            }
        });

        lfarazamal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, FarzActivity.class);
                startActivity(myIntent);

            }
        });

        lspecialnamaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SpecialNamazActivity.class);
                startActivity(myIntent);

            }
        });

        lsalatwakt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://salat.habibur.com/districts/chittagong/";
                startActivity(myIntent);

            }
        });

        lweeklyamal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, WeeklyAmalActivity.class);
                startActivity(myIntent);

            }
        });

    }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Tap again to exit app", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}