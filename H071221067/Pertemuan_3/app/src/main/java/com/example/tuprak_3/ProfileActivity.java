package com.example.tuprak_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {
    TextView tv_username;
    ImageView iv_avatar;
    TextView tv_followers;
    TextView tv_following;
    TextView tv_bio;
    ImageView iv_Postingan;
    ImageView bt_kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tv_username = findViewById(R.id.profile_username);
        iv_avatar = findViewById(R.id.profile_image);
        tv_followers = findViewById(R.id.text_followers);
        tv_following = findViewById(R.id.text_following);
        tv_bio = findViewById(R.id.profile_bio);
        iv_Postingan = findViewById(R.id.rv_postingan);
        bt_kembali = findViewById(R.id.kembali);

        bt_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Ambil data dari intent
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        tv_username.setText(username);

        int postingan = intent.getIntExtra("postingan", R.drawable.background);
        iv_Postingan.setImageResource(postingan);

        // Cari profil yang sesuai dengan username
        Profile profile = getProfileByUsername(username);
        if (profile != null) {
            // Set data profil ke tampilan
            iv_avatar.setImageResource(profile.getProfile_avatar());
            tv_followers.setText(profile.getProfile_followers());
            tv_following.setText(profile.getProfile_following());
            tv_bio.setText(profile.getProfile_bio());
            iv_Postingan.setImageResource(profile.getProfile_post());
        }

        // Handle click event untuk avatar (Profile Image)
        iv_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buka FeedsActivity dan kirim data username dan avatar
                Intent intent = new Intent(ProfileActivity.this, FeedsActivity.class);
                intent.putExtra("username", username);
                intent.putExtra("avatar", profile.getProfile_avatar());
                startActivity(intent);
            }
        });

        iv_Postingan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PostActivity.class);
                intent.putExtra("username", profile.getProfile_username());
                v.getContext().startActivity(intent);
            }
        });
    }

    private Profile getProfileByUsername(String username) {
        for (Profile profile : DataSource.profiles) {
            if (profile.getProfile_username().equals(username)) {
                return profile;
            }
        }
        return null;
    }
}