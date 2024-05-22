package com.example.tuprak_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_login, btn_register;
    EditText et_nim, et_password;
    Switch sw_theme;
    SharedPreferences sharedPreferences, theme;
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String DARK_MODE = "darkMode";
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nim = findViewById(R.id.et_nim);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);
        btn_register = findViewById(R.id.btn_register);
        sw_theme = findViewById(R.id.sw_theme);

        checkLoginStatus();

        btn_register.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

        btn_login.setOnClickListener(view -> {
            String nim = et_nim.getText().toString().trim();
            String password = et_password.getText().toString().trim();

            if (!nim.isEmpty() && !password.isEmpty()) {
                boolean isValid = isValidLogin(nim, password);
                if (isValid) {
                    saveLoginStatus(true);
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(MainActivity.this, "Please enter NIM and password", Toast.LENGTH_SHORT).show();
            }
        });

        theme = getSharedPreferences("theme_pref", MODE_PRIVATE);
        editor = theme.edit();

        boolean isDarkTheme = sharedPreferences.getBoolean("is_dark_theme", false);
        sw_theme.setChecked(isDarkTheme);

        sw_theme.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                turnOffLight();
                setSwitchText(true);
                Toast.makeText(MainActivity.this, "It's to dark here, I'm scared...", Toast.LENGTH_SHORT).show();
            } else {
                turnOnLight();
                setSwitchText(false);
                Toast.makeText(MainActivity.this, "It's to shine here, it burned me...", Toast.LENGTH_SHORT).show();
            }
            editor.putBoolean("is_dark_theme", isChecked);
            editor.apply();
        });


        sharedPreferences = getSharedPreferences("theme_pref", MODE_PRIVATE);
        boolean turnOff = sharedPreferences.getBoolean("is_dark_theme", false);
        if (turnOff) {
            setSwitchText(true);
            turnOffLight();
        } else {
            setSwitchText(false);
            turnOnLight();
        }
    }

    private void checkLoginStatus() {
        sharedPreferences = this.getSharedPreferences("user_pref", MODE_PRIVATE);
        boolean isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false);
        if (isLoggedIn) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }

    private boolean isValidLogin(String nim, String password) {
        SharedPreferences sharedPreferences = getSharedPreferences("user_pref", MODE_PRIVATE);
        String inputNIM = sharedPreferences.getString("nim", "");
        String inputPassword = sharedPreferences.getString("password", "");

        return inputNIM.equals(nim) && inputPassword.equals(password);
    }

    private void saveLoginStatus(boolean isLoggedIn) {
        SharedPreferences sharedPreferences = getSharedPreferences("user_pref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("isLoggedIn", isLoggedIn);
        editor.apply();
    }

    private void turnOffLight() {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
    }

    private void turnOnLight() {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    private void setSwitchText(boolean turnOff) {
        if (turnOff) {
            sw_theme.setText("Turn off the light");
        } else {
            sw_theme.setText("Turn on the light");
        }
    }
}