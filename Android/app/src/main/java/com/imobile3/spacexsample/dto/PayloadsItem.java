package com.imobile3.spacexsample.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PayloadsItem {

    @SerializedName("payload_type")
    private String mPayloadType;

    @SerializedName("payload_id")
    private String mPayloadId;

    @SerializedName("cargo_manifest")
    private String mCargoManifest;

    @SerializedName("norad_id")
    private List<Integer> mNoradId;

    @SerializedName("cap_serial")
    private String mCapSerial;

    @SerializedName("orbit_params")
    private OrbitParams mOrbitParams;

    @SerializedName("payload_mass_lbs")
    private Double mPayloadMassLbs;

    @SerializedName("manufacturer")
    private String mManufacturer;

    @SerializedName("payload_mass_kg")
    private Double mPayloadMassKg;

    @SerializedName("mass_returned_lbs")
    private Double mMassReturnedLbs;

    @SerializedName("flight_time_sec")
    private Long mFlightTimeSec;

    @SerializedName("nationality")
    private String mNationality;

    @SerializedName("customers")
    private List<String> mCustomers;

    @SerializedName("orbit")
    private String mOrbit;

    @SerializedName("reused")
    private boolean mReused;

    @SerializedName("mass_returned_kg")
    private Double mMassReturnedKg;

    public void setPayloadType(String payloadType) {
        mPayloadType = payloadType;
    }

    public String getPayloadType() {
        return mPayloadType;
    }

    public void setPayloadId(String payloadId) {
        mPayloadId = payloadId;
    }

    public String getPayloadId() {
        return mPayloadId;
    }

    public void setCargoManifest(String cargoManifest) {
        mCargoManifest = cargoManifest;
    }

    public String getCargoManifest() {
        return mCargoManifest;
    }

    public void setNoradId(List<Integer> noradId) {
        mNoradId = noradId;
    }

    public List<Integer> getNoradId() {
        return mNoradId;
    }

    public void setCapSerial(String capSerial) {
        mCapSerial = capSerial;
    }

    public String getCapSerial() {
        return mCapSerial;
    }

    public void setOrbitParams(OrbitParams orbitParams) {
        mOrbitParams = orbitParams;
    }

    public OrbitParams getOrbitParams() {
        return mOrbitParams;
    }

    public void setPayloadMassLbs(Double payloadMassLbs) {
        mPayloadMassLbs = payloadMassLbs;
    }

    public Double getPayloadMassLbs() {
        return mPayloadMassLbs;
    }

    public void setManufacturer(String manufacturer) {
        mManufacturer = manufacturer;
    }

    public String getManufacturer() {
        return mManufacturer;
    }

    public void setPayloadMassKg(Double payloadMassKg) {
        mPayloadMassKg = payloadMassKg;
    }

    public Double getPayloadMassKg() {
        return mPayloadMassKg;
    }

    public void setMassReturnedLbs(Double massReturnedLbs) {
        mMassReturnedLbs = massReturnedLbs;
    }

    public Double getMassReturnedLbs() {
        return mMassReturnedLbs;
    }

    public void setFlightTimeSec(Long flightTimeSec) {
        mFlightTimeSec = flightTimeSec;
    }

    public Long getFlightTimeSec() {
        return mFlightTimeSec;
    }

    public void setNationality(String nationality) {
        mNationality = nationality;
    }

    public String getNationality() {
        return mNationality;
    }

    public void setCustomers(List<String> customers) {
        mCustomers = customers;
    }

    public List<String> getCustomers() {
        return mCustomers;
    }

    public void setOrbit(String orbit) {
        mOrbit = orbit;
    }

    public String getOrbit() {
        return mOrbit;
    }

    public void setReused(boolean reused) {
        mReused = reused;
    }

    public boolean isReused() {
        return mReused;
    }

    public void setMassReturnedKg(Double massReturnedKg) {
        mMassReturnedKg = massReturnedKg;
    }

    public Double getMassReturnedKg() {
        return mMassReturnedKg;
    }

    @Override
    public String toString() {
        return "PayloadsItem{" +
                "mPayloadType = '" + mPayloadType + '\'' +
                ",mPayloadId = '" + mPayloadId + '\'' +
                ",mCargoManifest = '" + mCargoManifest + '\'' +
                ",mNoradId = '" + mNoradId + '\'' +
                ",mCapSerial = '" + mCapSerial + '\'' +
                ",mOrbitParams = '" + mOrbitParams + '\'' +
                ",mPayloadMassLbs = '" + mPayloadMassLbs + '\'' +
                ",mManufacturer = '" + mManufacturer + '\'' +
                ",mPayloadMassKg = '" + mPayloadMassKg + '\'' +
                ",mMassReturnedLbs = '" + mMassReturnedLbs + '\'' +
                ",mFlightTimeSec = '" + mFlightTimeSec + '\'' +
                ",mNationality = '" + mNationality + '\'' +
                ",mCustomers = '" + mCustomers + '\'' +
                ",mOrbit = '" + mOrbit + '\'' +
                ",mReused = '" + mReused + '\'' +
                ",mMassReturnedKg = '" + mMassReturnedKg + '\'' +
                "}";
    }
}
