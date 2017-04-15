package com.misk.amna.guidapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);


        PlacesPagerAdapter placesPagerAdapter =new PlacesPagerAdapter(getSupportFragmentManager(),
                MainActivity.this);

       viewPager.setAdapter(placesPagerAdapter);



        android.support.design.widget.TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);





    }



}
