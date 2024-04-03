package com.example.tuprak_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvPosts = findViewById(R.id.rv_post);
        rvPosts.setLayoutManager(new LinearLayoutManager(this));
        rvPosts.setHasFixedSize(true);

        // Setting up Adapter for rvPosts
        PostAdapter adapter = new PostAdapter(DataSource.posts);
        rvPosts.setAdapter(adapter);

        adapter.setClickPost(new PostAdapter.ClickListenerPost() {
            @Override
            public void onAvatarClicked(Post post) {
                Intent intent = new Intent(MainActivity.this, FeedsActivity.class);
                intent.putExtra("username", post.getUsername());
                intent.putExtra("avatar", post.getAvatar());
                startActivity(intent);
            }
        });

        RecyclerView rvFeeds = findViewById(R.id.rv_feeds);
        rvFeeds.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvFeeds.setHasFixedSize(true);

        // Setting up Adapter for rvFeeds
        InstaStoryAdapter story_adapter = new InstaStoryAdapter(DataSource.instaStories);
        story_adapter.setClickStory(new InstaStoryAdapter.ClickListenerStory() {
            @Override
            public void onItemClicked(InstaStory instaStory) {
                Intent intent = new Intent(MainActivity.this, FeedsActivity.class);
                intent.putExtra("username", instaStory.getStory_username());
                intent.putExtra("avatar", instaStory.getStory_avatar());
                startActivity(intent);
            }
        });
        rvFeeds.setAdapter(story_adapter);
    }
}
