package com.example.praktikum6;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiService {
    @GET("api/users")
        // page itu untuk menampilkan page berapa yang mau kita tampilkan
    Call<UserResponse> getUsers(@Query("page") int page);

}

