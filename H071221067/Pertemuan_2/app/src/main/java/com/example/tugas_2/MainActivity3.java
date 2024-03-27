package com.example.tugas_2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    TextView name, username, title, content;
    ImageView image;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        name = findViewById(R.id.nama);
        username = findViewById(R.id.username);
        title = findViewById(R.id.title);
        content = findViewById(R.id.content);
        image = findViewById(R.id.gambar);

        Data inputan = getIntent().getParcelableExtra("data");
        if (inputan != null) {
            name.setText(inputan.getNama());
            username.setText(inputan.getUsername());
        }

        intent = getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("img");
        if (uri != null) {
            image.setImageURI(uri);
        }

        Context context = getIntent().getParcelableExtra("context");
        if (context != null) {
            title.setText(context.getTitle());
            content.setText(context.getContent());
        }
    }
}
