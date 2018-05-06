package com.example.android.athenstourguideapp;



public class AthensTour {


    private int mAthensImageResourceId;

    private String mAthensStringResourceId;

    private String mAthensLocationResourceId;

    private String mAthensHoursResourceId;

    private String mAthensPhoneResourceId;

    public AthensTour(int mAthensImageResourceId, String mAthensStringResourceId, String mAthensLocationResourceId, String mAthensHoursResourceId, String mAthensPhoneResourceId) {
        this.mAthensImageResourceId = mAthensImageResourceId;
        this.mAthensStringResourceId = mAthensStringResourceId;
        this.mAthensLocationResourceId = mAthensLocationResourceId;
        this.mAthensHoursResourceId = mAthensHoursResourceId;
        this.mAthensPhoneResourceId = mAthensPhoneResourceId;
    }

    public int getmAthensImageResourceId() {
        return mAthensImageResourceId;
    }

    public String getmAthensStringResourceId() {
        return mAthensStringResourceId;
    }

    public String getmAthensLocationResourceId() {
        return mAthensLocationResourceId;
    }

    public String getmAthensHoursResourceId() {
        return mAthensHoursResourceId;
    }

    public String getmAthensPhoneResourceId() {
        return mAthensPhoneResourceId;
    }
}
