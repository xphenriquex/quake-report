package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Earthquake {
    private double mMag;
    private String mPlace;
    private String mDate;

    public Earthquake(double mag, String place, Long date) {
        this.mMag = mag;
        this.mPlace = setPlaceFormatted(place);
        this.mDate = setDateFormatted(date);

    }

    public double getMag() {
        return mMag;
    }

    public String getPlace() {
        return mPlace;
    }

    public String getDate() {
        return mDate;
    }

    private String setDateFormatted(Long timeInMilliseconds){
        Date date = new Date(timeInMilliseconds);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM DD , YYYY");
        return dateFormat.format(date);
    }

    private String setPlaceFormatted(String place){
        List<String> list;
        String placeFormatted;

        //Formatted string place to better form of visualization
        list = Arrays.asList(place.split(","));
        int index = list.get(0).indexOf("of");
        String city = list.get(0).substring((index + 3));

        try{

            String country = list.get(1);
            placeFormatted = city + ", " + country;

        }catch (ArrayIndexOutOfBoundsException e){
            placeFormatted = city;
        }

        return placeFormatted;
    }

}
