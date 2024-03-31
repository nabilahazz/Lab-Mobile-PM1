package com.example.prak2;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
    TextView tvname, tvuser, tvtittle, tvcontent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvname = findViewById(R.id.textViewName);
        tvuser = findViewById(R.id.textViewUser);
        tvtittle = findViewById(R.id.textViewTittle);
        tvcontent = findViewById(R.id.textViewContent);

        tvname.setText(getIntent().getStringExtra("name"));
        tvuser.setText(getIntent().getStringExtra("username"));
        tvtittle.setText(getIntent().getStringExtra("tittle"));  //set text ke dalam mainactivity tiga yang telah dikirim dari activity1
        tvcontent.setText(getIntent().getStringExtra("content"));

        ImageView imageView = findViewById(R.id.imageView);
        String imageUriString = getIntent().getStringExtra("image"); //get image yg sdh dipilih

        if (imageUriString != null) {
            Uri imageUri = Uri.parse(imageUriString);
            imageView.setImageURI(imageUri);
        }
    }
}