package com.imobile3.spacexsample.dto;

import com.google.gson.annotations.SerializedName;

public class OrbitParams {

    @SerializedName("periapsis_km")
    private Double mPeriapsisKm;

    @SerializedName("mean_anomaly")
    private Double mMeanAnomaly;

    @SerializedName("inclination_deg")
    private Double mInclinationDeg;

    @SerializedName("regime")
    private String mRegime;

    @SerializedName("arg_of_pericenter")
    private Double mArgOfPericenter;

    @SerializedName("eccentricity")
    private Double mEccentricity;

    @SerializedName("apoapsis_km")
    private Double mApoapsisKm;

    @SerializedName("semi_major_axis_km")
    private Double mSemiMajorAxisKm;

    @SerializedName("raan")
    private Double mRaan;

    @SerializedName("epoch")
    private String mEpoch;

    @SerializedName("lifespan_years")
    private Double mLifespanYears;

    @SerializedName("reference_system")
    private String mReferenceSystem;

    @SerializedName("period_min")
    private Double mPeriodMin;

    @SerializedName("mean_motion")
    private Double mMeanMotion;

    @SerializedName("longitude")
    private Double mLongitude;

    public void setPeriapsisKm(Double periapsisKm) {
        mPeriapsisKm = periapsisKm;
    }

    public Double getPeriapsisKm() {
        return mPeriapsisKm;
    }

    public void setMeanAnomaly(Double meanAnomaly) {
        mMeanAnomaly = meanAnomaly;
    }

    public Double getMeanAnomaly() {
        return mMeanAnomaly;
    }

    public void setInclinationDeg(Double inclinationDeg) {
        mInclinationDeg = inclinationDeg;
    }

    public Double getInclinationDeg() {
        return mInclinationDeg;
    }

    public void setRegime(String regime) {
        mRegime = regime;
    }

    public String getRegime() {
        return mRegime;
    }

    public void setArgOfPericenter(Double argOfPericenter) {
        mArgOfPericenter = argOfPericenter;
    }

    public Double getArgOfPericenter() {
        return mArgOfPericenter;
    }

    public void setEccentricity(Double eccentricity) {
        mEccentricity = eccentricity;
    }

    public Double getEccentricity() {
        return mEccentricity;
    }

    public void setApoapsisKm(Double apoapsisKm) {
        mApoapsisKm = apoapsisKm;
    }

    public Double getApoapsisKm() {
        return mApoapsisKm;
    }

    public void setSemiMajorAxisKm(Double semiMajorAxisKm) {
        mSemiMajorAxisKm = semiMajorAxisKm;
    }

    public Double getSemiMajorAxisKm() {
        return mSemiMajorAxisKm;
    }

    public void setRaan(Double raan) {
        mRaan = raan;
    }

    public Double getRaan() {
        return mRaan;
    }

    public void setEpoch(String epoch) {
        mEpoch = epoch;
    }

    public String getEpoch() {
        return mEpoch;
    }

    public void setLifespanYears(Double lifespanYears) {
        mLifespanYears = lifespanYears;
    }

    public Double getLifespanYears() {
        return mLifespanYears;
    }

    public void setReferenceSystem(String referenceSystem) {
        mReferenceSystem = referenceSystem;
    }

    public String getReferenceSystem() {
        return mReferenceSystem;
    }

    public void setPeriodMin(Double periodMin) {
        mPeriodMin = periodMin;
    }

    public Double getPeriodMin() {
        return mPeriodMin;
    }

    public void setMeanMotion(Double meanMotion) {
        mMeanMotion = meanMotion;
    }

    public Double getMeanMotion() {
        return mMeanMotion;
    }

    public void setLongitude(Double Longitude) {
        mLongitude = Longitude;
    }

    public Double getLongitude() {
        return mLongitude;
    }

    @Override
    public String toString() {
        return "OrbitParams{" +
                "mPeriapsisKm = '" + mPeriapsisKm + '\'' +
                ",mMeanAnomaly = '" + mMeanAnomaly + '\'' +
                ",mInclinationDeg = '" + mInclinationDeg + '\'' +
                ",mRegime = '" + mRegime + '\'' +
                ",mArgOfPericenter = '" + mArgOfPericenter + '\'' +
                ",mEccentricity = '" + mEccentricity + '\'' +
                ",mApoapsisKm = '" + mApoapsisKm + '\'' +
                ",mSemiMajorAxisKm = '" + mSemiMajorAxisKm + '\'' +
                ",mRaan = '" + mRaan + '\'' +
                ",mEpoch = '" + mEpoch + '\'' +
                ",mLifespanYears = '" + mLifespanYears + '\'' +
                ",mReferenceSystem = '" + mReferenceSystem + '\'' +
                ",mPeriodMin = '" + mPeriodMin + '\'' +
                ",mMeanMotion = '" + mMeanMotion + '\'' +
                ",mLongitude = '" + mLongitude + '\'' +
                "}";
    }
}
