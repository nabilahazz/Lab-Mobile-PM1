package com.example.praktikum3;

import android.os.Parcel;
import android.os.Parcelable;

public class Post implements Parcelable {

    public Integer getImgprofil() {
        return imgprofil;
    }

    public void setImgprofil(Integer imgprofil) {
        this.imgprofil = imgprofil;
    }

    public Integer getImgpost() {
        return imgpost;
    }

    public void setImgpost(Integer imgpost) {
        this.imgpost = imgpost;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    private Integer imgprofil;
    private Integer imgpost;
    private String username;

    public Post(Integer imgprofil, Integer imgpost, String username, String caption) {
        this.imgprofil = imgprofil;
        this.imgpost = imgpost;
        this.username = username;
        this.caption = caption;
    }

    private String caption;
    protected Post(Parcel in) {
        username=in.readString();
        caption=in.readString();
        if (in.readByte() == 0) {
            imgprofil = null;
        } else {
            imgpost = in.readInt();
        }
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(username);
        parcel.writeString(caption);
        if (imgpost == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(imgpost);
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Post> CREATOR = new Creator<Post>() {
        @Override
        public Post createFromParcel(Parcel in) {
            return new Post(in);
        }

        @Override
        public Post[] newArray(int size) {
            return new Post[size];
        }
    };
}
