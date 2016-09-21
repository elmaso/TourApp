package com.abnd.maso.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class NightClubs extends Fragment {


    public NightClubs() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        //Create TourTj list of restaurants
        final ArrayList<TourTJ> tourTJs = new ArrayList<TourTJ>();
        tourTJs.add(new TourTJ(R.string.nig_title_cbc,
                R.drawable.nig_cbc,
                R.string.nig_description_cbc,
                R.string.nig_address_cbc,
                R.string.nig_open_hours_cbc));
        tourTJs.add(new TourTJ(R.string.nig_title_porkys,
                R.drawable.nig_porkys,
                R.string.nig_description_porkys,
                R.string.nig_address_porkys,
                R.string.nig_open_hours_porkys));
        tourTJs.add(new TourTJ(R.string.nig_title_pulgas,
                R.drawable.nig_pulgas,
                R.string.nig_descriptio_pulgas,
                R.string.nig_address_pulgas,
                R.string.nig_open_hours_pulgas));


        TourTJAdapter adapter = new TourTJAdapter(getActivity(),tourTJs);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
