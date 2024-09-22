package com.flucloxin.amader_satkania;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageSlider imageSlider;
    LinearLayout lintro, lunio, lpour, ldoc, lhos, lamb, lsch, lhelp,lvar,lmad, lcoll, latm, llibrary, lrentcar, lresult, lwakt, lquran,lpha,lshop;
    private long backPressedTime;
    private Toast backToast;
    TextView marqueeText;
    BottomNavigationView bottom_navigation;
    /////MeowBottomNavigation bottomNavigation;
    ///DrawerLayout drawerlayout;
    ///NavigationView navigationView;
    ///ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageSlider = findViewById(R.id.image_slider);
        lintro = findViewById(R.id.lintro);
        lunio = findViewById(R.id.lunio);
        lpour = findViewById(R.id.lpour);
        ldoc = findViewById(R.id.ldoc);
        lhos = findViewById(R.id.lhos);
        lamb = findViewById(R.id.lamb);
        lhelp = findViewById(R.id.lhelp);
        lsch = findViewById(R.id.lsch);
        lmad = findViewById(R.id.lmad);
        lvar = findViewById(R.id.lvar);
        lcoll = findViewById(R.id.lcoll);
        latm = findViewById(R.id.latm);
        llibrary = findViewById(R.id.lcoll);
        lrentcar = findViewById(R.id.lrentcar);
        lquran = findViewById(R.id.lquran);
        lpha = findViewById(R.id.lpha);
        lresult = findViewById(R.id.lresult);
        lwakt = findViewById(R.id.lwakt);
        lshop = findViewById(R.id.lshop);
        marqueeText = findViewById(R.id.marqueeText);


        /// this line hi

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        bottom_navigation = findViewById(R.id.bottom_navigation);

        bottom_navigation.setSelectedItemId(R.id.nav_home);
        bottom_navigation.setItemIconTintList(null);

        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch (item.getItemId()){

                    case R.id.nav_home:
                        Toast.makeText(MainActivity.this,"Home",Toast.LENGTH_SHORT).show();
                        Intent myIntent = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(myIntent);
                        break;

                    case R.id.nav_bl:
                        Toast.makeText(MainActivity.this,"Blood Donor",Toast.LENGTH_SHORT).show();
                         myIntent = new Intent(MainActivity.this,BloodDonorActivity.class);
                        startActivity(myIntent);
                        break;

                    case R.id.nav_skill:
                        Toast.makeText(MainActivity.this,"Skill",Toast.LENGTH_SHORT).show();
                         myIntent = new Intent(MainActivity.this, SkillActivity2.class);
                        startActivity(myIntent);
                        break;

                    case R.id.nav_more:
                        Toast.makeText(MainActivity.this,"More",Toast.LENGTH_SHORT).show();
                         myIntent = new Intent(MainActivity.this, MoreActivity.class);
                        startActivity(myIntent);
                        break;
                }




                return false;
            }
        });



        ///drawerlayout = findViewById(R.id.drawerlayout);
        ///navigationView = findViewById(R.id.navigationView);

        ///toggle ///
        ///toggle = new ActionBarDrawerToggle(this, drawerlayout, R.string.nav_open, R.string.nav_close);

        ///drawerlayout.addDrawerListener(toggle);
        ///toggle.syncState();


        /// clickable navigation ///
        ///public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{//


        ///navigationView.setNavigationItemSelectedListener(this);


        /// MArquee Text ///

        marqueeText.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        marqueeText.setSelected(true);

        ///  Slider ///

        ArrayList<SlideModel> imageList = new ArrayList<>();


        //imageList.add(new SlideModel("https://tse3.mm.bing.net/th?id=OIP.05s4ZwUBZUoDGaGQEWHxDQHaLX&pid=Api&P=0",null));
        //imageList.add(new SlideModel("https://tse3.mm.bing.net/th?id=OIP.05s4ZwUBZUoDGaGQEWHxDQHaLX&pid=Api&P=0",null));
        //imageList.add(new SlideModel("https://tse3.mm.bing.net/th?id=OIP.05s4ZwUBZUoDGaGQEWHxDQHaLX&pid=Api&P=0",null));
        imageList.add(new SlideModel(R.drawable.img10, "মাজের মসজিদ", null));
        imageList.add(new SlideModel(R.drawable.img8, "ঢলুখাল", null));
        imageList.add(new SlideModel(R.drawable.img1, "ছিটুয়াপাড়া জামে মসজিদ", null));


        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP);

        imageSlider.setImageList(imageList);

        ///add menu item///
        ///bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.blood_donor));
        ///bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.home));
        ///bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.abou_us));


        //Creating webView Opener programitcally which supports media player and js automatically like a browser


        lintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://lnk.pw/zyhc";
                startActivity(myIntent);

            }
        });
        lunio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://bn.wikipedia.org/wiki/%E0%A6%B8%E0%A6%BE%E0%A6%A4%E0%A6%95%E0%A6%BE%E0%A6%A8%E0%A6%BF%E0%A6%AF%E0%A6%BC%E0%A6%BE_%E0%A6%87%E0%A6%89%E0%A6%A8%E0%A6%BF%E0%A6%AF%E0%A6%BC%E0%A6%A8";
                startActivity(myIntent);

            }
        });
        lpour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://bn.wikipedia.org/wiki/%E0%A6%B8%E0%A6%BE%E0%A6%A4%E0%A6%95%E0%A6%BE%E0%A6%A8%E0%A6%BF%E0%A6%AF%E0%A6%BC%E0%A6%BE_%E0%A6%AA%E0%A7%8C%E0%A6%B0%E0%A6%B8%E0%A6%AD%E0%A6%BE";
                startActivity(myIntent);

            }
        });


        lhos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, HospitalActivity.class);
                startActivity(myIntent);

            }
        });

        lresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://www.copy.ai/";
                startActivity(myIntent);
            }
        });

        lshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, OnlineShoppingActivity.class);
                startActivity(myIntent);
            }
        });

        lwakt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://salat.habibur.com/districts/chittagong/";
                startActivity(myIntent);

            }
        });

        lquran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, WebBrowserActivity.class);
                WebBrowserActivity.web_url = "https://quran.com/bn";
                startActivity(myIntent);

            }
        });


        lamb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, AmbulanceActivity.class);
                startActivity(myIntent);

            }
        });


        ldoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, DoctorActivity.class);
                startActivity(myIntent);

            }
        });

        lsch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SchoolActivity.class);
                startActivity(myIntent);

            }
        });

        lmad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, MadrasahActivity.class);
                startActivity(myIntent);

            }
        });

        lcoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, CollegeActivity.class);
                startActivity(myIntent);

            }
        });
        lhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, EmergencyCallActivity.class);
                startActivity(myIntent);

            }
        });
        lvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, UniversityActivity.class);
                startActivity(myIntent);

            }
        });

        lpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, PharmacyActivity.class);
                startActivity(myIntent);

            }
        });

        llibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(myIntent);
            }
        });

        latm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, AtmActivity.class);
                ;
                startActivity(myIntent);
            }
        });

        lrentcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, RentCarActivity.class);
                ;
                startActivity(myIntent);
            }
        });

    }

    /// Toast ///

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Tap again to exit app", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }




}