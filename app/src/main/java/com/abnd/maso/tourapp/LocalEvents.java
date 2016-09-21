package com.abnd.maso.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class LocalEvents extends Fragment {


    public LocalEvents() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        //Create TourTj list of restaurants
        final ArrayList<TourTJ> tourTJs = new ArrayList<TourTJ>();
        tourTJs.add(new TourTJ(R.string.eve_title_food,
                R.drawable.eve_food,
                R.string.eve_description_food,
                R.string.eve_address_food,
                R.string.eve_open_hours_food));
        tourTJs.add(new TourTJ(R.string.eve_title_tequila,
                R.drawable.eve_tequila,
                R.string.eve_description_tequila,
                R.string.eve_address_tequila,
                R.string.eve_open_hours_tequila));


        TourTJAdapter adapter = new TourTJAdapter(getActivity(),tourTJs);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
