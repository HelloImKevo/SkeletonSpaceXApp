package com.imobile3.spacexsample.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Launch {

    @SerializedName("mission_name")
    private String mMissionName;

    @SerializedName("static_fire_date_utc")
    private String mStaticFireDateUtc;

    @SerializedName("launch_year")
    private String mLaunchYear;

    @SerializedName("launch_date_utc")
    private String mLaunchDateUtc;

    @SerializedName("flight_number")
    private Integer mFlightNumber;

    @SerializedName("is_tentative")
    private boolean mIsTentative;

    @SerializedName("rocket")
    private Rocket mRocket;

    @SerializedName("mission_id")
    private List<String> mMissionId;

    @SerializedName("launch_window")
    private Integer mLaunchWindow;

    @SerializedName("launch_date_local")
    private String mLaunchDateLocal;

    @SerializedName("tentative_max_precision")
    private String mTentativeMaxPrecision;

    @SerializedName("ships")
    private List<String> mShips;

    @SerializedName("launch_date_unix")
    private Integer mLaunchDateUnix;

    @SerializedName("launch_success")
    private boolean mLaunchSuccess;

    @SerializedName("static_fire_date_unix")
    private Integer mStaticFireDateUnix;

    @SerializedName("tbd")
    private boolean mTbd;

    @SerializedName("timeline")
    private Timeline mTimeline;

    @SerializedName("telemetry")
    private Telemetry mTelemetry;

    @SerializedName("links")
    private Links mLinks;

    @SerializedName("details")
    private String mDetails;

    @SerializedName("launch_site")
    private LaunchSite mLaunchSite;

    @SerializedName("upcoming")
    private boolean mUpcoming;

    public void setMissionName(String missionName) {
        mMissionName = missionName;
    }

    public String getMissionName() {
        return mMissionName;
    }

    public void setStaticFireDateUtc(String staticFireDateUtc) {
        mStaticFireDateUtc = staticFireDateUtc;
    }

    public String getStaticFireDateUtc() {
        return mStaticFireDateUtc;
    }

    public void setLaunchYear(String launchYear) {
        mLaunchYear = launchYear;
    }

    public String getLaunchYear() {
        return mLaunchYear;
    }

    public void setLaunchDateUtc(String launchDateUtc) {
        mLaunchDateUtc = launchDateUtc;
    }

    public String getLaunchDateUtc() {
        return mLaunchDateUtc;
    }

    public void setFlightNumber(Integer flightNumber) {
        mFlightNumber = flightNumber;
    }

    public Integer getFlightNumber() {
        return mFlightNumber;
    }

    public void setIsTentative(boolean isTentative) {
        mIsTentative = isTentative;
    }

    public boolean isIsTentative() {
        return mIsTentative;
    }

    public void setRocket(Rocket rocket) {
        mRocket = rocket;
    }

    public Rocket getRocket() {
        return mRocket;
    }

    public void setMissionId(List<String> missionId) {
        mMissionId = missionId;
    }

    public List<String> getMissionId() {
        return mMissionId;
    }

    public void setLaunchWindow(Integer launchWindow) {
        mLaunchWindow = launchWindow;
    }

    public Integer getLaunchWindow() {
        return mLaunchWindow;
    }

    public void setLaunchDateLocal(String launchDateLocal) {
        mLaunchDateLocal = launchDateLocal;
    }

    public String getLaunchDateLocal() {
        return mLaunchDateLocal;
    }

    public void setTentativeMaxPrecision(String tentativeMaxPrecision) {
        mTentativeMaxPrecision = tentativeMaxPrecision;
    }

    public String getTentativeMaxPrecision() {
        return mTentativeMaxPrecision;
    }

    public void setShips(List<String> ships) {
        mShips = ships;
    }

    public List<String> getShips() {
        return mShips;
    }

    public void setLaunchDateUnix(Integer launchDateUnix) {
        mLaunchDateUnix = launchDateUnix;
    }

    public Integer getLaunchDateUnix() {
        return mLaunchDateUnix;
    }

    public void setLaunchSuccess(boolean launchSuccess) {
        mLaunchSuccess = launchSuccess;
    }

    public boolean isLaunchSuccess() {
        return mLaunchSuccess;
    }

    public void setStaticFireDateUnix(Integer staticFireDateUnix) {
        mStaticFireDateUnix = staticFireDateUnix;
    }

    public Integer getStaticFireDateUnix() {
        return mStaticFireDateUnix;
    }

    public void setTbd(boolean tbd) {
        mTbd = tbd;
    }

    public boolean isTbd() {
        return mTbd;
    }

    public void setTimeline(Timeline timeline) {
        mTimeline = timeline;
    }

    public Timeline getTimeline() {
        return mTimeline;
    }

    public void setTelemetry(Telemetry telemetry) {
        mTelemetry = telemetry;
    }

    public Telemetry getTelemetry() {
        return mTelemetry;
    }

    public void setLinks(Links links) {
        mLinks = links;
    }

    public Links getLinks() {
        return mLinks;
    }

    public void setDetails(String details) {
        mDetails = details;
    }

    public String getDetails() {
        return mDetails;
    }

    public void setLaunchSite(LaunchSite launchSite) {
        mLaunchSite = launchSite;
    }

    public LaunchSite getLaunchSite() {
        return mLaunchSite;
    }

    public void setUpcoming(boolean upcoming) {
        mUpcoming = upcoming;
    }

    public boolean isUpcoming() {
        return mUpcoming;
    }

    @Override
    public String toString() {
        return "SpaceXLaunch{" +
                "mMissionName = '" + mMissionName + '\'' +
                ",mStaticFireDateUtc = '" + mStaticFireDateUtc + '\'' +
                ",mLaunchYear = '" + mLaunchYear + '\'' +
                ",mLaunchDateUtc = '" + mLaunchDateUtc + '\'' +
                ",mFlightNumber = '" + mFlightNumber + '\'' +
                ",mIsTentative = '" + mIsTentative + '\'' +
                ",mRocket = '" + mRocket + '\'' +
                ",mMissionId = '" + mMissionId + '\'' +
                ",mLaunchWindow = '" + mLaunchWindow + '\'' +
                ",mLaunchDateLocal = '" + mLaunchDateLocal + '\'' +
                ",mTentativeMaxPrecision = '" + mTentativeMaxPrecision + '\'' +
                ",mShips = '" + mShips + '\'' +
                ",mLaunchDateUnix = '" + mLaunchDateUnix + '\'' +
                ",mLaunchSuccess = '" + mLaunchSuccess + '\'' +
                ",mStaticFireDateUnix = '" + mStaticFireDateUnix + '\'' +
                ",mTbd = '" + mTbd + '\'' +
                ",mTimeline = '" + mTimeline + '\'' +
                ",mTelemetry = '" + mTelemetry + '\'' +
                ",mLinks = '" + mLinks + '\'' +
                ",mDetails = '" + mDetails + '\'' +
                ",mLaunchSite = '" + mLaunchSite + '\'' +
                ",mUpcoming = '" + mUpcoming + '\'' +
                "}";
    }
}
