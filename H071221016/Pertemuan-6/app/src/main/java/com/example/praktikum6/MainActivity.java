package com.example.praktikum6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ApiService apiService;
    private UserAdapter userAdapter;
    private RecyclerView recyclerView;
    private Button loadMore, retry;
    private TextView error;
    private ProgressBar progressBar;
    private List<User> users = new ArrayList<>();
    private Context context;
    private int currentPage = 1;
    private Handler handler = new Handler(Looper.myLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiService = RetrofitClient.getClient().create(ApiService.class);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        loadMore = findViewById(R.id.loadMore);
        progressBar = findViewById(R.id.progressBar);
        error = findViewById(R.id.error);
        retry = findViewById(R.id.retry);

        loadInitialData();

        loadMore.setOnClickListener(v -> {
            loadMore.setVisibility(View.GONE);
            progressBar.setVisibility(View.VISIBLE);
            loadMoreData();
        });

    }

    private void loadInitialData() {
        if (isNetworkAvailable()) {
            currentPage = 1;
            loadData();
        } else {
            showErrorView();
        }
    }

    private void loadData(){
        progressBar.setVisibility(View.VISIBLE);
        loadMore.setVisibility(View.GONE);
        Call<UserResponse> call = apiService.getUsers(1,6);
        call.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                if (response.isSuccessful()) {
                    users = response.body().getData();
                    handler.post(() -> {
                        userAdapter = new UserAdapter(users, context);
                        progressBar.setVisibility(View.GONE);
                        loadMore.setVisibility(View.VISIBLE);
                        recyclerView.setAdapter(userAdapter);
                        recyclerView.setVisibility(View.VISIBLE);
                        if (users.size() >= 6) {
                            loadMore.setVisibility(View.VISIBLE);
                        }
                    });
                } else {
                    handler.post(() -> {
                        progressBar.setVisibility(View.GONE);
                        showErrorView();
                    });
                }
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                showErrorView();
            }

        });
    }

    private void loadMoreData() {
        currentPage++;
        Call<UserResponse> call = apiService.getUsers(currentPage, 6);
        call.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                if (response.isSuccessful()) {
                    List<User> newUsers = response.body().getData();
                    System.out.println(newUsers.get(0).getFirst_name());
                    if (!newUsers.isEmpty()) {
                        users.addAll(newUsers);
                        userAdapter.notifyDataSetChanged();
                        if (newUsers.size() < 6) {
                            loadMore.setVisibility(View.GONE);
                        }
                    } else {
                        loadMore.setVisibility(View.GONE);
                    }
                } else {
                    showErrorView();
                }
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                showErrorView();
            }
        });
    }

    private void showErrorView() {
        recyclerView.setVisibility(View.GONE);
        loadMore.setVisibility(View.GONE);
        error.setVisibility(View.VISIBLE);
        retry.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.GONE);

        retry.setOnClickListener(v -> {
            if (isNetworkAvailable()) {
                progressBar.setVisibility(View.VISIBLE);
                error.setVisibility(View.GONE);
                retry.setVisibility(View.GONE);
                currentPage = 1; // Reset currentPage when retrying
                loadData();
            } else {
                Toast.makeText(MainActivity.this, "Internet connection still unavailable", Toast.LENGTH_SHORT).show();
                handler.post(() -> {
                    loadData();
                    error.setVisibility(View.GONE);
                    retry.setVisibility(View.GONE);
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