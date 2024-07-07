package com.BadriatunNabila;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Camera extends AppCompatActivity {
    Button btYes, btNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        btYes = findViewById(R.id.btYes);
        btNo = findViewById(R.id.btNo);

        btYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code untuk membuka kamera
                // Anda dapat menambahkan kode untuk membuka kamera di sini

                // Misalnya:
                Toast.makeText(Camera.this, "Kamera dibuka", Toast.LENGTH_SHORT).show();
            }
        });

        btNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kembali ke menu sebelumnya
                finish();
                Toast.makeText(Camera.this, "Anda akan kembali ke menu sebelumnya", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
