package com.example.tuprak_3;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Profile implements Parcelable {
    private String profile_username;
    private Integer profile_avatar;
    private String profile_followers;
    private String profile_following;
    private String profile_bio;
    private Integer profile_post;

    public Profile(String profile_username, Integer profile_avatar, String profile_followers, String profile_following, String profile_bio, Integer profile_post) {
        this.profile_username = profile_username;
        this.profile_avatar = profile_avatar;
        this.profile_followers = profile_followers;
        this.profile_following = profile_following;
        this.profile_bio = profile_bio;
        this.profile_post = profile_post;
    }

    public Integer getProfile_post() {
        return profile_post;
    }

    public void setProfile_post(Integer profile_post) {
        this.profile_post = profile_post;
    }

    public String getProfile_username() {
        return profile_username;
    }

    public void setProfile_username(String profile_username) {
        this.profile_username = profile_username;
    }

    public Integer getProfile_avatar() {
        return profile_avatar;
    }

    public void setProfile_avatar(Integer profile_avatar) {
        this.profile_avatar = profile_avatar;
    }

    public String getProfile_followers() {
        return profile_followers;
    }

    public void setProfile_followers(String profile_followers) {
        this.profile_followers = profile_followers;
    }

    public String getProfile_following() {
        return profile_following;
    }

    public void setProfile_following(String profile_following) {
        this.profile_following = profile_following;
    }

    public String getProfile_bio() {
        return profile_bio;
    }

    public void setProfile_bio(String profile_bio) {
        this.profile_bio = profile_bio;
    }

    protected Profile(Parcel in) {
        profile_username = in.readString();
        if (in.readByte() == 0) {
            profile_avatar = null;
        } else {
            profile_avatar = in.readInt();
        }
        profile_followers = in.readString();
        profile_following = in.readString();
        profile_bio = in.readString();
        if (in.readByte() == 0) {
            profile_post = null;
        } else {
            profile_post = in.readInt();
        }
    }

    public static final Creator<Profile> CREATOR = new Creator<Profile>() {
        @Override
        public Profile createFromParcel(Parcel in) {
            return new Profile(in);
        }

        @Override
        public Profile[] newArray(int size) {
            return new Profile[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(profile_username);
        if (profile_avatar == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(profile_avatar);
        }
        dest.writeString(profile_followers);
        dest.writeString(profile_following);
        dest.writeString(profile_bio);
        if (profile_post == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(profile_post);
        }
    }
}
