package com.example.tuprak_3;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Post implements Parcelable {
    private Integer avatar;
    private String username;
    private Integer image_post;
    private String like_count;
    private String description;
    private String time;

    public Post() {

    }

    public Post(Integer avatar, String username, Integer image_post, String like_count, String description, String time) {
        this.avatar = avatar;
        this.username = username;
        this.image_post = image_post;
        this.like_count = like_count;
        this.description = description;
        this.time = time;
    }

    public Integer getAvatar() {
        return avatar;
    }

    public void setAvatar(Integer avatar) {
        this.avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getImage_post() {
        return image_post;
    }

    public void setImage_post(Integer image_post) {
        this.image_post = image_post;
    }

    public String getLike_count() {
        return like_count;
    }

    public void setLike_count(String like_count) {
        this.like_count = like_count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    protected Post(Parcel in) {
        if (in.readByte() == 0) {
            avatar = null;
        } else {
            avatar = in.readInt();
        }
        username = in.readString();
        if (in.readByte() == 0) {
            image_post = null;
        } else {
            image_post = in.readInt();
        }
        like_count = in.readString();
        description = in.readString();
        time = in.readString();
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        if (avatar == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(avatar);
        }
        dest.writeString(username);
        if (image_post == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(image_post);
        }
        dest.writeString(like_count);
        dest.writeString(description);
        dest.writeString(time);
    }
}
