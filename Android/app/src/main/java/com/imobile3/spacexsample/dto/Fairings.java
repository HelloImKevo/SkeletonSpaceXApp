package com.imobile3.spacexsample.dto;

import com.google.gson.annotations.SerializedName;

public class Fairings {

    @SerializedName("recovered")
    private Boolean mRecovered;

    @SerializedName("recovery_attempt")
    private Boolean mRecoveryAttempt;

    @SerializedName("ship")
    private String mShip;

    @SerializedName("reused")
    private Boolean mReused;

    public void setRecovered(boolean recovered) {
        this.mRecovered = recovered;
    }

    public boolean isRecovered() {
        return mRecovered;
    }

    public void setRecoveryAttempt(boolean recoveryAttempt) {
        this.mRecoveryAttempt = recoveryAttempt;
    }

    public boolean isRecoveryAttempt() {
        return mRecoveryAttempt;
    }

    public void setShip(String ship) {
        this.mShip = ship;
    }

    public String getShip() {
        return mShip;
    }

    public void setReused(boolean reused) {
        this.mReused = reused;
    }

    public boolean isReused() {
        return mReused;
    }

    @Override
    public String toString() {
        return "Fairings{" +
                ",mRecovered = '" + mRecovered + '\'' +
                ",mRecoveryAttempt = '" + mRecoveryAttempt + '\'' +
                ",mShip = '" + mShip + '\'' +
                ",mReused = '" + mReused + '\'' +
                "}";
    }
}
