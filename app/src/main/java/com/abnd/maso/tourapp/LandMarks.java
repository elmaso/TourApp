package com.abnd.maso.tourapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class LandMarks extends Fragment {


    public LandMarks() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        //Create TourTj list of restaurants
        final ArrayList<TourTJ> tourTJs = new ArrayList<TourTJ>();
        tourTJs.add(new TourTJ(R.string.lan_title_jaialai,
                R.drawable.lan_jai_alai,
                R.string.lan_description_jaialai,
                R.string.lan_address_jaialai,
                R.string.lan_open_hours_jaialai));
        tourTJs.add(new TourTJ(R.string.lan_title_cecut,
                R.drawable.lan_cecut,
                R.string.lan_description_cecut,
                R.string.lan_address_cecut,
                R.string.lan_open_hours_cecut));
        tourTJs.add(new TourTJ(R.string.lan_title_mona,
                R.drawable.lan_mona,
                R.string.lan_description_mona,
                R.string.lan_address_mona,
                R.string.lan_open_hours_mona));
        tourTJs.add(new TourTJ(R.string.lan_title_burro,
                R.drawable.lan_burro,
                R.string.lan_description_burro,
                R.string.lan_address_burro,
                R.string.lan_open_hours_burro));


        TourTJAdapter adapter = new TourTJAdapter(getActivity(),tourTJs);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
