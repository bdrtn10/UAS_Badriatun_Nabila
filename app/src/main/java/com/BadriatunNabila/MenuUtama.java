package com.BadriatunNabila;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuUtama extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuUtama.this, WisataAlam.class));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuUtama.this, WisataEdukasi.class));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuUtama.this, WisataReligi.class));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuUtama.this, WisataKuliner.class));
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuUtama.this, About.class));
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kode untuk membuka kamera di sini
                // Gantikan "KameraActivity.class" dengan nama activity untuk membuka kamera
                startActivity(new Intent(MenuUtama.this, Camera.class));
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kode untuk membuka maps di sini
                // Gantikan "MapsActivity.class" dengan nama activity untuk membuka maps
                startActivity(new Intent(MenuUtama.this, Maps.class));
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Keluar dari aplikasi
                finishAffinity();
            }
        });

        button9.setOnClickListener(v -> {
            Intent databaseLoginIntent = new Intent(MenuUtama.this, DatabaseLoginActivity.class);
            startActivity(databaseLoginIntent);
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent apiIntent = new Intent(MenuUtama.this, Api.class);
                startActivity(apiIntent);
            }
        });
    }
}
