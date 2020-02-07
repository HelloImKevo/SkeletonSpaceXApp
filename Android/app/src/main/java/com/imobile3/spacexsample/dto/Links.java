package com.imobile3.spacexsample.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Links {

    @SerializedName("mission_patch_small")
    private String mMissionPatchSmall;

    @SerializedName("mission_patch")
    private String mMissionPatch;

    @SerializedName("video_link")
    private String mVideoLink;

    @SerializedName("flickr_images")
    private List<String> mFlickrImages;

    @SerializedName("reddit_recovery")
    private String mRedditRecovery;

    @SerializedName("reddit_media")
    private String mRedditMedia;

    @SerializedName("reddit_campaign")
    private String mRedditCampaign;

    @SerializedName("wikipedia")
    private String mWikipedia;

    @SerializedName("reddit_launch")
    private String mRedditLaunch;

    @SerializedName("youtube_id")
    private String mYoutubeId;

    @SerializedName("presskit")
    private String mPresskit;

    @SerializedName("article_link")
    private String mArticleLink;

    public void setMissionPatchSmall(String missionPatchSmall) {
        mMissionPatchSmall = missionPatchSmall;
    }

    public String getMissionPatchSmall() {
        return mMissionPatchSmall;
    }

    public void setMissionPatch(String missionPatch) {
        mMissionPatch = missionPatch;
    }

    public String getMissionPatch() {
        return mMissionPatch;
    }

    public void setVideoLink(String videoLink) {
        mVideoLink = videoLink;
    }

    public String getVideoLink() {
        return mVideoLink;
    }

    public void setFlickrImages(List<String> flickrImages) {
        mFlickrImages = flickrImages;
    }

    public List<String> getFlickrImages() {
        return mFlickrImages;
    }

    public void setRedditRecovery(String redditRecovery) {
        mRedditRecovery = redditRecovery;
    }

    public String getRedditRecovery() {
        return mRedditRecovery;
    }

    public void setRedditMedia(String redditMedia) {
        mRedditMedia = redditMedia;
    }

    public String getRedditMedia() {
        return mRedditMedia;
    }

    public void setRedditCampaign(String redditCampaign) {
        mRedditCampaign = redditCampaign;
    }

    public String getRedditCampaign() {
        return mRedditCampaign;
    }

    public void setWikipedia(String wikipedia) {
        mWikipedia = wikipedia;
    }

    public String getWikipedia() {
        return mWikipedia;
    }

    public void setRedditLaunch(String redditLaunch) {
        mRedditLaunch = redditLaunch;
    }

    public String getRedditLaunch() {
        return mRedditLaunch;
    }

    public void setYoutubeId(String youtubeId) {
        mYoutubeId = youtubeId;
    }

    public String getYoutubeId() {
        return mYoutubeId;
    }

    public void setPresskit(String presskit) {
        mPresskit = presskit;
    }

    public String getPresskit() {
        return mPresskit;
    }

    public void setArticleLink(String articleLink) {
        mArticleLink = articleLink;
    }

    public String getArticleLink() {
        return mArticleLink;
    }

    @Override
    public String toString() {
        return "Links{" +
                "mMissionPatchSmall = '" + mMissionPatchSmall + '\'' +
                ",mMissionPatch = '" + mMissionPatch + '\'' +
                ",mVideoLink = '" + mVideoLink + '\'' +
                ",mFlickrImages = '" + mFlickrImages + '\'' +
                ",mRedditRecovery = '" + mRedditRecovery + '\'' +
                ",mRedditMedia = '" + mRedditMedia + '\'' +
                ",mRedditCampaign = '" + mRedditCampaign + '\'' +
                ",mWikipedia = '" + mWikipedia + '\'' +
                ",mRedditLaunch = '" + mRedditLaunch + '\'' +
                ",mYoutubeId = '" + mYoutubeId + '\'' +
                ",mPresskit = '" + mPresskit + '\'' +
                ",mArticleLink = '" + mArticleLink + '\'' +
                "}";
    }
}
