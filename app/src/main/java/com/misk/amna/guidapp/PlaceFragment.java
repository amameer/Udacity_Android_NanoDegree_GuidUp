package com.misk.amna.guidapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class PlaceFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;

    public static PlaceFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PlaceFragment fragment = new PlaceFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

            mPage = getArguments().getInt(ARG_PAGE);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        ArrayList<Mall> malls = new ArrayList<Mall>();
        ArrayList<Tower> towers = new ArrayList<Tower>();
        ArrayList<Museum> museums = new ArrayList<Museum>();
        ArrayList<Food> foods = new ArrayList<Food>();

        malls.add(new Mall(1, getString(R.string.Panorama_Mall), R.mipmap.ic_panorama_mall));
        malls.add(new Mall(2, getString(R.string.Riadh_Gallery), R.mipmap.ic_riyadh_gallery));
        malls.add(new Mall(3, getString(R.string.Centeria), R.mipmap.ic_centeria));

        towers.add(new Tower(1, getString(R.string.TV), R.mipmap.ic_tv));
        towers.add(new Tower(2, getString(R.string.Faisaliah), R.mipmap.ic_faisaliah));
        towers.add(new Tower(3, getString(R.string.Kingdom), R.mipmap.ic_kingdom));

        museums.add(new Museum(1, getString(R.string.NMuseum), R.mipmap.ic_watani));
        museums.add(new Museum(2, getString(R.string.Masmak), R.mipmap.ic_masmak));
        museums.add(new Museum(3, getString(R.string.SaqrAljazeerah), R.mipmap.ic_air_aviation));

        foods.add(new Food(1, getString(R.string.NajdiahV), R.mipmap.ic_najdiah_vally));
        foods.add(new Food(2, getString(R.string.spazio), R.mipmap.ic_spazio));
        foods.add(new Food(3, getString(R.string.lusin), R.mipmap.ic_lusin));

        MallAdapter mallAdapter;
        MuseumAdapter museumAdapter;
        FoodAdapter foodAdapter;
        TowerAdapter towerAdapter;

        View view = inflater.inflate(R.layout.fragment_place, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listview_place);

        if (mPage == 1) {
            mallAdapter = new MallAdapter(getActivity(), malls);
            listView.setAdapter(mallAdapter);

        } else if (mPage == 2) {
            foodAdapter = new FoodAdapter(getActivity(), foods);

            listView.setAdapter(foodAdapter);


        } else if (mPage == 3) {
            towerAdapter = new TowerAdapter(getActivity(), towers);

            listView.setAdapter(towerAdapter);
        } else {
            museumAdapter = new MuseumAdapter(getActivity(), museums);
            listView.setAdapter(museumAdapter);
        }

        return view;
    }


}
