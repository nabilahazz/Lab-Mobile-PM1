package com.example.pertemuan6;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DataResponse {
    @SerializedName("data")
    private ArrayList<User> data;

    public ArrayList<User> getData(){ //mendptkn data dari respon, mengembalikan arrayList dari objk user
        return data;
    }
}
