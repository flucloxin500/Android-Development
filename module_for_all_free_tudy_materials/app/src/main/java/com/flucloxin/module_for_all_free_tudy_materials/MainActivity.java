
package com.flucloxin.module_for_all_free_tudy_materials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout lHSC,lAdm;
    TextView tView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lHSC = findViewById(R.id.lHSC);
        lAdm = findViewById(R.id.lAdm);
        tView2 = findViewById(R.id.tView2);

        lHSC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, SubjectActivity.class);
                startActivity(myIntent);
            }
        });




        lAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, AdmissionActivity.class);
                startActivity(myIntent);
            }
        });



    }
}