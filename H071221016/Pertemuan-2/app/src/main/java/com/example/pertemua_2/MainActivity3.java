package com.example.pertemua_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView tnama,tusername,ttitle,tcontent;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tnama = findViewById(R.id.textViewnama);
        tusername=findViewById(R.id.textViewusername);
        ttitle=findViewById(R.id.tvtitle);
        tcontent=findViewById(R.id.tvcontent);
        imageView = findViewById(R.id.image);

        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        String username = intent.getStringExtra("username");
        String title = intent.getStringExtra("title");
        String content = intent.getStringExtra("content");
        String img = intent.getStringExtra("image");

        Uri imageUri = Uri.parse(img);
        imageView.setImageURI(imageUri);

        tnama.setText(nama);
        tusername.setText(username);
        ttitle.setText(title);
        tcontent.setText(content);



    }

}