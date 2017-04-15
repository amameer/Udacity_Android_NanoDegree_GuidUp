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


public class MuseumAdapter extends ArrayAdapter<Museum> {


    public MuseumAdapter(Activity context, ArrayList<Museum> museums) {

        super(context, 0, museums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.places2_list_item, parent, false);
        }
        Museum currentMuseum = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_name2);
        nameTextView.setText(currentMuseum.getmName());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon2);
        iconView.setImageResource(currentMuseum.getmImageResourceId());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.place_number2);

        numberTextView.setText(""+currentMuseum.getmID());

        return listItemView;
    }

}
