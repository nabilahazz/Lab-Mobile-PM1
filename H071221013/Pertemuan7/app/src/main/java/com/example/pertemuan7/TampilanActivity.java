package com.example.pertemuan7;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class TampilanActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    Button buttonLogout,buttonSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        TextView textViewWelcome = findViewById(R.id.tvWelcome);
        buttonLogout = findViewById(R.id.buttonLogout);
        buttonSettings = findViewById(R.id.buttonSettings);

        String nim = sharedPreferences.getString("NIM", "");
        textViewWelcome.setText("Selamat Datang " + nim);

        int currentNightMode = getResources().getConfiguration().uiMode & android.content.res.Configuration.UI_MODE_NIGHT_MASK;
        if (currentNightMode == android.content.res.Configuration.UI_MODE_NIGHT_YES) {
            textViewWelcome.setTextColor(ContextCompat.getColor(TampilanActivity.this, R.color.white));
        } else {
            textViewWelcome.setTextColor(ContextCompat.getColor(TampilanActivity.this, R.color.black));
        }

        buttonLogout.setOnClickListener(v -> {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("isLoggedIn", false);
            editor.apply();

            startActivity(new Intent(TampilanActivity.this, MainActivity.class));
            finish();
        });

        buttonSettings.setOnClickListener(v -> startActivity(new Intent(TampilanActivity.this, SettingsActivity.class)));

    }
}
