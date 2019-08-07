package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Earthquake {
    private double mMag;
    private String mPlace;
    private Long mTime;

    public Earthquake(double mag, String place, Long time) {
        this.mMag = mag;
        this.mPlace = place;
        this.mTime = time;

    }

    public double getMag() {
        return mMag;
    }

    public String getPlace() {
        List<String> list;
        String placeFormatted;

        //Formatted string place to a better visualization
        list = Arrays.asList(mPlace.split(","));
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

    public String getDate() {
        Date date = new Date(mTime);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM DD, YYYY");
        return dateFormat.format(date);
    }

    public String getHour(){
        Date hour = new Date(mTime);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        return dateFormat.format(hour);
    }



}
