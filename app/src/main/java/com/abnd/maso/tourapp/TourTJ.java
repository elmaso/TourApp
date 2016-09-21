package com.abnd.maso.tourapp;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mariosoberanis on 9/18/16.
 * * {@link TourTJ} represents a place, restaurant, landmark or event in Tijuana México.
 * It contains resource IDs for the default Title, Images, Description, Address and Time scheduled or offices hours
 */
public class TourTJ implements Parcelable {

    /**
     * String resource Category for the POI
     */
    private int mTourCategory;

    /**
     * String resource Title for the POI
     */
    private int mTourTitle;

    /**
     * Images resource ID for the  POI
     */
    private int mTourImage;

    /**
     * String resource Description for the POI
     */
    private int mTourDescription;

    /**
     * String resource Address for the POI
     */
    private int mTourAddress;

    /**
     * String resource Time or scheduled for the POI
     */
    private int mTourOpenHours;


    /**
     * Location for the POI
     */
    private Location mLocation;

    /**
     * Create a new TourTJ object.
     *
     * @param tourTitle       is the Main Title of the Point Of Interest POI that each record represents
     * @param tourImage       Main images that will represent the POI in the app
     * @param tourDescription Description for the POI
     * @param tourAddress     Where is the POI
     * @param tourOpenHours   When is the POI open
     */


    public TourTJ(int tourTitle, int tourImage, int tourDescription, int tourAddress, int tourOpenHours) {
        this.mTourTitle = tourTitle;
        this.mTourImage = tourImage;
        this.mTourDescription = tourDescription;
        this.mTourAddress = tourAddress;
        this.mTourOpenHours = tourOpenHours;
    }




    public int getTourCategory() {
        return mTourCategory;
    }

    public int getTourTitle() {
        return mTourTitle;
    }

    public int getTourImage() {
        return mTourImage;
    }

    public int getTourDescription() {
        return mTourDescription;
    }

    public int getTourAddress() {
        return mTourAddress;
    }

    public int getTourOpenHours() {
        return mTourOpenHours;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mTourTitle);
        parcel.writeInt(mTourImage);
        parcel.writeInt(mTourDescription);
        parcel.writeInt(mTourAddress);
        parcel.writeInt(mTourOpenHours);

    }

    public static final Parcelable.Creator<TourTJ> CREATOR = new Parcelable.Creator<TourTJ>() {

        @Override
        public TourTJ createFromParcel(Parcel parcel) {
            return null;
        }

        public TourTJ[] newArray(int size) {
            return new TourTJ[size];
        }


    };
}
