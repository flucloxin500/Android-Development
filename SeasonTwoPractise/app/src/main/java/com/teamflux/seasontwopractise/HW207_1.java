package com.teamflux.seasontwopractise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HW207_1 extends AppCompatActivity {

    EditText edweight,edinch,edfeet;
    Button bcalculate;
    TextView tresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw207_1);

        edweight = findViewById(R.id.edweight);
        edinch = findViewById(R.id.edinch);
        edfeet = findViewById(R.id.edfeet);
        bcalculate = findViewById(R.id.bcalculate);
        tresult = findViewById(R.id.tresult);

        bcalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sWeight = edweight.getText().toString();
                String sFeet = edfeet.getText().toString();
                String sInch = edinch.getText().toString();

                float weight = Float.parseFloat(sWeight);
                float feet = Float.parseFloat(sFeet);
                float inch = Float.parseFloat(sInch);

                float height = (float) (feet*.3048 + inch*.0254);
                float bmiIndex = weight/(height*height);

                tresult.setText("Your BMI Index is : "+bmiIndex);



            }
        });
    }


    }
