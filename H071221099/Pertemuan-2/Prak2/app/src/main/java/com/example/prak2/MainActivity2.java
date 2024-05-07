package com.example.prak2;

import android.content.Intent;
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

    EditText edTittle, edContent;
    Button buttonSv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edTittle = findViewById(R.id.editTittle);
        edContent = findViewById(R.id.editContent);
        buttonSv = findViewById(R.id.button2);

        buttonSv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String image = getIntent().getStringExtra("image");
                String input_name = getIntent().getStringExtra("name");
                String input_username = getIntent().getStringExtra("username");
                String input_tittle = edTittle.getText().toString();
                String input_content = edContent.getText().toString();

                if (!input_tittle.isEmpty() && !input_content.isEmpty()){
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("image", image);
                    intent.putExtra("name", input_name);
                    intent.putExtra("username", input_username);
                    intent.putExtra("tittle", input_tittle);
                    intent.putExtra("content", input_content);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity2.this, "tolong di isi kolomnya", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}