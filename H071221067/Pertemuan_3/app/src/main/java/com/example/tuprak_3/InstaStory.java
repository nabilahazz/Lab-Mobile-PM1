package com.example.tuprak_3;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class InstaStory implements Parcelable {
    private Integer story_avatar;
    private String story_username;

    public InstaStory(Integer story_avatar, String story_username) {
        this.story_avatar = story_avatar;
        this.story_username = story_username;
    }

    public Integer getStory_avatar() {
        return story_avatar;
    }

    public void setStory_avatar(Integer story_avatar) {
        this.story_avatar = story_avatar;
    }

    public String getStory_username() {
        return story_username;
    }

    public void setStory_username(String story_username) {
        this.story_username = story_username;
    }

    protected InstaStory(Parcel in) {
        if (in.readByte() == 0) {
            story_avatar = null;
        } else {
            story_avatar = in.readInt();
        }
        story_username = in.readString();
    }

    public static final Creator<InstaStory> CREATOR = new Creator<InstaStory>() {
        @Override
        public InstaStory createFromParcel(Parcel in) {
            return new InstaStory(in);
        }

        @Override
        public InstaStory[] newArray(int size) {
            return new InstaStory[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        if (story_avatar == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(story_avatar);
        }
        dest.writeString(story_username);
    }
}
