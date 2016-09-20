package com.abnd.maso.tourapp;

/**
 * Created by mariosoberanis on 9/18/16.
 * * {@link TourTJ} represents a place, restaurant, landmark or event in Tijuana México.
 * It contains resource IDs for the default Title, Images, Description, Address and Time scheduled or offices hours
 */
public class TourTJ {

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

    /* String resource Time or scheduled for the POI*/
    private int mTourOpenHours;

    /*
     * Create a new TourTJ object.
     *
     * @param tourCategory    the Category of this POI Restaurant, LandMark or NightClub
     * @param tourTitle       is the Main Title of the Point Of Interest POI that each record represents
     * @param tourImage       Main images that will represent the POI in the app
     * @param tourDescription Description for the POI
     * @param tourAddress     Where is the POI
     * @param tourOpenHours   When is the POI open


    public TourTJ(int tourCategory, int tourTitle, int tourImage, int tourDescription, int tourAddress, int tourOpenHours) {
        this.mTourTitle = tourTitle;
        this.mTourImage = tourImage;
        this.mTourDescription = tourDescription;
        this.mTourAddress = tourAddress;
        this.mTourOpenHours = tourOpenHours;
    }
    */

// TODO: 9/19/16 Delete this constructor its for testing only
    /**
     * Create a new TourTJ object for testing only .
     *
     * @param tourTitle       is the Main Title of the Point Of Interest POI that each record represents
     * @param tourDescription Description for the POI

     */

    public TourTJ( int tourTitle, int tourDescription) {
        this.mTourTitle = tourTitle;
        this.mTourDescription = tourDescription;

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

}
