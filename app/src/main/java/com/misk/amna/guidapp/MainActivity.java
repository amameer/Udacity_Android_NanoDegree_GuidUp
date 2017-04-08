package com.misk.amna.guidapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // Get the ViewPager and set it's PagerAdapter so that it can display items
      //  ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);


        // Construct the data source

// Attach the adapter to a ListView
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //viewPager.setAdapter(adapter);

       viewPager.setAdapter(new CityPagerAdapter(getSupportFragmentManager(),
                MainActivity.this));

        // Give the TabLayout the ViewPager

        android.support.design.widget.TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);





    }



}
