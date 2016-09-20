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
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.tour_list,container,false);



        //Create TourTj list of restaurants
        final ArrayList<TourTJ> tourTJ = new ArrayList<TourTJ>();
        tourTJ.add(new TourTJ(R.string.rest_mision,
                R.string.rest_description_mision));
        tourTJ.add(new TourTJ(R.string.rest_title_cesar,
                R.string.res_description_cesar));
        tourTJ.add(new TourTJ(R.string.rest_title_maiz,
                R.string.res_description_maiz));

        TourTJAdapter adapter = new TourTJAdapter(getActivity(), tourTJ);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;

    }
}
