package com.example.pertemuan3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    private ImageView iv_profile;
    private ImageView iv_feed;
    private TextView tv_nama, tv_caption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);

        Intent intent = getIntent();

        SaveVariabel saveVariabel = intent.getParcelableExtra("saveVariabel");


        iv_profile = findViewById(R.id.iv_profile4);
        iv_feed = findViewById(R.id.iv_feed3);
        tv_nama = findViewById(R.id.tv_namaprofile);
        tv_caption = findViewById(R.id.tv_caption2);


        iv_profile.setImageResource(saveVariabel.getImageprofile());
        iv_feed.setImageResource(saveVariabel.getImagefeed());
        tv_nama.setText(saveVariabel.getNama());
        tv_caption.setText(String.valueOf(saveVariabel.getCaption()));

        tv_nama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
                intent.putExtra("saveVariabel", saveVariabel);
                startActivity(intent);
            }
        });

        iv_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                intent.putExtra("saveVariabel", saveVariabel);
                startActivity(intent);
            }
        });
    }
}