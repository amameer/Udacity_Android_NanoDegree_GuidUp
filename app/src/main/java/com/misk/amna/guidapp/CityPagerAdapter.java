package com.misk.amna.guidapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


/**
 * Created by me on 07/04/17.
 */

public class CityPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    //private City mCity[]=new []City();
    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" };
    private Context context;

    ArrayList<City> mCities = new ArrayList<City>();

    public CityPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;

        mCities.add(new City(1,"Riyadh"));
        mCities.add(new City(2,"Jeddah"));
        mCities.add(new City(3,"Dammam"));

    }

    @Override
    public Fragment getItem(int position) {
       // return null;
        return CityFragment.newInstance(position + 1);

    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
public CharSequence getPageTitle(int position)
    {
        //return tabTitles[position];
        return mCities.get(position).getcName();

    }
}
