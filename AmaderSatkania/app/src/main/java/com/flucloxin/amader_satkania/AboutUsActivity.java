package com.flucloxin.amader_satkania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutUsActivity extends AppCompatActivity {

    ImageView aboutuscall,aboutusmsg,aboutusmail,aboutusfb;
    private String gotUrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us_layout);

        aboutuscall = findViewById(R.id.aboutuscall);
        aboutusmsg = findViewById(R.id.aboutusmsg);
        aboutusmail = findViewById(R.id.aboutusmail);
        aboutusfb = findViewById(R.id.aboutusfb);



        aboutusmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mailIntent = new Intent(Intent.ACTION_VIEW);
                Uri data = Uri.parse("mailto:?subject=" + ""+ "&body=" + "" + "&to=" + "lonelywalid@gmail.com");
                mailIntent.setData(data);
                startActivity(Intent.createChooser(mailIntent, "Send mail..."));
            }
        });


        aboutuscall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01736901564"));
                startActivity(intent);


            }
        });

        aboutusmsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", "01736901564", null));
                        intent.putExtra("sms_body", "");
                        startActivity(intent);
                    }
        });

        aboutusfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0)
            {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://www.facebook.com/ErrorOwner"));
                startActivity(browserIntent);


            }
        });


    }
}


