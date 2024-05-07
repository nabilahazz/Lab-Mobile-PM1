package com.example.pertemuan2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
//mendeklaraskan variabel
    private EditText etnama;
    private EditText etusername;
    private ImageView image;
    private Button btn;

//    menyimpan data input
    private String ambilnama;
    private String ambilusername;
    private Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        menginisialisasi variabel
        etnama = findViewById(R.id.et1);
        etusername = findViewById(R.id.et2);
        image = findViewById(R.id.iv);
        btn = findViewById(R.id.button);

        image.setOnClickListener(view -> {
            Intent open = new Intent(Intent.ACTION_PICK);
            open.setType("image/*"); //menetapkan tipeData
            launcherIntentGallery.launch(open); //hasil
        });

        btn.setOnClickListener(view -> {
            ambilnama = etnama.getText().toString().trim(); //removeSpasi
            ambilusername = etusername.getText().toString().trim();

            if (ambilnama.isEmpty() || ambilusername.isEmpty()) {
                Toast.makeText(this, "isi data", Toast.LENGTH_SHORT).show();
            } else if (imageUri == null) {
                Toast.makeText(this, "Pilih gambar terlebih dahulu", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(this, MainActivity2.class);
                intent.putExtra("ambilnama", ambilnama);
                intent.putExtra("ambilusername", ambilusername);
                intent.putExtra("imageUri", imageUri.toString());
                startActivity(intent);
            }
        });
    }

    ActivityResultLauncher<Intent> launcherIntentGallery = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(), result -> {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    Intent data = result.getData();
                    if (data != null) {
                        imageUri = data.getData();
                        image.setImageURI(imageUri); //menetapkan uri gambar yg dipilih keimageView kemudian ditmpilkan
                    }
                }
            });
}