package com.example.group15_capstone.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.group15_capstone.R;

public class LogIn extends AppCompatActivity {

    private EditText usernameField, studentIdField;
    private Button loginButton;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        //EditText
        usernameField = findViewById(R.id.usernameField);
        studentIdField = findViewById(R.id.studentIdField);

        //SharedPreferences
        sp = getSharedPreferences("StoredData", Context.MODE_PRIVATE);
        editor = sp.edit();

        //Button
        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(view -> {
            try {
                editor.putString("Username", String.valueOf(usernameField.getText()));
                editor.putInt("StudentId", Integer.parseInt(String.valueOf(studentIdField.getText())));
                editor.apply();
                Intent intent = new Intent(LogIn.this, MainMenu.class);
                startActivity(intent);
                finish();
            } catch (Exception e) {
                usernameField.setText("");
                studentIdField.setText("");
            }
        });
    }
}