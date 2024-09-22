package com.flucloxin.module_for_all_free_tudy_materials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ChapterOnePhysicsActivity extends AppCompatActivity {
    LinearLayout l1phy1,l1phy1_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter_one_physics_layout);

        l1phy1 = findViewById(R.id.l1phy1);
        l1phy1_2 = findViewById(R.id.l1phy1_2);

        l1phy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.video_url ="https://www.youtube.com/embed/4PCLUDetsas";
                Intent intent = new Intent(ChapterOnePhysicsActivity.this,VideoPlayer.class);
                startActivity(intent);
            }
        });

        l1phy1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.video_url ="https://www.youtube.com/embed/os3_twdlA_U";
                Intent intent = new Intent(ChapterOnePhysicsActivity.this,VideoPlayer.class);
                startActivity(intent);
            }
        });
    }
}