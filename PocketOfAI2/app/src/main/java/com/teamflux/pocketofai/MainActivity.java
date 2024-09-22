package com.teamflux.pocketofai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView anim_copy,anim_cleanup,anim_unbounce,anim_flair,anim_resumeworded,anim_synthesia,anim_soundraw,anim_movio,anim_krisp,anim_namelix,anim_looka,anim_wix,anim_jasper,anim_beatoven,anim_cleanvoice,anim_podcastle,anim_chatgpt,anim_illustroke,anim_stockimg,anim_CopyMonkey;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anim_copy = findViewById(R.id.anim_copy);
        anim_movio = findViewById(R.id.anim_movio);
        anim_krisp =findViewById(R.id.anim_krisp);
        anim_namelix = findViewById(R.id.anim_namelix);
        anim_looka = findViewById(R.id.anim_looka);
        anim_wix = findViewById(R.id.anim_wix);
        anim_jasper = findViewById(R.id.anim_jasper);
        anim_beatoven = findViewById(R.id.anim_beatoven);
        anim_cleanvoice = findViewById(R.id.anim_cleanvoice);
        anim_podcastle = findViewById(R.id.anim_podcastle);
        anim_illustroke = findViewById(R.id.anim_illustroke);
        anim_stockimg = findViewById(R.id.anim_stockimg);
        anim_CopyMonkey = findViewById(R.id.anim_CopyMonkey);
        anim_chatgpt = findViewById(R.id.anim_chatgpt);
        anim_soundraw = findViewById(R.id.anim_soundraw);
        anim_synthesia = findViewById(R.id.anim_synthesia);
        anim_resumeworded = findViewById(R.id.anim_resumeworded);
        anim_cleanup = findViewById(R.id.anim_cleanup);
        anim_flair = findViewById(R.id.anim_flair);
        anim_unbounce = findViewById(R.id.anim_unbounce);






        anim_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://www.copy.ai/";
                startActivity(myIntent);

            }
        });

        anim_movio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://www.movio.ai/";
                startActivity(myIntent);

            }
        });

        anim_krisp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://www.krisp.ai/";
                startActivity(myIntent);

            }
        });

        anim_namelix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://namelix.com/";
                startActivity(myIntent);

            }
        });

        anim_looka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://looka.com/";
                startActivity(myIntent);

            }
        });

        anim_wix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://www.wix.com/";
                startActivity(myIntent);

            }
        });

        anim_jasper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://www.jasper.ai/free-trial?_from=ads&fp_sid=1-g-CjwKCAiA5sieBhBnEiwAR9oh2kh5zZvUdG5cCrHEgNdt63ja_xO7eIH5bg5a0LUXSXFCfuBe1BMi2hoCA2cQAvD_BwE";
                startActivity(myIntent);

            }
        });

        anim_beatoven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://www.beatoven.ai/";
                startActivity(myIntent);

            }
        });

        anim_cleanvoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://cleanvoice.ai/";
                startActivity(myIntent);

            }
        });

        anim_podcastle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://podcastle.ai/";
                startActivity(myIntent);

            }
        });

        anim_illustroke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://illustroke.com/";
                startActivity(myIntent);

            }
        });

        anim_stockimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://stockimg.ai/?";
                startActivity(myIntent);

            }
        });

        anim_CopyMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://copymonkey.ai/?";
                startActivity(myIntent);

            }
        });

        anim_chatgpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://chat.openai.com/chat";
                startActivity(myIntent);

            }
        });

        anim_soundraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://soundraw.io/";
                startActivity(myIntent);

            }
        });

        anim_synthesia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://www.synthesia.io/";
                startActivity(myIntent);

            }
        });

        anim_resumeworded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://www.resumeworded.com/";
                startActivity(myIntent);

            }
        });

        anim_cleanup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://cleanup.pictures/";
                startActivity(myIntent);

            }
        });

        anim_flair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://flair.ai/";
                startActivity(myIntent);

            }
        });

        anim_unbounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://unbounce.com/";
                startActivity(myIntent);

            }
        });
    }
}