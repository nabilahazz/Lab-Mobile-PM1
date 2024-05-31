package com.example.praktikum6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProfileActivity extends AppCompatActivity {

    private ImageView avatar;
    private TextView name, email, connectionLost2;
    private ProgressBar progressBar;
    private Button btn_retry2;

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        avatar = findViewById(R.id.iv_profile);
        name = findViewById(R.id.tv_username);
        email = findViewById(R.id.email);
        progressBar = findViewById(R.id.progressBar3);
        btn_retry2 = findViewById(R.id.btn_retry2);
        connectionLost2 = findViewById(R.id.connectionLost2);

        Intent intent = getIntent();
        User user = intent.getParcelableExtra("user");

        if (isNetworkAvailable()) {
            if (user != null) {
                progressBar.setVisibility(View.VISIBLE);
                avatar.setVisibility(View.GONE);
                name.setVisibility(View.GONE);
                email.setVisibility(View.GONE);

                ExecutorService executor = Executors.newSingleThreadExecutor();
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                progressBar.setVisibility(View.GONE);
                                Picasso.get().load(user.getAvatar()).into(avatar);
                                name.setText(user.getFirst_name() + " " + user.getLast_name());
                                email.setText(user.getEmail());
                                avatar.setVisibility(View.VISIBLE);
                                name.setVisibility(View.VISIBLE);
                                email.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                });
            } else {
                Toast.makeText(this,"User data is null", Toast.LENGTH_SHORT).show();
                finish();
            }
        }
        //periksa jaringan tdk terseida
        if (!isNetworkAvailable()) {
            if (user != null) {
                btn_retry2.setVisibility(View.VISIBLE);
                connectionLost2.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.GONE);
                avatar.setVisibility(View.GONE);
                name.setVisibility(View.GONE);
                email.setVisibility(View.GONE);

                //cek ulg koneksi ketika tombol retry di klik
                btn_retry2.setOnClickListener((new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (isNetworkAvailable()) {
                            btn_retry2.setVisibility(View.GONE);
                            connectionLost2.setVisibility(View.GONE);
                            progressBar.setVisibility(View.VISIBLE);
                            ExecutorService executor = Executors.newSingleThreadExecutor();
                            executor.execute(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    runOnUiThread(new Runnable() {
                                        @Override
                                        public void run() {
                                            progressBar.setVisibility(View.GONE);
                                            Picasso.get().load(user.getAvatar()).into(avatar);
                                            name.setText(user.getFirst_name() + " " + user.getLast_name());
                                            email.setText(user.getEmail());
                                            avatar.setVisibility(View.VISIBLE);
                                            name.setVisibility(View.VISIBLE);
                                            email.setVisibility(View.VISIBLE);
                                        }
                                    });

                                }
                            });
                        //jika jaringan msih tdk tersedia setelah dombol retry di klik
                        }  else  {
                            progressBar.setVisibility(View.VISIBLE);
                            btn_retry2.setVisibility(View.GONE);
                            connectionLost2.setVisibility(View.GONE);
                            ExecutorService executor = Executors.newSingleThreadExecutor();
                            executor.execute(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        Thread.sleep(300);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    runOnUiThread(new Runnable() {
                                        @Override
                                        public void run() {
                                            progressBar.setVisibility(View.GONE);
                                            btn_retry2.setVisibility(View.VISIBLE);
                                            connectionLost2.setVisibility(View.VISIBLE);
                                        }
                                    });
                                }
                            });
                        }
                }
                }));
            }
        }


    }
}