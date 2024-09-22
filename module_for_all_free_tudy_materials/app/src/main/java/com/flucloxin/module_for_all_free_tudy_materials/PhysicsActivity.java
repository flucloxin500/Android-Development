package com.flucloxin.module_for_all_free_tudy_materials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhysicsActivity extends AppCompatActivity {


    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physics_layout);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(PhysicsActivity.this, ChapterOnePhysicsActivity.class);
                startActivity(myIntent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(PhysicsActivity.this, ChapterTwoPhysicsActivity.class);
                startActivity(myIntent);

            }
        });
    }
}