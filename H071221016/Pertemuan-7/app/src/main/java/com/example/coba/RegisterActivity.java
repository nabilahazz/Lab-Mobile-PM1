package com.example.coba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText etnim = findViewById(R.id.et_nim);
        EditText etpassword = findViewById(R.id.et_password);
        Button btn_register = findViewById(R.id.btn_register2);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
                String nim = etnim.getText().toString();
                String password = etpassword.getText().toString();

                if (nim.isEmpty() || password.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Harap isi kedua field", Toast.LENGTH_SHORT).show();
                }else {
                    SharedPreferences.Editor editor = preferences.edit();

                    editor.clear();
                    editor.apply();
                    editor.putString(nim, password);
                    editor.apply();

                    Toast.makeText(RegisterActivity.this, "Berhasil Membuat Akun", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }
}