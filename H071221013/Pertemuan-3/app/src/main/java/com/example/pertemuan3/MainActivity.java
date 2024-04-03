package com.example.pertemuan3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_story;
    private RecyclerView rv_feed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //memanggil metode dari kls induk
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rv_story = findViewById(R.id.rv_story); //mendapatkan referensi
        rv_feed = findViewById(R.id.rv_feed);

        //menetapkan layout manager
        rv_story.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv_feed.setLayoutManager(new GridLayoutManager(this, 1));
        rv_story.setHasFixedSize(true);
        rv_feed.setHasFixedSize(true);

        StoryAdapter storyAdapter = new StoryAdapter(DataSource.saveVariabels);
        rv_story.setAdapter(storyAdapter);

        FeedAdapter feedAdapter = new FeedAdapter(DataSource.saveVariabels);
        rv_feed.setAdapter(feedAdapter);
    }
}