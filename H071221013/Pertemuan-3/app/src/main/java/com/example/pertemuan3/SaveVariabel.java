package com.example.pertemuan3;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class SaveVariabel implements Parcelable { //mengirim melalui intent
    //variabel dari file saveVariabel
    private String nama, caption;
    private Integer imageprofile, imagefeed, imagestory, followers, following;

    //membuat objek dari kls sveVariabel
    public SaveVariabel(String nama, String caption, Integer imageprofile, Integer imagefeed, Integer imagestory, Integer followers, Integer following) {
        this.nama = nama;
        this.caption = caption;
        this.imageprofile = imageprofile;
        this.imagefeed = imagefeed;
        this.imagestory = imagestory;
        this.followers = followers;
        this.following = following;
    }

    protected SaveVariabel(Parcel in) {
        nama = in.readString();
        caption = in.readString();
        if (in.readByte() == 0) {
            imageprofile = null;
        } else {
            imageprofile = in.readInt();
        }
        if (in.readByte() == 0) {
            imagefeed = null;
        } else {
            imagefeed = in.readInt();
        }
        if (in.readByte() == 0) {
            imagestory = null;
        } else {
            imagestory = in.readInt();
        }
        if (in.readByte() == 0) {
            followers = null;
        } else {
            followers = in.readInt();
        }
        if (in.readByte() == 0) {
            following = null;
        } else {
            following = in.readInt();
        }
    }

    public static final Creator<SaveVariabel> CREATOR = new Creator<SaveVariabel>() {
        @Override
        public SaveVariabel createFromParcel(Parcel in) {
            return new SaveVariabel(in);
        }

        @Override
        public SaveVariabel[] newArray(int size) {
            return new SaveVariabel[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Integer getImageprofile() {
        return imageprofile;
    }

    public void setImageprofile(Integer imageprofile) {
        this.imageprofile = imageprofile;
    }

    public Integer getImagefeed() {
        return imagefeed;
    }

    public void setImagefeed(Integer imagefeed) {
        this.imagefeed = imagefeed;
    }

    public Integer getImagestory() {
        return imagestory;
    }

    public void setImagestory(Integer imagestory) {
        this.imagestory = imagestory;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(caption);
        if (imageprofile == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(imageprofile);
        }
        if (imagefeed == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(imagefeed);
        }
        if (imagestory == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(imagestory);
        }
        if (followers == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(followers);
        }
        if (following == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(following);
        }
    }
}
