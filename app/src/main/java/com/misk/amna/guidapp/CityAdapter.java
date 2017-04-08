package com.misk.amna.guidapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by me on 07/04/17.
 */

public class CityAdapter extends ArrayAdapter<City> {
    public CityAdapter(Context context, List<City> cities) {
        super(context, 0, cities);
    }

    @NonNull
    @Override
  public View getView(int position, View convertView, ViewGroup parent) {

        String[] Location = {
                "Restaurant",
                "Meusim",
                "Towers",
                "Malls"
        };
        // Check if an existing view is being reused, otherwise inflate the view
        View fragmentItem=convertView;
        if (fragmentItem == null) {
            fragmentItem = LayoutInflater.from(getContext()).inflate(R.layout.fragment_city, parent, false);
        }
        City mcity = getItem(position);
        ArrayAdapter adapter = new ArrayAdapter(this.getContext(), R.layout.places_list_item, Location);

        ListView listView = (ListView) fragmentItem.findViewById(R.id.list_item);
        fragmentItem.setTransitionName(mcity.getcName());
        listView.setAdapter(adapter);


       // return super.getView(position, convertView, parent);
        return fragmentItem;
    }
}
