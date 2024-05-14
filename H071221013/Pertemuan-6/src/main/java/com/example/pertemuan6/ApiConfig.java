package com.example.pertemuan6;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class ApiConfig {

    //melakukan panggilan ke api
    public static ApiService getApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in/")
                .addConverterFactory(GsonConverterFactory.create()) //Gson...:mengkonversi respon json ke objk java
                .build();
        return retrofit.create(ApiService.class);
    }
}
