package com.flucloxin.module_for_all_free_tudy_materials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SubjectActivity extends AppCompatActivity {

    LinearLayout lphy,lche,lbio,lmat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subject_layout);

        lphy = findViewById(R.id.lphy);
        lche = findViewById(R.id.lche);
        lbio = findViewById(R.id.lbio);
        lmat = findViewById(R.id.lmat);

        lphy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(SubjectActivity.this, PhysicsActivity.class);
                startActivity(myIntent);
            }
        });

        lche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(SubjectActivity.this, ChemistryActivity.class);
                startActivity(myIntent);
            }
        });

        lbio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(SubjectActivity.this, BiologyActivity.class);
                startActivity(myIntent);
            }
        });

        lmat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(SubjectActivity.this, MathematicsActivity.class);
                startActivity(myIntent);
            }
        });




    }
}