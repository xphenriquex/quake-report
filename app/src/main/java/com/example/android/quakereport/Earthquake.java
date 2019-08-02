package com.example.android.quakereport;

public class Earthquake {
    private double mMag;
    private String mPlace;
    private String mDate;

    public Earthquake(double mMag, String mPlace, String mDate) {
        this.mMag = mMag;
        this.mPlace = mPlace;
        this.mDate = mDate;
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
}
