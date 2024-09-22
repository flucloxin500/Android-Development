package com.flucloxin.inputtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editnickname,editbloodgroup;
    Button buttonregister,buttonsubmit;
    TextView textthanks,textwelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editnickname = findViewById(R.id.editnickname);
        buttonregister = findViewById(R.id.buttonregister);
        textthanks = findViewById(R.id.textthanks);
        buttonsubmit = findViewById(R.id.buttonsubmit);
        editbloodgroup = findViewById(R.id.editbloodgroup);
        textwelcome  = findViewById(R.id.textwelcome);






        buttonregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textthanks.setText("Great!! Dear "+editnickname.getText().toString()+"\nNow plase provide your blood group");


            }
        });

        buttonsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textwelcome.setText("Welcome to the community of Red Life\nDonate Blood Save Life!!");


            }
        });


    }
}