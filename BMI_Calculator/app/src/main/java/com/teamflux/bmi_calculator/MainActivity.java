package com.teamflux.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edweight,edmeter,edcmeter;
    Button bcalculate;
    TextView tresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edweight = findViewById(R.id.edweight);
        edcmeter = findViewById(R.id.edcmeter);
        edmeter = findViewById(R.id.edmeter);
        bcalculate = findViewById(R.id.bcalculate);
        tresult = findViewById(R.id.tresult);

        bcalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sWeight = edweight.getText().toString();
                String sMeter = edmeter.getText().toString();
                String scMeter= edcmeter.getText().toString();

                double weight = Float.parseFloat(sWeight);
                double meter = Double.parseDouble(sMeter);
                double cmeter = Double.parseDouble(scMeter);

                double height = (double) (meter + cmeter/100);
                double bmiIndex = weight/(height*height);

                tresult.setText("Your BMI Index is : "+bmiIndex);



            }
        });
    }
}