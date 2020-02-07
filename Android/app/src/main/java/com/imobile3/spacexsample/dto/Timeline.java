package com.imobile3.spacexsample.dto;

import com.google.gson.annotations.SerializedName;

public class Timeline {

    @SerializedName("rp1_loading")
    private Integer mRp1Loading;

    @SerializedName("liftoff")
    private Integer mLiftoff;

    @SerializedName("second_stage_ignition")
    private Integer mSecondStageIgnition;

    @SerializedName("first_stage_landing")
    private Integer mFirstStageLanding;

    @SerializedName("webcast_liftoff")
    private Integer mWebcastLiftoff;

    @SerializedName("first_stage_entry_burn")
    private Integer mFirstStageEntryBurn;

    @SerializedName("stage1_lox_loading")
    private Integer mStage1LoxLoading;

    @SerializedName("propellant_pressurization")
    private Integer mPropellantPressurization;

    @SerializedName("engine_chill")
    private Integer mEngineChill;

    @SerializedName("meco")
    private Integer mMeco;

    @SerializedName("first_stage_landing_burn")
    private Integer mFirstStageLandingBurn;

    @SerializedName("dragon_separation")
    private Integer mDragonSeparation;

    @SerializedName("go_for_prop_loading")
    private Integer mGoForPropLoading;

    @SerializedName("seco-1")
    private Integer mSeco1;

    @SerializedName("go_for_launch")
    private Integer mGoForLaunch;

    @SerializedName("stage_sep")
    private Integer mStageSep;

    @SerializedName("stage2_lox_loading")
    private Integer mStage2LoxLoading;

    @SerializedName("ignition")
    private Integer mIgnition;

    @SerializedName("maxq")
    private Integer mMaxq;

    @SerializedName("prelaunch_checks")
    private Integer mPrelaunchChecks;

    public void setRp1Loading(Integer rp1Loading) {
        mRp1Loading = rp1Loading;
    }

    public Integer getRp1Loading() {
        return mRp1Loading;
    }

    public void setLiftoff(Integer liftoff) {
        mLiftoff = liftoff;
    }

    public Integer getLiftoff() {
        return mLiftoff;
    }

    public void setSecondStageIgnition(Integer secondStageIgnition) {
        mSecondStageIgnition = secondStageIgnition;
    }

    public Integer getSecondStageIgnition() {
        return mSecondStageIgnition;
    }

    public void setFirstStageLanding(Integer firstStageLanding) {
        mFirstStageLanding = firstStageLanding;
    }

    public Integer getFirstStageLanding() {
        return mFirstStageLanding;
    }

    public void setWebcastLiftoff(Integer webcastLiftoff) {
        mWebcastLiftoff = webcastLiftoff;
    }

    public Integer getWebcastLiftoff() {
        return mWebcastLiftoff;
    }

    public void setFirstStageEntryBurn(Integer firstStageEntryBurn) {
        mFirstStageEntryBurn = firstStageEntryBurn;
    }

    public Integer getFirstStageEntryBurn() {
        return mFirstStageEntryBurn;
    }

    public void setStage1LoxLoading(Integer stage1LoxLoading) {
        mStage1LoxLoading = stage1LoxLoading;
    }

    public Integer getStage1LoxLoading() {
        return mStage1LoxLoading;
    }

    public void setPropellantPressurization(Integer propellantPressurization) {
        mPropellantPressurization = propellantPressurization;
    }

    public Integer getPropellantPressurization() {
        return mPropellantPressurization;
    }

    public void setEngineChill(Integer engineChill) {
        mEngineChill = engineChill;
    }

    public Integer getEngineChill() {
        return mEngineChill;
    }

    public void setMeco(Integer meco) {
        mMeco = meco;
    }

    public Integer getMeco() {
        return mMeco;
    }

    public void setFirstStageLandingBurn(Integer firstStageLandingBurn) {
        mFirstStageLandingBurn = firstStageLandingBurn;
    }

    public Integer getFirstStageLandingBurn() {
        return mFirstStageLandingBurn;
    }

    public void setDragonSeparation(Integer dragonSeparation) {
        mDragonSeparation = dragonSeparation;
    }

    public Integer getDragonSeparation() {
        return mDragonSeparation;
    }

    public void setGoForPropLoading(Integer goForPropLoading) {
        mGoForPropLoading = goForPropLoading;
    }

    public Integer getGoForPropLoading() {
        return mGoForPropLoading;
    }

    public void setSeco1(Integer seco1) {
        mSeco1 = seco1;
    }

    public Integer getSeco1() {
        return mSeco1;
    }

    public void setGoForLaunch(Integer goForLaunch) {
        mGoForLaunch = goForLaunch;
    }

    public Integer getGoForLaunch() {
        return mGoForLaunch;
    }

    public void setStageSep(Integer stageSep) {
        mStageSep = stageSep;
    }

    public Integer getStageSep() {
        return mStageSep;
    }

    public void setStage2LoxLoading(Integer stage2LoxLoading) {
        mStage2LoxLoading = stage2LoxLoading;
    }

    public Integer getStage2LoxLoading() {
        return mStage2LoxLoading;
    }

    public void setIgnition(Integer ignition) {
        mIgnition = ignition;
    }

    public Integer getIgnition() {
        return mIgnition;
    }

    public void setMaxq(Integer maxq) {
        mMaxq = maxq;
    }

    public Integer getMaxq() {
        return mMaxq;
    }

    public void setPrelaunchChecks(Integer prelaunchChecks) {
        mPrelaunchChecks = prelaunchChecks;
    }

    public Integer getPrelaunchChecks() {
        return mPrelaunchChecks;
    }

    @Override
    public String toString() {
        return "Timeline{" +
                "mRp1Loading = '" + mRp1Loading + '\'' +
                ",mLiftoff = '" + mLiftoff + '\'' +
                ",mSecondStageIgnition = '" + mSecondStageIgnition + '\'' +
                ",mFirstStageLanding = '" + mFirstStageLanding + '\'' +
                ",mWebcastLiftoff = '" + mWebcastLiftoff + '\'' +
                ",mFirstStageEntryBurn = '" + mFirstStageEntryBurn + '\'' +
                ",mStage1LoxLoading = '" + mStage1LoxLoading + '\'' +
                ",mPropellantPressurization = '" + mPropellantPressurization + '\'' +
                ",mEngineChill = '" + mEngineChill + '\'' +
                ",mMeco = '" + mMeco + '\'' +
                ",mFirstStageLandingBurn = '" + mFirstStageLandingBurn + '\'' +
                ",mDragonSeparation = '" + mDragonSeparation + '\'' +
                ",mGoForPropLoading = '" + mGoForPropLoading + '\'' +
                ",mSeco1 = '" + mSeco1 + '\'' +
                ",mGoForLaunch = '" + mGoForLaunch + '\'' +
                ",mStageSep = '" + mStageSep + '\'' +
                ",mStage2LoxLoading = '" + mStage2LoxLoading + '\'' +
                ",mIgnition = '" + mIgnition + '\'' +
                ",mMaxq = '" + mMaxq + '\'' +
                ",mPrelaunchChecks = '" + mPrelaunchChecks + '\'' +
                "}";
    }
}
