package com.example.pertemuan2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private EditText ettitle;
    private EditText etcontent;
    private Button btn2;

    private String ambiljudul;
    private String ambilkonten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

//        menginisialisasi variabel
        ettitle = findViewById(R.id.etx);
        etcontent = findViewById(R.id.etx1);
        btn2 = findViewById(R.id.button2);

        btn2.setOnClickListener(view -> {
            ambiljudul = ettitle.getText().toString().trim();
            ambilkonten = etcontent.getText().toString().trim();

            if (ambiljudul.isEmpty() || ambilkonten.isEmpty()) {
                Toast.makeText(this, "Isi semua field", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(this, MainActivity3.class);
                // Meneruskan data ke MainActivity3
                intent.putExtra("ambilnama", getIntent().getStringExtra("ambilnama"));
                intent.putExtra("ambilusername", getIntent().getStringExtra("ambilusername"));
                intent.putExtra("ambiljudul", ambiljudul);
                intent.putExtra("ambilkonten", ambilkonten);
                // Meneruskan data gambar dari MainActivity
                intent.putExtra("imageUri", getIntent().getStringExtra("imageUri"));
                startActivity(intent);
            }
        });
    }
}