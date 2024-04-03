package com.example.pertemua_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText edTitle,edContent;
    Button btnSave;
//    Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edTitle = findViewById(R.id.Title);
        edContent = findViewById(R.id.Content);
        btnSave = findViewById(R.id.btnsave);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = edTitle.getText().toString();
                String content = edContent.getText().toString();
                String gambar = getIntent().getStringExtra("image");
                String nama = getIntent().getStringExtra("nama");
                String username = getIntent().getStringExtra("username");


                User user2 = new User(title,content);
                if (!title.isEmpty() && !content.isEmpty()){
                    Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                    intent.putExtra("nama", nama);
                    intent.putExtra("username", username);
                    intent.putExtra("title", title);
                    intent.putExtra("content", content);
                    intent.putExtra("image",gambar);
                    startActivity(intent);

                }else {
                    Toast.makeText(MainActivity2.this,"Harap Lengkapi",Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
}