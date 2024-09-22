package com.flucloxin.album_practise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout laysong1,laysong2,laysong3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        laysong1 = findViewById(R.id.laysong1);
        laysong2 = findViewById(R.id.laysong2);
        laysong3 = findViewById(R.id.laysong3);


        laysong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.video_url ="https://www.youtube.com/embed/e8eSfqaaGXQ";
                Intent intent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(intent);
            }
        });

        laysong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.video_url ="https://www.youtube.com/embed/hSnwf9aPcJU";
                Intent intent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(intent);
            }
        });

        laysong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.video_url ="https://www.youtube.com/embed/hSnwf9aPcJU";
                Intent intent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(intent);
            }
        });




    }
}