package com.BadriatunNabila;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.BadriatunNabila.database.LoginDatabase;
import com.BadriatunNabila.entity.LoginEntity;

import java.util.List;

public class DatabaseLoginActivity extends AppCompatActivity {

    private LoginDatabase db;
    private TextView loginDataTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_login);

        loginDataTextView = findViewById(R.id.loginDataTextView);
        db = LoginDatabase.getDatabase(getApplicationContext());

        loadLoginData();
    }

    private void loadLoginData() {
        new Thread(() -> {
            List<LoginEntity> loginEntities = db.loginDao().getAllLogins();
            runOnUiThread(() -> {
                StringBuilder data = new StringBuilder();
                for (LoginEntity login : loginEntities) {
                    data.append("Username: ").append(login.getUsername())
                            .append("\nPassword: ").append(login.getPassword()).append("\n\n");
                }
                loginDataTextView.setText(data.toString());
            });
        }).start();
    }
}