package com.example.tuprak_3;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Feeds implements Parcelable {
    private Integer feeds_avatar;
    private String feeds_username;
    private String feeds_time;
    private Integer feeds_image;

    public Feeds(Integer feeds_avatar, String feeds_username, String feeds_time, Integer feeds_image) {
        this.feeds_avatar = feeds_avatar;
        this.feeds_username = feeds_username;
        this.feeds_time = feeds_time;
        this.feeds_image = feeds_image;
    }

    public Integer getFeeds_avatar() {
        return feeds_avatar;
    }

    public void setFeeds_avatar(Integer feeds_avatar) {
        this.feeds_avatar = feeds_avatar;
    }

    public String getFeeds_username() {
        return feeds_username;
    }

    public void setFeeds_username(String feeds_username) {
        this.feeds_username = feeds_username;
    }

    public String getFeeds_time() {
        return feeds_time;
    }

    public void setFeeds_time(String feeds_time) {
        this.feeds_time = feeds_time;
    }

    public Integer getFeeds_image() {
        return feeds_image;
    }

    public void setFeeds_image(Integer feeds_image) {
        this.feeds_image = feeds_image;
    }

    protected Feeds(Parcel in) {
        if (in.readByte() == 0) {
            feeds_avatar = null;
        } else {
            feeds_avatar = in.readInt();
        }
        feeds_username = in.readString();
        feeds_time = in.readString();
        if (in.readByte() == 0) {
            feeds_image = null;
        } else {
            feeds_image = in.readInt();
        }
    }

    public static final Creator<Feeds> CREATOR = new Creator<Feeds>() {
        @Override
        public Feeds createFromParcel(Parcel in) {
            return new Feeds(in);
        }

        @Override
        public Feeds[] newArray(int size) {
            return new Feeds[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        if (feeds_avatar == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(feeds_avatar);
        }
        dest.writeString(feeds_username);
        dest.writeString(feeds_time);
        if (feeds_image == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(feeds_image);
        }
    }
}
