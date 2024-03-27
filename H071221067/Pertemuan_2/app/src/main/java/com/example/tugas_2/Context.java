package com.example.tugas_2;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Context implements Parcelable {
    String title;
    String content;

    Context() {

    }

    protected Context(Parcel in) {
        title = in.readString();
        content = in.readString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static final Creator<Context> CREATOR = new Creator<Context>() {
        @Override
        public Context createFromParcel(Parcel in) {
            return new Context(in);
        }

        @Override
        public Context[] newArray(int size) {
            return new Context[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(content);
    }
}
