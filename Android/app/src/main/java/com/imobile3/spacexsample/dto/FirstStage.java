package com.imobile3.spacexsample.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FirstStage {

    @SerializedName("cores")
    private List<CoresItem> mCores;

    public void setCores(List<CoresItem> cores) {
        mCores = cores;
    }

    public List<CoresItem> getCores() {
        return mCores;
    }

    @Override
    public String toString() {
        return "FirstStage{" +
                "mCores = '" + mCores + '\'' +
                "}";
    }
}
