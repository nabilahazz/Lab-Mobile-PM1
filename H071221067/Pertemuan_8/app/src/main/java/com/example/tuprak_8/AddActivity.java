package com.example.tuprak_8;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class AddActivity extends AppCompatActivity {
    ImageButton ib_back;
    Button btn_submit;
    TextInputLayout textInputLayout_judul, textInputLayout_deskripsi;
    DBConfig dbConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        dbConfig = new DBConfig(this);

        btn_submit = findViewById(R.id.btn_submit);
        textInputLayout_judul = findViewById(R.id.titleInput);
        textInputLayout_deskripsi = findViewById(R.id.descInput);

        ib_back = findViewById(R.id.btn_back);

        ib_back.setOnClickListener(v ->
                showExitConfirmationDialog());

        btn_submit.setOnClickListener(v -> {
            String judul = textInputLayout_judul.getEditText().getText().toString().trim();
            String deskripsi = textInputLayout_deskripsi.getEditText().getText().toString().trim();

            if (judul.isEmpty() ) {
                textInputLayout_judul.setError("Please enter your Judul");
            } else {
                dbConfig.insertData(judul, deskripsi);
                Toast.makeText(AddActivity.this, "Note added successfully", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

    private void showExitConfirmationDialog() {
        new AlertDialog.Builder(this)
                .setTitle("Cancel")
                .setMessage("Apakah anda ingin membatalkan penambahan pada form?")
                .setNegativeButton("No", (dialog, which) -> dialog.dismiss())
                .setPositiveButton("Yes", (dialog, which) -> {
                    dialog.dismiss();
                    super.onBackPressed();
                })
                .create()
                .show();
    }

    @Override
    public void onBackPressed() {
        showExitConfirmationDialog();
    }
}