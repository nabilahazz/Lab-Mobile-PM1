package com.example.praktikum3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvStory=findViewById(R.id.rv_story);
        rvStory.setHasFixedSize(true);

        StoryAdapter adapter=new StoryAdapter(DataSource.stories, this);
        rvStory.setAdapter(adapter);

        RecyclerView rvPost=findViewById(R.id.postingan);
        rvPost.setHasFixedSize(true);

        PostAdapter adapter1 =new PostAdapter(DataSource.posts, this);
        rvPost.setAdapter(adapter1);
    }
}