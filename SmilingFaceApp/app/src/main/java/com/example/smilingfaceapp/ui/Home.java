package com.example.smilingfaceapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.smilingfaceapp.R;

public class Home extends AppCompatActivity {

    Button home_signin, home_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        home_signin = findViewById(R.id.home_signin);
        home_register = findViewById(R.id.home_register);

        home_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, SignIn.class));
            }
        });

        home_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Register.class));
            }
        });
    }
}