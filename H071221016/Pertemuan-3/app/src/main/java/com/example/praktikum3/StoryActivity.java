package com.example.praktikum3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        ImageView ivProfile = findViewById(R.id.iv_profil2);
        TextView tvProfile = findViewById(R.id.tv_profil2);
        ImageView imageStory = findViewById(R.id.imageStory);

        Intent intent = getIntent();

        Integer ProfilePhoto = intent.getIntExtra("Profile Photo",0);
        String UserName = intent.getStringExtra("User Name");
        Integer StoryPhoto = intent.getIntExtra("Story", 0);

        ivProfile.setImageResource(ProfilePhoto);
        tvProfile.setText(UserName);
        imageStory.setImageResource(StoryPhoto);

        tvProfile.setOnClickListener(v -> {
            if(UserName.equals("Math")){
                Intent profileIntent = new Intent(StoryActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.math);
                profileIntent.putExtra("User Name","Math");
                profileIntent.putExtra("Followers","2 JT");
                profileIntent.putExtra("Following","10");
                profileIntent.putExtra("Postingan", R.drawable.math);
                startActivity((profileIntent));
            }if(UserName.equals("Art")){
                Intent profileIntent = new Intent(StoryActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.art);
                profileIntent.putExtra("User Name","Art");
                profileIntent.putExtra("Followers","3,5 JT");
                profileIntent.putExtra("Following","72");
                profileIntent.putExtra("Postingan", R.drawable.art);
                startActivity((profileIntent));
            } if(UserName.equals("Science")){
                Intent profileIntent = new Intent(StoryActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.science);
                profileIntent.putExtra("User Name","Science");
                profileIntent.putExtra("Followers","1,1 JT");
                profileIntent.putExtra("Following","12");
                profileIntent.putExtra("Postingan", R.drawable.science);
                startActivity((profileIntent));
            } if(UserName.equals("Sport")){
                Intent profileIntent = new Intent(StoryActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.sport);
                profileIntent.putExtra("User Name","Sport");
                profileIntent.putExtra("Followers","8 JT");
                profileIntent.putExtra("Following","21");
                profileIntent.putExtra("Postingan", R.drawable.sport);
                startActivity((profileIntent));
            }if(UserName.equals("English")){
                Intent profileIntent = new Intent(StoryActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.english);
                profileIntent.putExtra("User Name","English");
                profileIntent.putExtra("Followers","5,5 JT");
                profileIntent.putExtra("Following","5");
                profileIntent.putExtra("Postingan", R.drawable.english);
                startActivity((profileIntent));
            }if(UserName.equals("Education")){
                Intent profileIntent = new Intent(StoryActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.education);
                profileIntent.putExtra("User Name","Education");
                profileIntent.putExtra("Followers","6 JT");
                profileIntent.putExtra("Following","3");
                profileIntent.putExtra("Postingan", R.drawable.education);
                startActivity((profileIntent));
            }if(UserName.equals("Geography")){
                Intent profileIntent = new Intent(StoryActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.geography);
                profileIntent.putExtra("User Name","Geography");
                profileIntent.putExtra("Followers","6 JT");
                profileIntent.putExtra("Following","50");
                profileIntent.putExtra("Postingan", R.drawable.geography);
                startActivity((profileIntent));
            } if(UserName.equals("History")){
                Intent profileIntent = new Intent(StoryActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.history);
                profileIntent.putExtra("User Name","History");
                profileIntent.putExtra("Followers","9 JT");
                profileIntent.putExtra("Following","40");
                profileIntent.putExtra("Postingan", R.drawable.history);
                startActivity((profileIntent));
            }if(UserName.equals("Germany")){
                Intent profileIntent = new Intent(StoryActivity.this, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.jerman);
                profileIntent.putExtra("User Name","Germany");
                profileIntent.putExtra("Followers","1 JT");
                profileIntent.putExtra("Following","45");
                profileIntent.putExtra("Postingan", R.drawable.jerman);
                startActivity((profileIntent));
            } if(UserName.equals("Tech")){
                Intent profileIntent = new Intent(StoryActivity.this, ActivityProfil.class);
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