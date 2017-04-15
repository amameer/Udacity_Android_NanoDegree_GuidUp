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


public class MallAdapter extends ArrayAdapter<Mall> {


    public MallAdapter(Activity context, ArrayList<Mall> malls) {

        super(context, 0, malls);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.places_list_item, parent, false);
        }

        Mall currentMall = getItem(position);

       TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_name);

        nameTextView.setText(currentMall.getmName());


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(currentMall.getmImageResourceId());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.place_number);

        numberTextView.setText(""+currentMall.getmID());

        return listItemView;
    }

}
