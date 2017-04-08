package com.misk.amna.guidapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CityFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CityFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;

    public static CityFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        CityFragment fragment = new CityFragment();
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


        String[] locations = {
                "Restaurants",
                "Malls..",
                "Towers",
                "Museum"};


        View view = inflater.inflate(R.layout.fragment_city, container, false);

        ArrayAdapter adapter = new ArrayAdapter(this.getContext(), R.layout.places_list_item, locations);

        ListView listView = (ListView)view.findViewById(R.id.list_item);
        listView.setAdapter(adapter);


        return view;
    }

}
