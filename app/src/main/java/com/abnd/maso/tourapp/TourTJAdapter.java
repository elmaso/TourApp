package com.abnd.maso.tourapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mariosoberanis on 9/19/16.
 */
public class TourTJAdapter extends ArrayAdapter<TourTJ> {


    /**
     * Create a new {@link TourTJAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param tourTJs is the list of {@link TourTJ}s to be displayed.
     */

    public TourTJAdapter(Context context, ArrayList<TourTJ> tourTJs) {
        super(context, 0, tourTJs);
    }


    @Nullable
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tour_item, parent, false);
        }
        //Get the {@link TourTj} object located at this position in the list
        TourTJ currentPOI = getItem(position);

       //We connect List to View ids
        TextView restTitleTextView = (TextView) listItemView.findViewById(R.id.tour_title);
        restTitleTextView.setText(currentPOI.getTourTitle());

        TextView restDescriptionTextView = (TextView) listItemView.findViewById(R.id.tour_description);
        restDescriptionTextView.setText(currentPOI.getTourDescription());

        ImageView restImages = (ImageView) listItemView.findViewById(R.id.tour_image);
        restImages.setImageResource(currentPOI.getTourImage());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.tour_address_text);
        addressTextView.setText(currentPOI.getTourAddress());

        TextView openTextView = (TextView) listItemView.findViewById(R.id.tour_open_hours_text);
        openTextView.setText(currentPOI.getTourOpenHours());


        return listItemView;
    }
}
