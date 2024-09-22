package com.teamflux.surahfornamaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeeklyAmalActivity extends AppCompatActivity {

    Button bsurahkahf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weekly_amal_layout);

        bsurahkahf = findViewById(R.id.bsurahkahf);


        bsurahkahf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(WeeklyAmalActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://www.quranerbani.com/p/sura-kahaf.html";
                startActivity(myIntent);

            }
        });
    }
}