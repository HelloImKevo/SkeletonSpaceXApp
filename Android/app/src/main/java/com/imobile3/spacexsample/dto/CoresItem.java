package com.imobile3.spacexsample.dto;

import com.google.gson.annotations.SerializedName;

public class CoresItem {

    @SerializedName("flight")
    private Integer mFlight;

    @SerializedName("landing_type")
    private String mLandingType;

    @SerializedName("gridfins")
    private boolean mGridfins;

    @SerializedName("landing_intent")
    private boolean mLandingIntent;

    @SerializedName("legs")
    private boolean mLegs;

    @SerializedName("land_success")
    private boolean mLandSuccess;

    @SerializedName("landing_vehicle")
    private String mLandingVehicle;

    @SerializedName("block")
    private Integer mBlock;

    @SerializedName("reused")
    private boolean mReused;

    @SerializedName("core_serial")
    private String mCoreSerial;

    public void setFlight(Integer flight) {
        mFlight = flight;
    }

    public Integer getFlight() {
        return mFlight;
    }

    public void setLandingType(String landingType) {
        mLandingType = landingType;
    }

    public String getLandingType() {
        return mLandingType;
    }

    public void setGridfins(boolean gridfins) {
        mGridfins = gridfins;
    }

    public boolean isGridfins() {
        return mGridfins;
    }

    public void setLandingIntent(boolean landingIntent) {
        mLandingIntent = landingIntent;
    }

    public boolean isLandingIntent() {
        return mLandingIntent;
    }

    public void setLegs(boolean legs) {
        mLegs = legs;
    }

    public boolean isLegs() {
        return mLegs;
    }

    public void setLandSuccess(boolean landSuccess) {
        mLandSuccess = landSuccess;
    }

    public boolean isLandSuccess() {
        return mLandSuccess;
    }

    public void setLandingVehicle(String landingVehicle) {
        mLandingVehicle = landingVehicle;
    }

    public String getLandingVehicle() {
        return mLandingVehicle;
    }

    public void setBlock(Integer block) {
        mBlock = block;
    }

    public Integer getBlock() {
        return mBlock;
    }

    public void setReused(boolean reused) {
        mReused = reused;
    }

    public boolean isReused() {
        return mReused;
    }

    public void setCoreSerial(String coreSerial) {
        mCoreSerial = coreSerial;
    }

    public String getCoreSerial() {
        return mCoreSerial;
    }

    @Override
    public String toString() {
        return "CoresItem{" +
                "mFlight = '" + mFlight + '\'' +
                ",mLandingType = '" + mLandingType + '\'' +
                ",mGridfins = '" + mGridfins + '\'' +
                ",mLandingIntent = '" + mLandingIntent + '\'' +
                ",mLegs = '" + mLegs + '\'' +
                ",mLandSuccess = '" + mLandSuccess + '\'' +
                ",mLandingVehicle = '" + mLandingVehicle + '\'' +
                ",mBlock = '" + mBlock + '\'' +
                ",mReused = '" + mReused + '\'' +
                ",mCoreSerial = '" + mCoreSerial + '\'' +
                "}";
    }
}
