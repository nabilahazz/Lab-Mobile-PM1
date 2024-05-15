package com.example.praktikum6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfileActivity extends AppCompatActivity {
    ImageView IV_avatar;
    TextView TV_name, TV_email, TV_error;
    Button retryButton;
    ProgressBar progressBar;
    private ApiService apiService;
    private Handler handler;
    private int userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        IV_avatar = findViewById(R.id.IV_avatar);
        TV_name = findViewById(R.id.TV_name);
        TV_email = findViewById(R.id.TV_email);
        TV_error = findViewById(R.id.TV_error);
        retryButton = findViewById(R.id.retryButton);
        progressBar = findViewById(R.id.progressBar2);
        handler = new Handler();


        Intent intent = getIntent();
        userId = intent.getIntExtra("USER_ID", -1);

        apiService = RetrofitClient.getClient().create(ApiService.class);

        loadInitialUser();
    }

    private void loadInitialUser() {
        if (isNetworkAvailable()) {
            if (userId != -1) {
                loadUser(userId);
            } else {

            }
        } else {
            showErrorView();
        }
    }

    private void loadUser(int userId) {
        progressBar.setVisibility(View.VISIBLE);
        Call<UserResponse2> call = apiService.getUserById(userId);
        call.enqueue(new Callback<UserResponse2>() {
            @Override
            public void onResponse(Call<UserResponse2> call, Response<UserResponse2> response) {
                if (response.isSuccessful()) {

                    User user = response.body().getData();
                    progressBar.setVisibility(View.GONE);
                    IV_avatar.setVisibility(View.VISIBLE);
                    TV_name.setVisibility(View.VISIBLE);
                    TV_email.setVisibility(View.VISIBLE);
                    userDetails(user);

                }
            }

            @Override
            public void onFailure(Call<UserResponse2> call, Throwable t) {
                showErrorView();
            }
        });
    }

    private void userDetails(User user) {
        Picasso.get().load(user.getAvatar()).into(IV_avatar);
        TV_name.setText(user.getFirst_name() + " " + user.getLast_name());
        TV_email.setText(user.getEmail());
    }

    private void showErrorView() {
        TV_error.setVisibility(View.VISIBLE);
        retryButton.setVisibility(View.VISIBLE);
        IV_avatar.setVisibility(View.GONE);
        TV_name.setVisibility(View.GONE);
        TV_email.setVisibility(View.GONE);
        progressBar.setVisibility(View.GONE);

        retryButton.setOnClickListener(v -> {
            if (isNetworkAvailable()) {
                progressBar.setVisibility(View.VISIBLE);
                TV_error.setVisibility(View.GONE);
                retryButton.setVisibility(View.GONE);
                loadUser(userId);
            } else {
                Toast.makeText(ProfileActivity.this, "Internet connection still unavailable", Toast.LENGTH_SHORT).show();
                handler.post(() -> {
                    loadUser(userId);
                    TV_error.setVisibility(View.GONE);
                    retryButton.setVisibility(View.GONE);
                });
            }
        });
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }
}