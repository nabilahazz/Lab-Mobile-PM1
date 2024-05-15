package com.example.coba;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayInfo extends AppCompatActivity {

    TextView displayInfo;
    Button setting,logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);
        SharedPreferences preferences = getSharedPreferences("MYPREFS",MODE_PRIVATE);
        String nim = preferences.getString("nim","");

         displayInfo = findViewById(R.id.textViewName);
         displayInfo.setText("Selamat Datang " + nim);
         setting = findViewById(R.id.btn_setting);
         logout = findViewById(R.id.btn_logout);

         setting.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent set = new Intent(DisplayInfo.this,DarkMode.class);
                 startActivity(set);
             }
         });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.remove("nim");
                editor.apply();

                Intent intent = new Intent(DisplayInfo.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

}