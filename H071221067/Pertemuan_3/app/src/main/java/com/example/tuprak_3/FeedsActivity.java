package com.example.tuprak_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FeedsActivity extends AppCompatActivity {
    TextView tv_feedsUsername;
    ImageView iv_feedsAvatar;
    ImageView iv_feedsImage;
    TextView tv_feedsTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeds);

        String username = getIntent().getStringExtra("username");
        int avatarId = getIntent().getIntExtra("avatar", R.drawable.liyue);

        iv_feedsAvatar = findViewById(R.id.feeds_avatar);
        iv_feedsAvatar.setImageResource(avatarId);

        tv_feedsUsername = findViewById(R.id.feeds_username);
        tv_feedsUsername.setText(username);

        // Get data feeds from DataSource
        Feeds feeds = getFeedsByUsername(username);
        if (feeds != null) {
            iv_feedsImage = findViewById(R.id.feeds_image);
            iv_feedsImage.setImageResource(feeds.getFeeds_image());

            tv_feedsTime = findViewById(R.id.feeds_time);
            tv_feedsTime.setText(feeds.getFeeds_time());
        }

        // Handle click event for username
        tv_feedsUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open ProfileActivity and pass username and avatar data
                Intent intent = new Intent(FeedsActivity.this, ProfileActivity.class);
                intent.putExtra("username", username);
                intent.putExtra("avatar", avatarId);

                Post post = new Post();
                intent.putExtra("postingan", post.getImage_post());
                startActivity(intent);
            }
        });
    }

    private Feeds getFeedsByUsername(String username) {
        // Iterate through feeds in DataSource and find feeds with matching username
        for (Feeds feeds : DataSource.feeds) {
            if (feeds.getFeeds_username().equals(username)) {
                return feeds;
            }
        }
        return null;
    }
}
