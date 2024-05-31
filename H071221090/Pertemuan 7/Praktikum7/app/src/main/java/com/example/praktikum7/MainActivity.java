package com.example.praktikum7;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView et_nim, et_pass;
    private Button btn_login, btn_register;
    public final static String EXTRA_RESULT = "extra_result";
    public static final int RESULT_CODE = 101;
    private final String FIELD_REQUIRED = "Please fill this field!";
    private UserModel userModel;
    private UserPreference userPreference;
    private static final String PREF_NAME = "pref_name";
    SharedPreferences sharedPreferences;
    private static final String PREF_MODE_KEY = "pref_mode_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences(PREF_NAME, MODE_PRIVATE);
        boolean isDarkModeEnabled = sharedPreferences.getBoolean(PREF_MODE_KEY, false);
        if (isDarkModeEnabled) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }

        et_nim = findViewById(R.id.et_nim);
        et_pass = findViewById(R.id.et_pass);
        btn_login = findViewById(R.id.btn_login);
        btn_register = findViewById(R.id.btn_register);
        btn_login.setOnClickListener(this);

        userPreference = new UserPreference(this);

        userModel = getIntent().getParcelableExtra("UserModel");
        if (userModel == null ) {
            userModel = new UserModel();
        }

        btn_register.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_login) {
            String nim = et_nim.getText().toString().trim();
            String pass = et_pass.getText().toString();

            //kondisi klo edit text nim dan pass kosong
            if (TextUtils.isEmpty(nim)) {
                et_nim.setError(FIELD_REQUIRED);
                return;
            }
            if (TextUtils.isEmpty(pass)) {
                et_pass.setError(FIELD_REQUIRED);
                return;
            }

            //cek apkh nim dan pass nya sdh terdftr ato blum
            if (userPreference.isUserRegistered(nim, pass)) {
                //klo terdaftar
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("NIM", nim);
                startActivity(intent);
            } else {
                //klo blum terdaftar
                Toast.makeText(this, "NIM atau Password Salah!", Toast.LENGTH_SHORT).show();
                et_nim.setText("");
                et_pass.setText("");
            }

            // utk mengirim hasil ke Homectivity
            Intent resultIntent = new Intent();
            resultIntent.putExtra(EXTRA_RESULT, userModel);
            setResult(RESULT_CODE, resultIntent);
        }
    }
}