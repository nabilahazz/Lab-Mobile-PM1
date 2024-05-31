package com.example.praktikum7;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView et_nim, et_pass;
    private Button btn_register;
    private final String FIELD_REQUIRED = "Please fill this field!";
    private UserPreference userPreference;
    private UserModel userModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        et_nim = findViewById(R.id.et_nim);
        et_pass = findViewById(R.id.et_pass);
        btn_register = findViewById(R.id.btn_register);
        btn_register.setOnClickListener(this);

        userPreference = new UserPreference(this);

        userModel = getIntent().getParcelableExtra("UserModel");
        if (userModel == null ) {
            userModel = new UserModel();
        }
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_register) {
            String nim = et_nim.getText().toString().trim();
            String pass = et_pass.getText().toString();

            //kondisi klo edit text nim dan passsword kosong
            if (TextUtils.isEmpty(nim)) {
                et_nim.setError(FIELD_REQUIRED);
                return;
            }
            if (TextUtils.isEmpty(pass)) {
                et_pass.setError(FIELD_REQUIRED);
                return;
            }

            //utk simpan akun pengguna baru dan timpa akun sebelumnya
            userPreference.saveNewUser(nim, pass);

            Toast.makeText(this," User Berhasi Terdaftar!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}