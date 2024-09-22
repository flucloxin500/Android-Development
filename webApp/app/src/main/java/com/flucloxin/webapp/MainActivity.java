package com.flucloxin.webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {


    WebView mwebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mwebview = findViewById(R.id.mwebview);
        mwebview.getSettings().setJavaScriptEnabled(true);
        mwebview.loadUrl("https://www.youtube.com/embed/5rvkSr5uN1E");





    }
}