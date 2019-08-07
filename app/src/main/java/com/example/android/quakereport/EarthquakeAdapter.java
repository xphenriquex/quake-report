package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter {

    public EarthquakeAdapter(@NonNull Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, ViewGroup parent) {

        View listItemView = convertView;

        Earthquake currentEarthquake = (Earthquake) getItem(position);


        if(listItemView == null){

            listItemView = LayoutInflater
                    .from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        TextView magTextView = listItemView.findViewById(R.id.mag_text_view);
        TextView placeTextView = listItemView.findViewById(R.id.place_text_view);
        TextView dateTextView = listItemView.findViewById(R.id.date_text_view);
        TextView hourTextView = listItemView.findViewById(R.id.hour_text_view);


        magTextView.setText(String.valueOf(currentEarthquake.getMag()));
        placeTextView.setText(currentEarthquake.getPlace());
        dateTextView.setText(currentEarthquake.getDate());
        hourTextView.setText(currentEarthquake.getHour());

        return listItemView;
    }
}
