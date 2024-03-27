package com.example.tugas_2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    EditText title;
    EditText content;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        title = findViewById(R.id.inputJudul);
        content = findViewById(R.id.inputContent);


        Data inputan = getIntent().getParcelableExtra("data");

        intent = getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("img");

        Context context = new Context();

        Button buttonSave = findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strTitle = title.getText().toString().trim();
                String strContent = content.getText().toString().trim();

                if (TextUtils.isEmpty(strTitle) || TextUtils.isEmpty(strContent)) {
                    Toast.makeText(MainActivity2.this, "Judul dan Konten harus diisi", Toast.LENGTH_SHORT).show();
                } else {
                    context.setTitle(strTitle);
                    context.setContent(strContent);

                    Intent toActivity3 = new Intent(MainActivity2.this, MainActivity3.class);
                    toActivity3.putExtra("img", uri);
                    toActivity3.putExtra("data", inputan);
                    toActivity3.putExtra("context", context);
                    startActivity(toActivity3);
                }
            }
        });
    }
}
