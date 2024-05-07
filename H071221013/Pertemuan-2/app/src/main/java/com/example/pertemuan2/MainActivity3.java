package com.example.pertemuan2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainActivity3 extends AppCompatActivity {

    private TextView tvw1;
    private TextView tvw2;
    private TextView tvw3;
    private TextView tvw4;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        //   menginisialisasi variabel
        tvw1 = findViewById(R.id.tv31);
        tvw2 = findViewById(R.id.tv32);
        tvw3 = findViewById(R.id.tv33);
        tvw4 = findViewById(R.id.tv34);
        img = findViewById(R.id.img3);

        //mengambil string yg diteruskan
        String nama = getIntent().getStringExtra("ambilnama");
        String username = getIntent().getStringExtra("ambilusername");
        String judul = getIntent().getStringExtra("ambiljudul");
        String konten = getIntent().getStringExtra("ambilkonten");
        String imageUriString = getIntent().getStringExtra("imageUri");

        //menetapkan nilai text1.. ke textView yg sesuai
        tvw1.setText(nama);
        tvw2.setText(username);
        tvw3.setText(judul);
        tvw4.setText(konten);

        Uri imageUri = Uri.parse(imageUriString);
        img.setImageURI(imageUri);
    }
}