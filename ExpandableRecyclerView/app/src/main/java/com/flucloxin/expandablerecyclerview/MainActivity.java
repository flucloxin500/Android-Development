package com.flucloxin.expandablerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView review;
    List<Versions> versionsList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        review = findViewById(R.id.review);

        intiData();
        setRecyclerView();

    }

    private void setRecyclerView() {
        VersionsAdapter versionsAdapter = new VersionsAdapter(versionsList);
        review.setAdapter(versionsAdapter);
        review.setHasFixedSize(true);
    }

    private void intiData() {

        versionsList = new ArrayList<>();

        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));
        versionsList.add(new Versions("Android 10","Api Level 29","Version 10","Description"));



    }


}