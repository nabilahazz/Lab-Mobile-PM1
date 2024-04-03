package com.example.tuprak_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PostActivity extends AppCompatActivity {
    ImageView iv_postAvatar;
    TextView tv_postUsername;
    ImageView iv_postImage;
    TextView tv_postLikes;
    TextView tv_postDeskripsi;
    TextView tv_postTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        iv_postAvatar = findViewById(R.id.post_avatar);
        tv_postUsername = findViewById(R.id.post_username);
        iv_postImage = findViewById(R.id.post_image);
        tv_postLikes = findViewById(R.id.post_likes);
        tv_postDeskripsi = findViewById(R.id.post_caption);
        tv_postTime = findViewById(R.id.post_time);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        tv_postUsername.setText(username);

        Post post = getProfileByUsername(username);
        if(post != null) {
            iv_postAvatar.setImageResource(post.getAvatar());
            iv_postImage.setImageResource(post.getImage_post());
            tv_postLikes.setText(post.getLike_count());
            tv_postDeskripsi.setText(post.getDescription());
            tv_postTime.setText(post.getTime());
        }

        iv_postAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this, FeedsActivity.class);
                intent.putExtra("username", username);
                intent.putExtra("avatar", post.getAvatar());
                startActivity(intent);
            }
        });

        tv_postUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this, ProfileActivity.class);
                intent.putExtra("username", username);
                intent.putExtra("avatar", post.getAvatar());
                intent.putExtra("postingan", post.getImage_post());
                startActivity(intent);
            }
        });
    }

    private Post getProfileByUsername(String username) {
        for (Post post : DataSource.posts) {
            if (post.getUsername().equals(username)) {
                return post;
            }
        }
        return null;
    }
}