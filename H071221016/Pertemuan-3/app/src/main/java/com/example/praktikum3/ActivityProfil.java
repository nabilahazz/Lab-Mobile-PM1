package com.example.praktikum3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityProfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        ImageView ivProfile = findViewById(R.id.iv_profil);
        TextView tvProfile = findViewById(R.id.tv_profil);
        TextView tvFollowers = findViewById(R.id.tv_followers);
        TextView tvFollowing = findViewById(R.id.tv_following);
        ImageView ivPost = findViewById(R.id.iv_post);

        Intent intent = getIntent();

        Integer ProfilePhoto = intent.getIntExtra("Profile Photo", 0);
        String UserName = intent.getStringExtra("User Name");
        String Followers = intent.getStringExtra("Followers");
        String Following = intent.getStringExtra("Following");
        Integer Postingan = intent.getIntExtra("Postingan", 0);

        ivProfile.setImageResource(ProfilePhoto);
        tvProfile.setText(UserName);
        tvFollowers.setText(Followers);
        tvFollowing.setText(Following);
        ivPost.setImageResource(Postingan);

        ivProfile.setOnClickListener(v -> {
            if (ProfilePhoto == R.drawable.math) {
                Intent storyIntent = new Intent(ActivityProfil.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.math);
                storyIntent.putExtra("User Name", "Math");
                storyIntent.putExtra("Story", R.drawable.math);
                startActivity(storyIntent);
            } if (ProfilePhoto == R.drawable.art) {
                Intent storyIntent = new Intent(ActivityProfil.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.art);
                storyIntent.putExtra("User Name", "Art");
                storyIntent.putExtra("Story", R.drawable.art);
                startActivity(storyIntent);
            } if (ProfilePhoto == R.drawable.science) {
                Intent storyIntent = new Intent(ActivityProfil.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.science);
                storyIntent.putExtra("User Name", "Science");
                storyIntent.putExtra("Story", R.drawable.science);
                startActivity(storyIntent);
            } if (ProfilePhoto == R.drawable.sport) {
                Intent storyIntent = new Intent(ActivityProfil.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.sport);
                storyIntent.putExtra("User Name", "Sport");
                storyIntent.putExtra("Story", R.drawable.sport);
                startActivity(storyIntent);
            } if (ProfilePhoto == R.drawable.english) {
                Intent storyIntent = new Intent(ActivityProfil.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.english);
                storyIntent.putExtra("User Name", "English");
                storyIntent.putExtra("Story", R.drawable.english);
                startActivity(storyIntent);
            }  if (ProfilePhoto == R.drawable.education) {
                Intent storyIntent = new Intent(ActivityProfil.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.education);
                storyIntent.putExtra("User Name", "Education");
                storyIntent.putExtra("Story", R.drawable.education);
                startActivity(storyIntent);
            } if (ProfilePhoto == R.drawable.geography) {
                Intent storyIntent = new Intent(ActivityProfil.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.geography);
                storyIntent.putExtra("User Name", "Geography");
                storyIntent.putExtra("Story", R.drawable.geography);
                startActivity(storyIntent);
            } if (ProfilePhoto == R.drawable.history) {
                Intent storyIntent = new Intent(ActivityProfil.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.history);
                storyIntent.putExtra("User Name", "History");
                storyIntent.putExtra("Story", R.drawable.history);
                startActivity(storyIntent);
            } else if (ProfilePhoto == R.drawable.jerman) {
                Intent storyIntent = new Intent(ActivityProfil.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.jerman);
                storyIntent.putExtra("User Name", "Germany");
                storyIntent.putExtra("Story", R.drawable.jerman);
                startActivity(storyIntent);
            } else if (ProfilePhoto == R.drawable.tech) {
                Intent storyIntent = new Intent(ActivityProfil.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.tech);
                storyIntent.putExtra("User Name", "Tech");
                storyIntent.putExtra("Story", R.drawable.tech);
                startActivity(storyIntent);
            }
        });

        ivPost.setOnClickListener(v -> {
            if (Postingan == R.drawable.math) {
                Intent postIntent = new Intent(ActivityProfil.this, PostActivity.class);
                postIntent.putExtra("Profile Photo", R.drawable.math);
                postIntent.putExtra("User Name", "Math");
                postIntent.putExtra("Postingan", R.drawable.math);
                postIntent.putExtra("Caption", "Tuntaskan misteri matematika bersama kami");
                startActivity(postIntent);
            } if (Postingan == R.drawable.art) {
                Intent postIntent = new Intent(ActivityProfil.this, PostActivity.class);
                postIntent.putExtra("Profile Photo", R.drawable.art);
                postIntent.putExtra("User Name", "Art");
                postIntent.putExtra("Postingan", R.drawable.art);
                postIntent.putExtra("Caption", "Ekspresikan kreativitasmu dalam seni!");
                startActivity(postIntent);
            } if (Postingan == R.drawable.science) {
                Intent postIntent = new Intent(ActivityProfil.this, PostActivity.class);
                postIntent.putExtra("Profile Photo", R.drawable.science);
                postIntent.putExtra("User Name", "Science");
                postIntent.putExtra("Postingan", R.drawable.science);
                postIntent.putExtra("Caption", "Telusuri keajaiban sains bersama kami! \n Mari kita jelajahi dunia alam dan pengetahuan bersama!");
                startActivity(postIntent);
            }if (Postingan == R.drawable.sport) {
                Intent postIntent = new Intent(ActivityProfil.this, PostActivity.class);
                postIntent.putExtra("Profile Photo", R.drawable.sport);
                postIntent.putExtra("User Name", "Sport");
                postIntent.putExtra("Postingan", R.drawable.sport);
                postIntent.putExtra("Caption", "Jadilah pahlawan lapangan dengan semangat olahraga!");
                startActivity(postIntent);
            }if (Postingan == R.drawable.english) {
                Intent postIntent = new Intent(ActivityProfil.this, PostActivity.class);
                postIntent.putExtra("Profile Photo", R.drawable.english);
                postIntent.putExtra("User Name", "English");
                postIntent.putExtra("Postingan", R.drawable.english);
                postIntent.putExtra("Caption", "Terbangkan imajinasi dengan bahasa Inggris!");
                startActivity(postIntent);
            } if (Postingan == R.drawable.education) {
                Intent postIntent = new Intent(ActivityProfil.this, PostActivity.class);
                postIntent.putExtra("Profile Photo", R.drawable.education);
                postIntent.putExtra("User Name", "Education");
                postIntent.putExtra("Postingan", R.drawable.education);
                postIntent.putExtra("Caption", "Pintar itu keren!");
                startActivity(postIntent);
            } if (Postingan == R.drawable.geography) {
                Intent postIntent = new Intent(ActivityProfil.this, PostActivity.class);
                postIntent.putExtra("Profile Photo", R.drawable.geography);
                postIntent.putExtra("User Name", "Geography");
                postIntent.putExtra("Postingan", R.drawable.geography);
                postIntent.putExtra("Caption", "Telusuri keindahan bumi dan budaya dunia!");
                startActivity(postIntent);
            } if (Postingan == R.drawable.history) {
                Intent postIntent = new Intent(ActivityProfil.this, PostActivity.class);
                postIntent.putExtra("Profile Photo", R.drawable.history);
                postIntent.putExtra("User Name", "History");
                postIntent.putExtra("Postingan", R.drawable.history);
                postIntent.putExtra("Caption", "Jejak sejarah membentuk masa depan!");
                startActivity(postIntent);
            } if (Postingan == R.drawable.jerman) {
                Intent postIntent = new Intent(ActivityProfil.this, PostActivity.class);
                postIntent.putExtra("Profile Photo", R.drawable.jerman);
                postIntent.putExtra("User Name", "Germany");
                postIntent.putExtra("Postingan", R.drawable.jerman);
                postIntent.putExtra("Caption", "Pelajari bahasa Jerman dan jelajahi budaya yang kaya!");
                startActivity(postIntent);
            } if (Postingan == R.drawable.tech) {
                Intent postIntent = new Intent(ActivityProfil.this, PostActivity.class);
                postIntent.putExtra("Profile Photo", R.drawable.tech);
                postIntent.putExtra("User Name", "Tech");
                postIntent.putExtra("Postingan", R.drawable.tech);
                postIntent.putExtra("Caption", "Dunia di ujung jari dengan teknologi!");
                startActivity(postIntent);
            }
        });
    }
}
