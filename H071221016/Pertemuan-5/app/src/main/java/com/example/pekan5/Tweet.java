package com.example.pekan5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Tweet implements Parcelable {

    private String username;
    private String name;
    private String desc;
    private int profilePhoto;
    private int postPhoto;
    private Uri selectedImageUri;


    public Tweet(String username, String name, String desc, int profilePhoto, int postPhoto) {
        this.username = username;
        this.name = name;
        this.desc = desc;
        this.profilePhoto = profilePhoto;
        this.postPhoto = postPhoto;
    }

    public Tweet(String username, String names, String descs, int profilePhotos, Uri selectedImageUri) {
        this.username = username;
        this.name = names;
        this.desc = descs;
        this.profilePhoto = profilePhotos;
        this.selectedImageUri = selectedImageUri;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(int profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public int getPostPhoto() {
        return postPhoto;
    }

    public void setPostPhoto(int postPhoto) {
        this.postPhoto = postPhoto;
    }

    public Uri getSelectedImageUri() {
        return selectedImageUri;
    }

    public void setSelectedImageUri(Uri selectedImageUri) {
        this.selectedImageUri = selectedImageUri;
    }

    protected Tweet(Parcel in) {
        username = in.readString();
        name = in.readString();
        desc = in.readString();
        profilePhoto = in.readInt();
        postPhoto = in.readInt();
    }

    public static final Creator<Tweet> CREATOR = new Creator<Tweet>() {
        @Override
        public Tweet createFromParcel(Parcel in) {
            return new Tweet(in);
        }

        @Override
        public Tweet[] newArray(int size) {
            return new Tweet[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(name);
        dest.writeString(desc);
        dest.writeInt(profilePhoto);
        dest.writeInt(postPhoto);
    }
}

