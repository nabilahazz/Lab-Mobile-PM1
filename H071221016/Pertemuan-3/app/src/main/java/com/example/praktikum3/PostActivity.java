package com.example.praktikum3;

import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PostActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        ImageView ivProfile = findViewById(R.id.iv_profil);
        TextView tvUsername = findViewById(R.id.tv_username);
        ImageView ivPost = findViewById(R.id.iv_post);
        TextView tvDesc = findViewById(R.id.tv_caption);

        Intent intent = getIntent();

        Integer ProfilePhoto = intent.getIntExtra("Profile Photo",0);
        String UserName = intent.getStringExtra("User Name");
        Integer Postingan = intent.getIntExtra("Postingan", 0);
        String Caption = intent.getStringExtra("Caption");

        ivProfile.setImageResource(ProfilePhoto);
        tvUsername.setText(UserName);
        ivPost.setImageResource(Postingan);
        tvDesc.setText(Caption);

        ivProfile.setOnClickListener(v -> {
            if (ProfilePhoto == R.drawable.math) {
                Intent storyIntent = new Intent(PostActivity.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.math);
                storyIntent.putExtra("User Name", "Math");
                storyIntent.putExtra("Story", R.drawable.math);
                startActivity(storyIntent);
            } if (ProfilePhoto == R.drawable.art) {
                Intent storyIntent = new Intent(PostActivity.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.art);
                storyIntent.putExtra("User Name", "Art");
                storyIntent.putExtra("Story", R.drawable.art);
                startActivity(storyIntent);
            } if (ProfilePhoto == R.drawable.science) {
                Intent storyIntent = new Intent(PostActivity.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.science);
                storyIntent.putExtra("User Name", "Science");
                storyIntent.putExtra("Story", R.drawable.science);
                startActivity(storyIntent);
            } if (ProfilePhoto == R.drawable.english) {
                Intent storyIntent = new Intent(PostActivity.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.english);
                storyIntent.putExtra("User Name", "English");
                storyIntent.putExtra("Story", R.drawable.english);
                startActivity(storyIntent);
            } if (ProfilePhoto == R.drawable.education) {
                Intent storyIntent = new Intent(PostActivity.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.education);
                storyIntent.putExtra("User Name", "Education");
                storyIntent.putExtra("Story", R.drawable.education);
                startActivity(storyIntent);
            }  if (ProfilePhoto == R.drawable.geography) {
                Intent storyIntent = new Intent(PostActivity.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.geography);
                storyIntent.putExtra("User Name", "Geography");
                storyIntent.putExtra("Story", R.drawable.geography);
                startActivity(storyIntent);
            } if (ProfilePhoto == R.drawable.history) {
                Intent storyIntent = new Intent(PostActivity.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.history);
                storyIntent.putExtra("User Name", "History");
                storyIntent.putExtra("Story", R.drawable.history);
                startActivity(storyIntent);
            } if (ProfilePhoto == R.drawable.sport) {
                Intent storyIntent = new Intent(PostActivity.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.sport);
                storyIntent.putExtra("User Name", "Sport");
                storyIntent.putExtra("Story", R.drawable.sport);
                startActivity(storyIntent);
            } else if (ProfilePhoto == R.drawable.jerman) {
                Intent storyIntent = new Intent(PostActivity.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.jerman);
                storyIntent.putExtra("User Name", "Germany");
                storyIntent.putExtra("Story", R.drawable.jerman);
                startActivity(storyIntent);
            } else if (ProfilePhoto == R.drawable.tech) {
                Intent storyIntent = new Intent(PostActivity.this, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.tech);
                storyIntent.putExtra("User Name", "Tech");
                storyIntent.putExtra("Story", R.drawable.tech);
                startActivity(storyIntent);
            }
        });

        tvUsername.setOnClickListener(v -> {
            if(UserName.equals("Math")){
                Intent profileIntent = new Intent(PostActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.math);
                profileIntent.putExtra("User Name","Math");
                profileIntent.putExtra("Followers","2 JT");
                profileIntent.putExtra("Following","10");
                profileIntent.putExtra("Postingan", R.drawable.math);
                startActivity((profileIntent));
            }if(UserName.equals("Art")){
                Intent profileIntent = new Intent(PostActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.art);
                profileIntent.putExtra("User Name","Art");
                profileIntent.putExtra("Followers","3,5 JT");
                profileIntent.putExtra("Following","72");
                profileIntent.putExtra("Postingan", R.drawable.art);
                startActivity((profileIntent));
            } if(UserName.equals("Science")){
                Intent profileIntent = new Intent(PostActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.science);
                profileIntent.putExtra("User Name","Science");
                profileIntent.putExtra("Followers","1, JT");
                profileIntent.putExtra("Following","12");
                profileIntent.putExtra("Postingan", R.drawable.science);
                startActivity((profileIntent));
            } if(UserName.equals("Sport")){
                Intent profileIntent = new Intent(PostActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.sport);
                profileIntent.putExtra("User Name","Sport");
                profileIntent.putExtra("Followers","8 JT");
                profileIntent.putExtra("Following","21");
                profileIntent.putExtra("Postingan", R.drawable.sport);
                startActivity((profileIntent));
            }if(UserName.equals("English")){
                Intent profileIntent = new Intent(PostActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.english);
                profileIntent.putExtra("User Name","English");
                profileIntent.putExtra("Followers","5,5 JT");
                profileIntent.putExtra("Following","5");
                profileIntent.putExtra("Postingan", R.drawable.english);
                startActivity((profileIntent));
            }if(UserName.equals("Education")){
                Intent profileIntent = new Intent(PostActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.education);
                profileIntent.putExtra("User Name","Education");
                profileIntent.putExtra("Followers","6 JT");
                profileIntent.putExtra("Following","3");
                profileIntent.putExtra("Postingan", R.drawable.education);
                startActivity((profileIntent));
            }if(UserName.equals("Geography")){
                Intent profileIntent = new Intent(PostActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.geography);
                profileIntent.putExtra("User Name","Geography");
                profileIntent.putExtra("Followers","6 JT");
                profileIntent.putExtra("Following","5");
                profileIntent.putExtra("Postingan", R.drawable.geography);
                startActivity((profileIntent));
            } if(UserName.equals("History")){
                Intent profileIntent = new Intent(PostActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.history);
                profileIntent.putExtra("User Name","History");
                profileIntent.putExtra("Followers","9 JT");
                profileIntent.putExtra("Following","40");
                profileIntent.putExtra("Postingan", R.drawable.history);
                startActivity((profileIntent));
            }if(UserName.equals("Germany")){
                Intent profileIntent = new Intent(PostActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.jerman);
                profileIntent.putExtra("User Name","Germany");
                profileIntent.putExtra("Followers","1 JT");
                profileIntent.putExtra("Following","45");
                profileIntent.putExtra("Postingan", R.drawable.jerman);
                startActivity((profileIntent));
            } if(UserName.equals("Tech")){
                Intent profileIntent = new Intent(PostActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.tech);
                profileIntent.putExtra("User Name","Tech");
                profileIntent.putExtra("Followers","8 JT");
                profileIntent.putExtra("Following","51");
                profileIntent.putExtra("Postingan", R.drawable.tech);
                startActivity((profileIntent));
            }
        });
    }

}