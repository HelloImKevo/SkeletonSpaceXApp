package com.imobile3.spacexsample.dto;

import com.google.gson.annotations.SerializedName;

public class Rocket {

    @SerializedName("second_stage")
    private SecondStage mSecondStage;

    @SerializedName("rocket_id")
    private String mRocketId;

    @SerializedName("first_stage")
    private FirstStage mFirstStage;

    @SerializedName("rocket_type")
    private String mRocketType;

    @SerializedName("rocket_name")
    private String mRocketName;

    @SerializedName("fairings")
    private Fairings mFairings;

    public void setSecondStage(SecondStage secondStage) {
        mSecondStage = secondStage;
    }

    public SecondStage getSecondStage() {
        return mSecondStage;
    }

    public void setRocketId(String rocketId) {
        mRocketId = rocketId;
    }

    public String getRocketId() {
        return mRocketId;
    }

    public void setFirstStage(FirstStage firstStage) {
        mFirstStage = firstStage;
    }

    public FirstStage getFirstStage() {
        return mFirstStage;
    }

    public void setRocketType(String rocketType) {
        mRocketType = rocketType;
    }

    public String getRocketType() {
        return mRocketType;
    }

    public void setRocketName(String rocketName) {
        mRocketName = rocketName;
    }

    public String getRocketName() {
        return mRocketName;
    }

    public void setFairings(Fairings fairings) {
        mFairings = fairings;
    }

    public Fairings getFairings() {
        return mFairings;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "mSecondStage = '" + mSecondStage + '\'' +
                ",mRocketId = '" + mRocketId + '\'' +
                ",mFirstStage = '" + mFirstStage + '\'' +
                ",mRocketType = '" + mRocketType + '\'' +
                ",mRocketName = '" + mRocketName + '\'' +
                ",mFairings = '" + mFairings + '\'' +
                "}";
    }
}
