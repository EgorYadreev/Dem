package com.example.demo.common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.demo.R;

public class SingInActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;
    private Button singup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_in);

        username = (EditText) findViewById(R.id.etEmail1);
        password = (EditText) findViewById(R.id.etPassword1);
        login = (Button) findViewById(R.id.btnSingIn1);
        singup = (Button) findViewById(R.id.btnSingUp1);

        singup.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view) {
                Intent intent = new Intent(SingInActivity.this, SingUpActivity.class);
                startActivity(intent);
            }
        });
    }
}