package com.abnd.maso.tourapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends Fragment {

    public Restaurants() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        //Create TourTj list of restaurants
        final ArrayList<TourTJ> tourTJs = new ArrayList<TourTJ>();
        tourTJs.add(new TourTJ(R.string.rest_mision,
                R.string.rest_description_mision));
        tourTJs.add(new TourTJ(R.string.rest_title_cesar,
                R.string.res_description_cesar));
        tourTJs.add(new TourTJ(R.string.rest_title_maiz,
                R.string.res_description_maiz));


        TourTJAdapter adapter = new TourTJAdapter(getActivity(),tourTJs);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
