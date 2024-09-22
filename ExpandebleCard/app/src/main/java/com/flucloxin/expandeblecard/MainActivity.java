package com.flucloxin.expandeblecard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout lexpand;
    TextView textexpand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textexpand = findViewById(R.id.textexpand);
        lexpand = findViewById(R.id.lexpand);

    }

    public void expand(View view) {
        int v = (textexpand.getVisibility()==View.GONE)?View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(lexpand,new AutoTransition());
        textexpand.setVisibility(v);
    }
}