package com.example.pertemuan3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private ImageView iv_profile;
    private ImageView iv_story;
    private TextView tv_nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        SaveVariabel saveVariabel = intent.getParcelableExtra("saveVariabel");
        // // Inisialisasi views
        iv_profile = findViewById(R.id.iv_profile2);
        iv_story = findViewById(R.id.iv_story);
        tv_nama = findViewById(R.id.tv_nama2);

        //// Menampilkan data
        iv_profile.setImageResource(saveVariabel.getImageprofile());
        iv_story.setImageResource(saveVariabel.getImagestory());
        tv_nama.setText(saveVariabel.getNama());

        tv_nama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("saveVariabel", saveVariabel);
                startActivity(intent);
            }
        });
    }
}