package com.flucloxin.profitlossactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edbuy,edprofit;
    Button button;
    TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        edbuy = findViewById(R.id.edbuy);
        edprofit = findViewById(R.id.edprofit);
        textView3 = findViewById(R.id.textView3);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float buyPrice,Profit,Sell;

                String sbuy = edbuy.getText().toString();
                buyPrice = Float.parseFloat(sbuy);

                String sprofit = edprofit.getText().toString();
                Profit = Float.parseFloat(sprofit);



                Sell = buyPrice + ((buyPrice/100)*Profit);
                textView3.setText("Selling Price : "+Sell+"Taka");


            }
        });


    }
}