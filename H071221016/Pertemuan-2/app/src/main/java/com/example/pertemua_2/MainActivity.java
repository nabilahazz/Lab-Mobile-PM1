package com.example.pertemua_2;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edNama,edUsername;
    Button Btnsubmit ;
    private Uri image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama = findViewById(R.id.Nama);
        edUsername = findViewById(R.id.Username);
        Btnsubmit = findViewById(R.id.btnsubmit);
        ImageView gambar = findViewById(R.id.gambar);

        ActivityResultLauncher<Intent> launcherIntentGallery = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), result -> {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        image = data.getData();
                        gambar.setImageURI(image);
                    }
                }
        );

        gambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openGallery = new Intent(Intent.ACTION_PICK);
                openGallery.setType("image/*");
                launcherIntentGallery.launch(openGallery);
            }
        });


        Btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = edNama.getText().toString();
                String username = edUsername.getText().toString();

                if (!nama.isEmpty() && !username.isEmpty()){
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("nama", nama);
                    intent.putExtra("username", username);

                    if (image != null){
                        intent.putExtra("image",image.toString());
                    }
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this,"Harap Lengkapi",Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}