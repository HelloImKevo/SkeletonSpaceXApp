package com.imobile3.spacexsample.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SecondStage {

    @SerializedName("payloads")
    private List<PayloadsItem> mPayloads;

    @SerializedName("block")
    private Integer mBlock;

    public void setPayloads(List<PayloadsItem> payloads) {
        mPayloads = payloads;
    }

    public List<PayloadsItem> getPayloads() {
        return mPayloads;
    }

    public void setBlock(Integer block) {
        mBlock = block;
    }

    public Integer getBlock() {
        return mBlock;
    }

    @Override
    public String toString() {
        return "SecondStage{" +
                "mPayloads = '" + mPayloads + '\'' +
                ",mBlock = '" + mBlock + '\'' +
                "}";
    }
}
