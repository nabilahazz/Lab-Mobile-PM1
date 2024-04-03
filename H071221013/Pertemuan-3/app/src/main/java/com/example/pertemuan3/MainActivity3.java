package com.example.pertemuan3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private ImageView iv_profile;
    private ImageView iv_feed;
    private TextView tv_nama, tv_followers, tv_following;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();

        SaveVariabel saveVariabel = intent.getParcelableExtra("saveVariabel");


        // Inisialisasi views
        iv_profile = findViewById(R.id.iv_profile3);
        iv_feed = findViewById(R.id.iv_feed2);
        tv_nama = findViewById(R.id.tv_nama3);
        tv_followers = findViewById(R.id.tv_followers);
        tv_following = findViewById(R.id.tv_following);

        // Menampilkan data makanan pada views
        iv_profile.setImageResource(saveVariabel.getImageprofile());
        iv_feed.setImageResource(saveVariabel.getImagefeed());
        tv_nama.setText(saveVariabel.getNama());
        tv_followers.setText(String.valueOf(saveVariabel.getFollowers()));
        tv_following.setText(String.valueOf(saveVariabel.getFollowing()));

        iv_feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                intent.putExtra("saveVariabel", saveVariabel);
                startActivity(intent);
            }
        });

        iv_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                intent.putExtra("saveVariabel", saveVariabel);
                startActivity(intent);
            }
        });
    }
}