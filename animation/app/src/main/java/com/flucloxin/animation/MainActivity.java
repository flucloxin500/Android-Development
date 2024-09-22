package com.flucloxin.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.airbnb.lottie.LottieAnimationView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageview;
    Button button1;
    LottieAnimationView lottieview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageview = findViewById(R.id.imageview);
        button1 =findViewById(R.id.button1);
        lottieview  =findViewById(R.id.lottieview);
        Picasso.get()
                .load("https://www.freepnglogos.com/uploads/tom-and-jerry-png/tom-and-jerry-png-image-gallery-yopriceville-high-10.png")

                .into(imageview);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Picasso.get()
                        .load("https://purepng.com/public/uploads/large/purepng.com-tom-and-jerrytom-and-jerrytomjerryanimated-seriesin-1940characters-170152865971053h4t.png")

                        .resize(100,100)
                        .placeholder(R.drawable.boy3)
                        .error(R.drawable.boy3)
                        .into(imageview);

                lottieview.setAnimation(R.raw.gift);
                lottieview .playAnimation();


            }
        });


    }
}