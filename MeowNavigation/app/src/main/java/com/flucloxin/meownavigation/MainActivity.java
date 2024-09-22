package com.flucloxin.meownavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;


public class MainActivity extends AppCompatActivity {

    ////initialize variable///
    MeowBottomNavigation bottomNavigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ///assign variable///
        bottomNavigation = findViewById(R.id.bottom_navigation);

        ///add menu item///
        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.blood_donor));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.home));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.abou_us));



        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                /// initialize fragment ///

                Fragment fragment = null;

                ///check condition///

                switch (item.getId()){
                    case 1:
                        /// when id is 1///
                        //initialize notification fragment//

                        fragment = new NotificationsFragment();
                        break;
                    case 2:
                        /// when id is 1///
                        //initialize home fragment//

                        fragment = new HomeFragment();
                        break;
                    case 3:
                        /// when id is 1///
                        //initialize notification fragment//

                        fragment = new AboutFragment();
                        break;

                }

                //Load fragment//
                loadFragment(fragment);

            }
        });

        ///set notification count//

        bottomNavigation.setCount(1,"69");
        /// set home fragment//
        bottomNavigation.show(2,true);

        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                ///Display Toast//
                Toast.makeText(getApplicationContext()
                ,"You Clicked"+ item.getId()
                ,Toast.LENGTH_SHORT).show();


            }
        });
        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                /// Displayt Toast
                Toast.makeText(getApplicationContext()
                ,"You Reselected "+ item.getId()
                ,Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void loadFragment(Fragment fragment) {
        /// Replace fragment//
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout,fragment)
                .commit();



    }


}