package com.misk.amna.guidapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


/**
 * Created by me on 07/04/17.
 */

public class PlacesPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private Context context;

    ArrayList<Place> mPlaces = new ArrayList<Place>();

    public PlacesPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;

        mPlaces.add(new Place(1,"Malls"));
        mPlaces.add(new Place(2,"Foods"));
        mPlaces.add(new Place(3,"Towers"));
        mPlaces.add(new Place(3,"Museums"));


    }

    @Override
    public Fragment getItem(int position) {
        return PlaceFragment.newInstance(position + 1);

    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
public CharSequence getPageTitle(int position)
    {
        return mPlaces.get(position).getpName();

    }



    }
