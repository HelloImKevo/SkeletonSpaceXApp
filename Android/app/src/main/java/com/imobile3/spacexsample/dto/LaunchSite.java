package com.imobile3.spacexsample.dto;

import com.google.gson.annotations.SerializedName;

public class LaunchSite {

    @SerializedName("site_name")
    private String mSiteName;

    @SerializedName("site_id")
    private String mSiteId;

    @SerializedName("site_name_long")
    private String mSiteNameLong;

    public void setSiteName(String siteName) {
        mSiteName = siteName;
    }

    public String getSiteName() {
        return mSiteName;
    }

    public void setSiteId(String siteId) {
        mSiteId = siteId;
    }

    public String getSiteId() {
        return mSiteId;
    }

    public void setSiteNameLong(String siteNameLong) {
        mSiteNameLong = siteNameLong;
    }

    public String getSiteNameLong() {
        return mSiteNameLong;
    }

    @Override
    public String toString() {
        return "LaunchSite{" +
                "mSiteName = '" + mSiteName + '\'' +
                ",mSiteId = '" + mSiteId + '\'' +
                ",mSiteNameLong = '" + mSiteNameLong + '\'' +
                "}";
    }
}
