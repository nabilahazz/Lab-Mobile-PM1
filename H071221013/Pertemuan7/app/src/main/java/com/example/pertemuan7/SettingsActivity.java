package com.example.pertemuan7;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class SettingsActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    Switch switchTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        switchTheme = findViewById(R.id.switchTheme);

        //cara untuk mendapatkan nilai tema yang disimpan dari SharedPreferences
        //jika tdk maka nilai default yaitu 0
        int theme = sharedPreferences.getInt("theme", 0);
        switchTheme.setChecked(theme == 1);

        //ketika dinyalakan/matikan, maka akan mengeksekusi code di bwh
        switchTheme.setOnCheckedChangeListener((buttonView, isChecked) -> {
            SharedPreferences.Editor editor = sharedPreferences.edit();

            //jika switch dlm status aktif, maka eksekusi if
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }

            editor.putInt("theme", isChecked ? 1 : 0);
            editor.apply();
        });
    }
}
