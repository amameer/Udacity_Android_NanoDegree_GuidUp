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

        Mall currentMall = getItem(position);
        View listItemView = convertView;

        ViewHolder viewHolder;
        if (listItemView == null) {
            viewHolder = new ViewHolder();
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.places_list_item, parent, false);
            viewHolder.mID = (TextView) listItemView.findViewById(R.id.place_number);
            viewHolder.mName = (TextView) listItemView.findViewById(R.id.place_name);
            viewHolder.mImage = (ImageView) listItemView.findViewById(R.id.list_item_icon);
            viewHolder.mImage.setImageResource(currentMall.getmImageResourceId());
            listItemView.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder) listItemView.getTag();

        viewHolder.mName.setText(currentMall.getmName());
        viewHolder.mID.setText("" + currentMall.getmID());
        viewHolder.mImage.setImageResource(currentMall.getmImageResourceId());


        return listItemView;
    }
    static class ViewHolder {

        private TextView mID;
        private TextView mName;
        private ImageView mImage;

    }
}
