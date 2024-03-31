package com.example.prak2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edName, edUsername;
    ImageView imageView;
    Uri image;
    Button btnsubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edName = findViewById(R.id.editname);
        edUsername = findViewById(R.id.edituser);
        imageView = findViewById(R.id.image1);
        btnsubmit = findViewById(R.id.btn1);

        ActivityResultLauncher<Intent> LauncherIntentGallery = registerForActivityResult( //StartActivityForResult digunakan, yang memungkinkan kita untuk memulai aktivitas untuk mendapatkan hasil baliknya.
                new ActivityResultContracts.StartActivityForResult(), result -> {
                    if (result.getResultCode()== Activity.RESULT_OK) { //jika hasilnya result ok, maka akan mengambil data yang dikirimkan kembali oleh aktivitas tersebut.
                        Intent data = result.getData(); //data ini adalah data uri yang dipilih dari galleru. Kemudian, URI gambar tersebut ditetapkan ke imageView untuk ditampilkan di aplikasi.
                        image = data.getData();
                        imageView.setImageURI(image);
                    }
                }
        );

        imageView.setOnClickListener(view -> {
            Intent openGallery = new Intent(Intent.ACTION_PICK);
            openGallery.setType("image/*");
            LauncherIntentGallery.launch(openGallery);
        });

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edName.getText().toString();
                String username = edUsername.getText().toString();

                if (!name.isEmpty() && !username.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("name", name);
                    intent.putExtra("username", username);

                    if (image != null) {
                        intent.putExtra("image", image.toString());
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "tolong di isi gambarnya", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "tolong di isi kolomnya", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}