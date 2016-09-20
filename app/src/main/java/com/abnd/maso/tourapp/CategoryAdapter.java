package com.abnd.maso.tourapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mariosoberanis on 9/18/16.
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link TourTJ} objects.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    public CategoryAdapter(Context mContext, FragmentManager fm) {
        super(fm);
        this.mContext = mContext;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new LandMarks();
        } else if (position == 1) {
            return new LandMarks();
        } else if (position == 2) {
            return new LandMarks();
        } else {
            return new LandMarks();
        }
    }


    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    /*
    * Changes the title base on the current Tab Selection
    * */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_restaurant);
        } else if (position == 1) {
            return mContext.getString(R.string.category_night_clubs);
        } else if (position == 2) {
            return mContext.getString(R.string.category_landmarks);
        } else
            return mContext.getString(R.string.category_events);
    }

}

