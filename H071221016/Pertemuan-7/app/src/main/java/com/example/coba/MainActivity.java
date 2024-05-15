package com.example.coba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_nim,et_password;
    Button login,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nim = findViewById(R.id.et_nim);
        et_password = findViewById(R.id.et_password);
        login = findViewById(R.id.btn_login);
        register = findViewById(R.id.btn_register1);
//
//

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String etnim = et_nim.getText().toString();
                String etpassword = et_password.getText().toString();

                if (etnim.isEmpty() || etpassword.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Mohon masukkan NIM dan kata sandi", Toast.LENGTH_SHORT).show();
                    return;
                }

                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
                String savedPassword = preferences.getString(etnim, "");
                if (savedPassword.equals(etpassword)) {// Memeriksa apakah kata sandi yang dimasukkan oleh pengguna cocok dengan yang disimpan
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("nim", etnim);
                    editor.apply();
                    Intent intent = new Intent(MainActivity.this, DisplayInfo.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "Username dan password tidak cocok", Toast.LENGTH_SHORT).show();
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(register);
            }
        });
    }
}