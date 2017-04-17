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

        Museum currentMuseum = getItem(position);
        View listItemView = convertView;
        ViewHolder viewHolder;
        if (listItemView == null) {
            viewHolder = new ViewHolder();
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.places2_list_item, parent, false);
            viewHolder.mID = (TextView) listItemView.findViewById(R.id.place_number2);
            viewHolder.mName = (TextView) listItemView.findViewById(R.id.place_name2);
            viewHolder.mImage = (ImageView) listItemView.findViewById(R.id.list_item_icon2);
            viewHolder.mImage.setImageResource(currentMuseum.getmImageResourceId());
            listItemView.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder) listItemView.getTag();

        viewHolder.mName.setText(currentMuseum.getmName());
        viewHolder.mID.setText("" + currentMuseum.getmID());
        viewHolder.mImage.setImageResource(currentMuseum.getmImageResourceId());


        return listItemView;
    }
    static class ViewHolder {

        private TextView mID;
        private TextView mName;
        private ImageView mImage;

    }
}
