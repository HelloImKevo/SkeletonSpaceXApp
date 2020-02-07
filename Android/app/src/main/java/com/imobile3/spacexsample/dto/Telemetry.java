package com.imobile3.spacexsample.dto;

import com.google.gson.annotations.SerializedName;

public class Telemetry {

    @SerializedName("flight_club")
    private String mFlightClub;

    public void setFlightClub(String flightClub) {
        mFlightClub = flightClub;
    }

    public String getFlightClub() {
        return mFlightClub;
    }

    @Override
    public String toString() {
        return "Telemetry{" +
                "mFlightClub = '" + mFlightClub + '\'' +
                "}";
    }
}
