package com.example.demo.common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.demo.R;

public class SingUpActivity extends AppCompatActivity {
    Button btnSingIn, btnAccount;
    EditText etFirstName, etSecondName, etEmail, etPassword, etRePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        etEmail = findViewById(R.id.etEmail);
        etFirstName = findViewById(R.id.etFirstName);
        etSecondName = findViewById(R.id.etSecondName);
        etPassword = findViewById(R.id.etPassword);
        etRePassword = findViewById(R.id.etRePassword);
        btnSingIn = findViewById(R.id.btnSingIn);
        btnAccount = findViewById(R.id.btnAccount);

        btnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingUpActivity.this, SingInActivity.class);
                startActivity(intent);
            }
        });
    }
}