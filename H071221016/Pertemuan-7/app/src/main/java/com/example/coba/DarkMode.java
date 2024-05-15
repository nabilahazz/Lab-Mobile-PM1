package com.example.coba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class DarkMode extends AppCompatActivity {

    private Switch themeSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Retrieve the shared preferences and apply the theme before setting the content view
        SharedPreferences modePreferences = getSharedPreferences("mode_pref", MODE_PRIVATE);
        boolean DarkTheme = modePreferences.getBoolean("dark_theme", false);

        if (DarkTheme) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }

        // Now set the content view
        setContentView(R.layout.activity_dark_mode);

        themeSwitch = findViewById(R.id.theme_switch);
        themeSwitch.setChecked(DarkTheme);

        themeSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }

                SharedPreferences.Editor editor = modePreferences.edit();
                editor.putBoolean("dark_theme", isChecked);
                editor.apply();
            }
        });
    }

//        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
//            themeSwitch.setChecked(true);
//        }
//
//        themeSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//                    recreate(); // Re-create activity untuk menerapkan tema gelap
//                } else {
//                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//                    recreate(); // Re-create activity untuk menerapkan tema terang
//                }
//            }
//   });
//    }
}