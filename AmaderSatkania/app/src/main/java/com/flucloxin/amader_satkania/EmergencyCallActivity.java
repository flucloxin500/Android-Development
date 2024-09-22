package com.flucloxin.amader_satkania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EmergencyCallActivity extends AppCompatActivity {

    FloatingActionButton callfire,callcmch,callemer,callchildhelp,callwoman,callnid,callgovlaws,callnatureaffect,callcrimebranch,callinfohelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_call_layout);

        callfire =  findViewById(R.id.callfire);
        callcmch =  findViewById(R.id.callcmch);
        callemer =  findViewById(R.id.callemer);
        callchildhelp =  findViewById(R.id.callchildhelp);
        callwoman =  findViewById(R.id.callwoman);
        callnid =  findViewById(R.id.callnid);
        callgovlaws =  findViewById(R.id.callgovlaws);
        callnatureaffect =  findViewById(R.id.callnatureaffect);
        callcrimebranch =  findViewById(R.id.callcrimebranch);
        callinfohelp =  findViewById(R.id.callinfohelp);

        callfire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01730002433"));
                startActivity(intent);


            }
        });

        callcmch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01705657650"));
                startActivity(intent);


            }
        });

        callemer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:999"));
                startActivity(intent);


            }
        });

        callchildhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1098"));
                startActivity(intent);


            }
        });

        callwoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:109"));
                startActivity(intent);


            }
        });

        callnid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:105"));
                startActivity(intent);


            }
        });

        callgovlaws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 16430 "));
                startActivity(intent);


            }
        });

        callnatureaffect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10941"));
                startActivity(intent);


            }
        });

        callcrimebranch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:106"));
                startActivity(intent);


            }
        });

        callinfohelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:333"));
                startActivity(intent);


            }
        });




    }
}