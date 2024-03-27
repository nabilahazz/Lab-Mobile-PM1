package com.example.tugas_2;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    ImageView buttonGallery;
    EditText nama, username;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGallery = findViewById(R.id.gallery);
        buttonGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent upload = new Intent();
                upload.setAction(Intent.ACTION_GET_CONTENT);
                upload.setType("image/*");
                startActivityForResult(upload, 1);
            }
        });

        nama = findViewById(R.id.inputNama);
        username = findViewById(R.id.inputUsername);

        Button buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNama = nama.getText().toString().trim();
                String strUsername = username.getText().toString().trim();

                if (TextUtils.isEmpty(strNama) || TextUtils.isEmpty(strUsername)) {
                    Toast.makeText(MainActivity.this, "Nama dan Username harus diisi", Toast.LENGTH_SHORT).show();
                } else {
                    if (uri == null) {
                        Toast.makeText(MainActivity.this, "Pilih Gambar telebih Dahulu", Toast.LENGTH_SHORT).show();
                    } else {
                        Intent toActivity2 = new Intent(MainActivity.this, MainActivity2.class);

                        Data inputan = new Data();
                        inputan.setNama(strNama);
                        inputan.setUsername(strUsername);
                        toActivity2.putExtra("data", inputan);
                        toActivity2.putExtra("img", uri);
                        startActivity(toActivity2);
                    }
                }
            }

        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && data != null) {
            uri = data.getData();
            buttonGallery.setImageURI(uri);
        }
    }
}
