package com.example.pertemuan7;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText editTextNIM, editTextPassword;
    Button buttonRegisterUser;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        editTextNIM = findViewById(R.id.et_NIMRegister);
        editTextPassword = findViewById(R.id.et_PwRegister);
        buttonRegisterUser = findViewById(R.id.btn_RegisterUser);

        buttonRegisterUser.setOnClickListener(v -> {
            String nim = editTextNIM.getText().toString();
            String password = editTextPassword.getText().toString();

            if (nim.isEmpty()) {
                editTextNIM.setError("NIM cannot be empty");
                return;
            }
            if (password.isEmpty()) {
                editTextPassword.setError("Password cannot be empty");
                return;
            }

            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("NIM", nim);
            editor.putString("Password", password);
            editor.apply();

            Toast.makeText(RegisterActivity.this, "Successfully registered", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(RegisterActivity.this, MainActivity.class));
            finish();
        });
    }
}