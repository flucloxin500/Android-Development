package com.flucloxin.visibilitytoaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent myIntent = new Intent(SecondActivity.this,MainActivity.class);
        startActivity(myIntent);
    }
}