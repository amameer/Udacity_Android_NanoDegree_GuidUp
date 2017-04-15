package com.misk.amna.guidapp;

/**
 * Created by me on 09/04/17.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class FoodAdapter extends ArrayAdapter<Food> {



    public FoodAdapter(Activity context, ArrayList<Food> foods) {

        super(context, 0, foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.places_list_item, parent, false);
        }

        Food currentFood = getItem(position);

       TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_name);

        nameTextView.setText(currentFood.getmName());


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(currentFood.getmImageResourceId());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.place_number);

        numberTextView.setText(""+currentFood.getmID());

        return listItemView;
    }

}
